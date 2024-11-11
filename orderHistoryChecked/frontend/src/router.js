import Vue from 'vue'
import Router from 'vue-router'

import OrderHistoryCheckedOrderHistoryManager from "./components/listers/OrderHistoryCheckedOrderHistoryCards"
import OrderHistoryCheckedOrderHistoryDetail from "./components/listers/OrderHistoryCheckedOrderHistoryDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/orderHistoryCheckeds/orderHistories',
            name: 'OrderHistoryCheckedOrderHistoryManager',
            component: OrderHistoryCheckedOrderHistoryManager,
        },
        {
            path: '/orderHistoryCheckeds/orderHistories/:id',
            name: 'OrderHistoryCheckedOrderHistoryDetail',
            component: OrderHistoryCheckedOrderHistoryDetail,
        },
    ]
})
