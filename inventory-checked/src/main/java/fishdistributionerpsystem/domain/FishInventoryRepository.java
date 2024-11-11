package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "fishInventories",
    path = "fishInventories"
)
public interface FishInventoryRepository
    extends PagingAndSortingRepository<FishInventory, String> {}
