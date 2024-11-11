package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.ExpirationDateManagedApplication;
import fishdistributionerpsystem.domain.ExpirationDateManaged;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Fish_table")
@Data
//<<< DDD / Aggregate Root
public class Fish {

    @Id
    private String fishId;

    private String fishType;

    private Date expirationDate;

    @PostPersist
    public void onPostPersist() {
        ExpirationDateManaged expirationDateManaged = new ExpirationDateManaged(
            this
        );
        expirationDateManaged.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FishRepository repository() {
        FishRepository fishRepository = ExpirationDateManagedApplication.applicationContext.getBean(
            FishRepository.class
        );
        return fishRepository;
    }
}
//>>> DDD / Aggregate Root
