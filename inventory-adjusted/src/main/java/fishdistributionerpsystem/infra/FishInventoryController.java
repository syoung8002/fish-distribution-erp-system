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
// @RequestMapping(value="/fishInventories")
@Transactional
public class FishInventoryController {

    @Autowired
    FishInventoryRepository fishInventoryRepository;

    @RequestMapping(
        value = "/fishInventories/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FishInventory adjustFishInventory(
        @PathVariable(value = "id") String id,
        @RequestBody AdjustFishInventoryCommand adjustFishInventoryCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /fishInventory/adjustFishInventory  called #####"
        );
        Optional<FishInventory> optionalFishInventory = fishInventoryRepository.findById(
            id
        );

        optionalFishInventory.orElseThrow(() -> new Exception("No Entity Found")
        );
        FishInventory fishInventory = optionalFishInventory.get();
        fishInventory.adjustFishInventory(adjustFishInventoryCommand);

        fishInventoryRepository.save(fishInventory);
        return fishInventory;
    }
}
//>>> Clean Arch / Inbound Adaptor
