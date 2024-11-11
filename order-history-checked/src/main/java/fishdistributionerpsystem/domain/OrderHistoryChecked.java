package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderHistoryChecked extends AbstractEvent {

    private String orderId;
    private String customerName;
    private Date orderDate;

    public OrderHistoryChecked(OrderHistory aggregate) {
        super(aggregate);
    }

    public OrderHistoryChecked() {
        super();
    }
}
//>>> DDD / Domain Event
