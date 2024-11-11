package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "fishDeliveries",
    path = "fishDeliveries"
)
public interface FishDeliveryRepository
    extends PagingAndSortingRepository<FishDelivery, String> {}
