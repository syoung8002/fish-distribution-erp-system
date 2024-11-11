package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductionPlanManaged extends AbstractEvent {

    private String planId;
    private String fishType;
    private String status;

    public ProductionPlanManaged(ProductionPlan aggregate) {
        super(aggregate);
    }

    public ProductionPlanManaged() {
        super();
    }
}
//>>> DDD / Domain Event
