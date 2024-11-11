package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FishDispatchedAndDelivered extends AbstractEvent {

    private String deliveryId;
    private String orderId;
    private String deliveryStatus;

    public FishDispatchedAndDelivered(FishDelivery aggregate) {
        super(aggregate);
    }

    public FishDispatchedAndDelivered() {
        super();
    }
}
//>>> DDD / Domain Event
