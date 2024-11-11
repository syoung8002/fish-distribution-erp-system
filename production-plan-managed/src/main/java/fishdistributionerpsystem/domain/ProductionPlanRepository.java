package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "productionPlans",
    path = "productionPlans"
)
public interface ProductionPlanRepository
    extends PagingAndSortingRepository<ProductionPlan, String> {}
