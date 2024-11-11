package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class VerifyAndContactCustomerCommand {

    private String contactId;
    private String orderId;
    private String customerName;
    private String contactStatus;
}
