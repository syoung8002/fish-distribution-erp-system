package fishdistributionerpsystem.infra;

import fishdistributionerpsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SupplyChainInformationHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<SupplyChainInformation>> {

    @Override
    public EntityModel<SupplyChainInformation> process(
        EntityModel<SupplyChainInformation> model
    ) {
        return model;
    }
}
