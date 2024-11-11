package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AdjustFishInventoryCommand {

    private String inventoryId;
    private Integer quantity;
}
