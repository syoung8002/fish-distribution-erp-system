package fishdistributionerpsystem.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
    name = "production-plan-managed",
    url = "${api.url.production-plan-managed}"
)
public interface ProductionPlanService {
    @RequestMapping(method = RequestMethod.POST, path = "/productionPlans")
    public void manageProductionPlan(
        @RequestBody ProductionPlan productionPlan
    );
}
