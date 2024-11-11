package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CustomerVerifiedAndContacted extends AbstractEvent {

    private String contactId;
    private String orderId;
    private String customerName;
    private String contactStatus;

    public CustomerVerifiedAndContacted(CustomerContact aggregate) {
        super(aggregate);
    }

    public CustomerVerifiedAndContacted() {
        super();
    }
}
//>>> DDD / Domain Event
