package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryChecked extends AbstractEvent {

    private String inventoryId;
    private String fishType;
    private Integer quantity;
    private String location;

    public InventoryChecked(FishInventory aggregate) {
        super(aggregate);
    }

    public InventoryChecked() {
        super();
    }
}
//>>> DDD / Domain Event
