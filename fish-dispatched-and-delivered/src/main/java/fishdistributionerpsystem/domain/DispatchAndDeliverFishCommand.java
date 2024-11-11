package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DispatchAndDeliverFishCommand {

    private String deliveryId;
    private String orderId;
    private String deliveryStatus;
}
