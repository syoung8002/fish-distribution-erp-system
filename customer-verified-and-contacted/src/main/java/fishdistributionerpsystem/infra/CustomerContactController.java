package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/customerContacts")
@Transactional
public class CustomerContactController {

    @Autowired
    CustomerContactRepository customerContactRepository;

    @RequestMapping(
        value = "/customerContacts/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public CustomerContact verifyAndContactCustomer(
        @PathVariable(value = "id") String id,
        @RequestBody VerifyAndContactCustomerCommand verifyAndContactCustomerCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /customerContact/verifyAndContactCustomer  called #####"
        );
        Optional<CustomerContact> optionalCustomerContact = customerContactRepository.findById(
            id
        );

        optionalCustomerContact.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        CustomerContact customerContact = optionalCustomerContact.get();
        customerContact.verifyAndContactCustomer(
            verifyAndContactCustomerCommand
        );

        customerContactRepository.save(customerContact);
        return customerContact;
    }
}
//>>> Clean Arch / Inbound Adaptor
