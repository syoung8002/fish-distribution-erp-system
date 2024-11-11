package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "customerContacts",
    path = "customerContacts"
)
public interface CustomerContactRepository
    extends PagingAndSortingRepository<CustomerContact, String> {}
