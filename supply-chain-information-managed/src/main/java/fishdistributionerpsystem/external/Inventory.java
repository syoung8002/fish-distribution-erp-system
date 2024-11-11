package fishdistributionerpsystem.external;

import java.util.Date;
import lombok.Data;

@Data
public class Inventory {

    private String inventoryId;
    private String fishType;
    private Integer quantity;
}
