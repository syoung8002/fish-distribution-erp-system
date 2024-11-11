package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.InventoryCheckedApplication;
import fishdistributionerpsystem.domain.InventoryChecked;
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

    @PostPersist
    public void onPostPersist() {
        InventoryChecked inventoryChecked = new InventoryChecked(this);
        inventoryChecked.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FishInventoryRepository repository() {
        FishInventoryRepository fishInventoryRepository = InventoryCheckedApplication.applicationContext.getBean(
            FishInventoryRepository.class
        );
        return fishInventoryRepository;
    }
}
//>>> DDD / Aggregate Root
