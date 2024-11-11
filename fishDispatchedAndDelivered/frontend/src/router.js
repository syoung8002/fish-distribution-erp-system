import Vue from 'vue'
import Router from 'vue-router'

import FishDispatchedAndDeliveredFishDeliveryManager from "./components/listers/FishDispatchedAndDeliveredFishDeliveryCards"
import FishDispatchedAndDeliveredFishDeliveryDetail from "./components/listers/FishDispatchedAndDeliveredFishDeliveryDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/fishDispatchedAndDelivereds/fishDeliveries',
            name: 'FishDispatchedAndDeliveredFishDeliveryManager',
            component: FishDispatchedAndDeliveredFishDeliveryManager,
        },
        {
            path: '/fishDispatchedAndDelivereds/fishDeliveries/:id',
            name: 'FishDispatchedAndDeliveredFishDeliveryDetail',
            component: FishDispatchedAndDeliveredFishDeliveryDetail,
        },
    ]
})
