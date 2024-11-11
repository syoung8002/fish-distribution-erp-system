package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FishHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Fish>> {

    @Override
    public EntityModel<Fish> process(EntityModel<Fish> model) {
        return model;
    }
}
