package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryMonitored extends AbstractEvent {

    private String inventoryId;
    private String fishType;
    private Integer quantity;

    public InventoryMonitored(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryMonitored() {
        super();
    }
}
//>>> DDD / Domain Event
