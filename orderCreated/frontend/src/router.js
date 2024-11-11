import Vue from 'vue'
import Router from 'vue-router'

import OrderCreatedOrderManager from "./components/listers/OrderCreatedOrderCards"
import OrderCreatedOrderDetail from "./components/listers/OrderCreatedOrderDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/orderCreateds/orders',
            name: 'OrderCreatedOrderManager',
            component: OrderCreatedOrderManager,
        },
        {
            path: '/orderCreateds/orders/:id',
            name: 'OrderCreatedOrderDetail',
            component: OrderCreatedOrderDetail,
        },
    ]
})
