package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AdjustInventoryCommand {

    private String inventoryId;
    private Integer quantity;
}
