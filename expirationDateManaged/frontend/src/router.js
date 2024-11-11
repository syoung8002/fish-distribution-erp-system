import Vue from 'vue'
import Router from 'vue-router'

import ExpirationDateManagedFishManager from "./components/listers/ExpirationDateManagedFishCards"
import ExpirationDateManagedFishDetail from "./components/listers/ExpirationDateManagedFishDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/expirationDateManageds/fish',
            name: 'ExpirationDateManagedFishManager',
            component: ExpirationDateManagedFishManager,
        },
        {
            path: '/expirationDateManageds/fish/:id',
            name: 'ExpirationDateManagedFishDetail',
            component: ExpirationDateManagedFishDetail,
        },
    ]
})
