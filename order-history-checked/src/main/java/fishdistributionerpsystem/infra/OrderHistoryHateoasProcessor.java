package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class OrderHistoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<OrderHistory>> {

    @Override
    public EntityModel<OrderHistory> process(EntityModel<OrderHistory> model) {
        return model;
    }
}
