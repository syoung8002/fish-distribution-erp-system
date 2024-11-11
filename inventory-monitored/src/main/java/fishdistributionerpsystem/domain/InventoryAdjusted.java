package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryAdjusted extends AbstractEvent {

    private String inventoryId;
    private Integer quantity;

    public InventoryAdjusted(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryAdjusted() {
        super();
    }
}
//>>> DDD / Domain Event
