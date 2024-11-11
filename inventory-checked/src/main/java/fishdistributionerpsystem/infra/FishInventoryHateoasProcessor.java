package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FishInventoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FishInventory>> {

    @Override
    public EntityModel<FishInventory> process(
        EntityModel<FishInventory> model
    ) {
        return model;
    }
}
