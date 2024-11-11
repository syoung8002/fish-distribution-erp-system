package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.FishDispatchedAndDeliveredApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FishDelivery_table")
@Data
//<<< DDD / Aggregate Root
public class FishDelivery {

    @Id
    private String deliveryId;

    private String orderId;

    private String deliveryStatus;

    @PrePersist
    public void onPrePersist() {}

    public static FishDeliveryRepository repository() {
        FishDeliveryRepository fishDeliveryRepository = FishDispatchedAndDeliveredApplication.applicationContext.getBean(
            FishDeliveryRepository.class
        );
        return fishDeliveryRepository;
    }

    //<<< Clean Arch / Port Method
    public void dispatchAndDeliverFish(
        DispatchAndDeliverFishCommand dispatchAndDeliverFishCommand
    ) {
        //implement business logic here:

        FishDispatchedAndDelivered fishDispatchedAndDelivered = new FishDispatchedAndDelivered(
            this
        );
        fishDispatchedAndDelivered.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
