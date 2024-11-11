
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import SupplyChainInformationManagedSupplyChainInformationManager from "./components/listers/SupplyChainInformationManagedSupplyChainInformationCards"
import SupplyChainInformationManagedSupplyChainInformationDetail from "./components/listers/SupplyChainInformationManagedSupplyChainInformationDetail"

import InventoryMonitoredInventoryManager from "./components/listers/InventoryMonitoredInventoryCards"
import InventoryMonitoredInventoryDetail from "./components/listers/InventoryMonitoredInventoryDetail"

import ProductionPlanManagedProductionPlanManager from "./components/listers/ProductionPlanManagedProductionPlanCards"
import ProductionPlanManagedProductionPlanDetail from "./components/listers/ProductionPlanManagedProductionPlanDetail"

import OrderCreatedOrderManager from "./components/listers/OrderCreatedOrderCards"
import OrderCreatedOrderDetail from "./components/listers/OrderCreatedOrderDetail"

import CustomerVerifiedAndContactedCustomerContactManager from "./components/listers/CustomerVerifiedAndContactedCustomerContactCards"
import CustomerVerifiedAndContactedCustomerContactDetail from "./components/listers/CustomerVerifiedAndContactedCustomerContactDetail"

import FishDispatchedAndDeliveredFishDeliveryManager from "./components/listers/FishDispatchedAndDeliveredFishDeliveryCards"
import FishDispatchedAndDeliveredFishDeliveryDetail from "./components/listers/FishDispatchedAndDeliveredFishDeliveryDetail"

import OrderHistoryCheckedOrderHistoryManager from "./components/listers/OrderHistoryCheckedOrderHistoryCards"
import OrderHistoryCheckedOrderHistoryDetail from "./components/listers/OrderHistoryCheckedOrderHistoryDetail"

import InventoryCheckedFishInventoryManager from "./components/listers/InventoryCheckedFishInventoryCards"
import InventoryCheckedFishInventoryDetail from "./components/listers/InventoryCheckedFishInventoryDetail"

import InventoryAdjustedFishInventoryManager from "./components/listers/InventoryAdjustedFishInventoryCards"
import InventoryAdjustedFishInventoryDetail from "./components/listers/InventoryAdjustedFishInventoryDetail"

import ExpirationDateManagedFishManager from "./components/listers/ExpirationDateManagedFishCards"
import ExpirationDateManagedFishDetail from "./components/listers/ExpirationDateManagedFishDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/supplyChainInformationManageds/supplyChainInformations',
                name: 'SupplyChainInformationManagedSupplyChainInformationManager',
                component: SupplyChainInformationManagedSupplyChainInformationManager
            },
            {
                path: '/supplyChainInformationManageds/supplyChainInformations/:id',
                name: 'SupplyChainInformationManagedSupplyChainInformationDetail',
                component: SupplyChainInformationManagedSupplyChainInformationDetail
            },

            {
                path: '/inventoryMonitoreds/inventories',
                name: 'InventoryMonitoredInventoryManager',
                component: InventoryMonitoredInventoryManager
            },
            {
                path: '/inventoryMonitoreds/inventories/:id',
                name: 'InventoryMonitoredInventoryDetail',
                component: InventoryMonitoredInventoryDetail
            },

            {
                path: '/productionPlanManageds/productionPlans',
                name: 'ProductionPlanManagedProductionPlanManager',
                component: ProductionPlanManagedProductionPlanManager
            },
            {
                path: '/productionPlanManageds/productionPlans/:id',
                name: 'ProductionPlanManagedProductionPlanDetail',
                component: ProductionPlanManagedProductionPlanDetail
            },

            {
                path: '/orderCreateds/orders',
                name: 'OrderCreatedOrderManager',
                component: OrderCreatedOrderManager
            },
            {
                path: '/orderCreateds/orders/:id',
                name: 'OrderCreatedOrderDetail',
                component: OrderCreatedOrderDetail
            },

            {
                path: '/customerVerifiedAndContacteds/customerContacts',
                name: 'CustomerVerifiedAndContactedCustomerContactManager',
                component: CustomerVerifiedAndContactedCustomerContactManager
            },
            {
                path: '/customerVerifiedAndContacteds/customerContacts/:id',
                name: 'CustomerVerifiedAndContactedCustomerContactDetail',
                component: CustomerVerifiedAndContactedCustomerContactDetail
            },

            {
                path: '/fishDispatchedAndDelivereds/fishDeliveries',
                name: 'FishDispatchedAndDeliveredFishDeliveryManager',
                component: FishDispatchedAndDeliveredFishDeliveryManager
            },
            {
                path: '/fishDispatchedAndDelivereds/fishDeliveries/:id',
                name: 'FishDispatchedAndDeliveredFishDeliveryDetail',
                component: FishDispatchedAndDeliveredFishDeliveryDetail
            },

            {
                path: '/orderHistoryCheckeds/orderHistories',
                name: 'OrderHistoryCheckedOrderHistoryManager',
                component: OrderHistoryCheckedOrderHistoryManager
            },
            {
                path: '/orderHistoryCheckeds/orderHistories/:id',
                name: 'OrderHistoryCheckedOrderHistoryDetail',
                component: OrderHistoryCheckedOrderHistoryDetail
            },

            {
                path: '/inventoryCheckeds/fishInventories',
                name: 'InventoryCheckedFishInventoryManager',
                component: InventoryCheckedFishInventoryManager
            },
            {
                path: '/inventoryCheckeds/fishInventories/:id',
                name: 'InventoryCheckedFishInventoryDetail',
                component: InventoryCheckedFishInventoryDetail
            },

            {
                path: '/inventoryAdjusteds/fishInventories',
                name: 'InventoryAdjustedFishInventoryManager',
                component: InventoryAdjustedFishInventoryManager
            },
            {
                path: '/inventoryAdjusteds/fishInventories/:id',
                name: 'InventoryAdjustedFishInventoryDetail',
                component: InventoryAdjustedFishInventoryDetail
            },

            {
                path: '/expirationDateManageds/fish',
                name: 'ExpirationDateManagedFishManager',
                component: ExpirationDateManagedFishManager
            },
            {
                path: '/expirationDateManageds/fish/:id',
                name: 'ExpirationDateManagedFishDetail',
                component: ExpirationDateManagedFishDetail
            },



    ]
})
