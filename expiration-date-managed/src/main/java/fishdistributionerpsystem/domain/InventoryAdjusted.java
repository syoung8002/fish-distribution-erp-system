package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InventoryAdjusted extends AbstractEvent {

    private String inventoryId;
    private Integer quantity;
}
