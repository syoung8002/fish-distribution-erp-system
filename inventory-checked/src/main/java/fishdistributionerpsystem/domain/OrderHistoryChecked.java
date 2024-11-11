package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderHistoryChecked extends AbstractEvent {

    private String orderId;
    private String customerName;
    private Date orderDate;
}
