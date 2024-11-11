package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.OrderHistoryCheckedApplication;
import fishdistributionerpsystem.domain.OrderHistoryChecked;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "OrderHistory_table")
@Data
//<<< DDD / Aggregate Root
public class OrderHistory {

    @Id
    private String orderId;

    private String customerName;

    private Date orderDate;

    @PostPersist
    public void onPostPersist() {
        OrderHistoryChecked orderHistoryChecked = new OrderHistoryChecked(this);
        orderHistoryChecked.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderHistoryRepository repository() {
        OrderHistoryRepository orderHistoryRepository = OrderHistoryCheckedApplication.applicationContext.getBean(
            OrderHistoryRepository.class
        );
        return orderHistoryRepository;
    }
}
//>>> DDD / Aggregate Root
