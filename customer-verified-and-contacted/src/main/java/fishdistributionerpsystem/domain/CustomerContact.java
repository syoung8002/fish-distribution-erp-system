package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.CustomerVerifiedAndContactedApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CustomerContact_table")
@Data
//<<< DDD / Aggregate Root
public class CustomerContact {

    @Id
    private String contactId;

    private String orderId;

    private String customerName;

    private String contactStatus;

    @PrePersist
    public void onPrePersist() {}

    public static CustomerContactRepository repository() {
        CustomerContactRepository customerContactRepository = CustomerVerifiedAndContactedApplication.applicationContext.getBean(
            CustomerContactRepository.class
        );
        return customerContactRepository;
    }

    //<<< Clean Arch / Port Method
    public void verifyAndContactCustomer(
        VerifyAndContactCustomerCommand verifyAndContactCustomerCommand
    ) {
        //implement business logic here:

        CustomerVerifiedAndContacted customerVerifiedAndContacted = new CustomerVerifiedAndContacted(
            this
        );
        customerVerifiedAndContacted.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
