package fishdistributionerpsystem.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class ManageProductionPlanCommand {

    @Id
    private String planId;

    private String fishType;
    private String status;
}
