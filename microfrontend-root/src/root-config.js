import { registerApplication, start } from 'single-spa';
import {
  constructApplications,
  constructRoutes,
  constructLayoutEngine,
} from 'single-spa-layout';

const routes = constructRoutes(`
<single-spa-router mode="hash" base="/">
  <route default>
    <application name="@my-app/home"></application>
  </route>
  <route path="supplyChainInformationManageds">
    <application name="@my-app/supply-chain-information-managed"></application>
  </route>
  <route path="inventoryMonitoreds">
    <application name="@my-app/inventory-monitored"></application>
  </route>
  <route path="productionPlanManageds">
    <application name="@my-app/production-plan-managed"></application>
  </route>
  <route path="orderCreateds">
    <application name="@my-app/order-created"></application>
  </route>
  <route path="customerVerifiedAndContacteds">
    <application name="@my-app/customer-verified-and-contacted"></application>
  </route>
  <route path="fishDispatchedAndDelivereds">
    <application name="@my-app/fish-dispatched-and-delivered"></application>
  </route>
  <route path="orderHistoryCheckeds">
    <application name="@my-app/order-history-checked"></application>
  </route>
  <route path="inventoryCheckeds">
    <application name="@my-app/inventory-checked"></application>
  </route>
  <route path="inventoryAdjusteds">
    <application name="@my-app/inventory-adjusted"></application>
  </route>
  <route path="expirationDateManageds">
    <application name="@my-app/expiration-date-managed"></application>
  </route>
</single-spa-router>
`);

const applications = constructApplications({
  routes,
  loadApp({ name }) {
    return System.import(name);
  },
});

const layoutEngine = constructLayoutEngine({ routes, applications });

applications.forEach(registerApplication);
layoutEngine.activate();
start();