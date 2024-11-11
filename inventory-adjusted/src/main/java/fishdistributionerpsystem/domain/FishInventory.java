package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.InventoryAdjustedApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FishInventory_table")
@Data
//<<< DDD / Aggregate Root
public class FishInventory {

    @Id
    private String inventoryId;

    private String fishType;

    private Integer quantity;

    private String location;

    @PrePersist
    public void onPrePersist() {}

    public static FishInventoryRepository repository() {
        FishInventoryRepository fishInventoryRepository = InventoryAdjustedApplication.applicationContext.getBean(
            FishInventoryRepository.class
        );
        return fishInventoryRepository;
    }

    //<<< Clean Arch / Port Method
    public void adjustFishInventory(
        AdjustFishInventoryCommand adjustFishInventoryCommand
    ) {
        //implement business logic here:

        InventoryAdjusted inventoryAdjusted = new InventoryAdjusted(this);
        inventoryAdjusted.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
