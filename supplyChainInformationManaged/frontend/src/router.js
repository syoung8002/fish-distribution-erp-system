import Vue from 'vue'
import Router from 'vue-router'

import SupplyChainInformationManagedSupplyChainInformationManager from "./components/listers/SupplyChainInformationManagedSupplyChainInformationCards"
import SupplyChainInformationManagedSupplyChainInformationDetail from "./components/listers/SupplyChainInformationManagedSupplyChainInformationDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/supplyChainInformationManageds/supplyChainInformations',
            name: 'SupplyChainInformationManagedSupplyChainInformationManager',
            component: SupplyChainInformationManagedSupplyChainInformationManager,
        },
        {
            path: '/supplyChainInformationManageds/supplyChainInformations/:id',
            name: 'SupplyChainInformationManagedSupplyChainInformationDetail',
            component: SupplyChainInformationManagedSupplyChainInformationDetail,
        },
    ]
})
