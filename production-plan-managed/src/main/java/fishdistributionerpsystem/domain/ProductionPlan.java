package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.ProductionPlanManagedApplication;
import fishdistributionerpsystem.domain.ProductionPlanManaged;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ProductionPlan_table")
@Data
//<<< DDD / Aggregate Root
public class ProductionPlan {

    @Id
    private String planId;

    private String fishType;

    private String status;

    @PostPersist
    public void onPostPersist() {
        ProductionPlanManaged productionPlanManaged = new ProductionPlanManaged(
            this
        );
        productionPlanManaged.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ProductionPlanRepository repository() {
        ProductionPlanRepository productionPlanRepository = ProductionPlanManagedApplication.applicationContext.getBean(
            ProductionPlanRepository.class
        );
        return productionPlanRepository;
    }
}
//>>> DDD / Aggregate Root
