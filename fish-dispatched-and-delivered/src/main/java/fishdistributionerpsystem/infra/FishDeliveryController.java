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
// @RequestMapping(value="/fishDeliveries")
@Transactional
public class FishDeliveryController {

    @Autowired
    FishDeliveryRepository fishDeliveryRepository;

    @RequestMapping(
        value = "/fishDeliveries/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FishDelivery dispatchAndDeliverFish(
        @PathVariable(value = "id") String id,
        @RequestBody DispatchAndDeliverFishCommand dispatchAndDeliverFishCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /fishDelivery/dispatchAndDeliverFish  called #####"
        );
        Optional<FishDelivery> optionalFishDelivery = fishDeliveryRepository.findById(
            id
        );

        optionalFishDelivery.orElseThrow(() -> new Exception("No Entity Found")
        );
        FishDelivery fishDelivery = optionalFishDelivery.get();
        fishDelivery.dispatchAndDeliverFish(dispatchAndDeliverFishCommand);

        fishDeliveryRepository.save(fishDelivery);
        return fishDelivery;
    }
}
//>>> Clean Arch / Inbound Adaptor
