package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.InventoryMonitoredApplication;
import fishdistributionerpsystem.domain.InventoryMonitored;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Inventory_table")
@Data
//<<< DDD / Aggregate Root
public class Inventory {

    @Id
    private String inventoryId;

    private String fishType;

    private Integer quantity;

    @PostPersist
    public void onPostPersist() {
        InventoryMonitored inventoryMonitored = new InventoryMonitored(this);
        inventoryMonitored.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static InventoryRepository repository() {
        InventoryRepository inventoryRepository = InventoryMonitoredApplication.applicationContext.getBean(
            InventoryRepository.class
        );
        return inventoryRepository;
    }

    //<<< Clean Arch / Port Method
    public void adjustInventory(AdjustInventoryCommand adjustInventoryCommand) {
        //implement business logic here:

        InventoryAdjusted inventoryAdjusted = new InventoryAdjusted(this);
        inventoryAdjusted.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
