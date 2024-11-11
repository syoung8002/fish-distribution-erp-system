package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.SupplyChainInformationManagedApplication;
import fishdistributionerpsystem.domain.SupplyChainInformationManaged;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SupplyChainInformation_table")
@Data
//<<< DDD / Aggregate Root
public class SupplyChainInformation {

    @Id
    private String informationId;

    private String informationType;

    private String informationData;

    @PostPersist
    public void onPostPersist() {
        SupplyChainInformationManaged supplyChainInformationManaged = new SupplyChainInformationManaged(
            this
        );
        supplyChainInformationManaged.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SupplyChainInformationRepository repository() {
        SupplyChainInformationRepository supplyChainInformationRepository = SupplyChainInformationManagedApplication.applicationContext.getBean(
            SupplyChainInformationRepository.class
        );
        return supplyChainInformationRepository;
    }

    //<<< Clean Arch / Port Method
    public static void supplyChainInformationPolicy(
        SupplyChainInformationManaged supplyChainInformationManaged
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        SupplyChainInformation supplyChainInformation = new SupplyChainInformation();
        repository().save(supplyChainInformation);

        */

        /** Example 2:  finding and process
        
        repository().findById(supplyChainInformationManaged.get???()).ifPresent(supplyChainInformation->{
            
            supplyChainInformation // do something
            repository().save(supplyChainInformation);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
