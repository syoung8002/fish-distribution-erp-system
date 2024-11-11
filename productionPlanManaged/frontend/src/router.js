import Vue from 'vue'
import Router from 'vue-router'

import ProductionPlanManagedProductionPlanManager from "./components/listers/ProductionPlanManagedProductionPlanCards"
import ProductionPlanManagedProductionPlanDetail from "./components/listers/ProductionPlanManagedProductionPlanDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/productionPlanManageds/productionPlans',
            name: 'ProductionPlanManagedProductionPlanManager',
            component: ProductionPlanManagedProductionPlanManager,
        },
        {
            path: '/productionPlanManageds/productionPlans/:id',
            name: 'ProductionPlanManagedProductionPlanDetail',
            component: ProductionPlanManagedProductionPlanDetail,
        },
    ]
})
