package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "fish", path = "fish")
public interface FishRepository
    extends PagingAndSortingRepository<Fish, String> {}
