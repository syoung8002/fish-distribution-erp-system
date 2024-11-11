package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CustomerVerifiedAndContacted extends AbstractEvent {

    private String contactId;
    private String orderId;
    private String customerName;
    private String contactStatus;
}
