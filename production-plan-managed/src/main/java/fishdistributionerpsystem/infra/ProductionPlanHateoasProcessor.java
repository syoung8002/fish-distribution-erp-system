package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProductionPlanHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ProductionPlan>> {

    @Override
    public EntityModel<ProductionPlan> process(
        EntityModel<ProductionPlan> model
    ) {
        return model;
    }
}
