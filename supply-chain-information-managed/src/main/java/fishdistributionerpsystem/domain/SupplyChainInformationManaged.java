package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SupplyChainInformationManaged extends AbstractEvent {

    private String informationId;
    private String informationType;
    private String informationData;

    public SupplyChainInformationManaged(SupplyChainInformation aggregate) {
        super(aggregate);
    }

    public SupplyChainInformationManaged() {
        super();
    }
}
//>>> DDD / Domain Event
