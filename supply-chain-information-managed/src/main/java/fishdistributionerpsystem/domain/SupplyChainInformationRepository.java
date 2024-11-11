package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "supplyChainInformations",
    path = "supplyChainInformations"
)
public interface SupplyChainInformationRepository
    extends PagingAndSortingRepository<SupplyChainInformation, String> {}
