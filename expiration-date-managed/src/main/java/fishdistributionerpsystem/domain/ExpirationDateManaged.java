package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ExpirationDateManaged extends AbstractEvent {

    private String fishId;
    private String fishType;
    private Date expirationDate;

    public ExpirationDateManaged(Fish aggregate) {
        super(aggregate);
    }

    public ExpirationDateManaged() {
        super();
    }
}
//>>> DDD / Domain Event
