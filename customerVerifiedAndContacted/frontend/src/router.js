import Vue from 'vue'
import Router from 'vue-router'

import CustomerVerifiedAndContactedCustomerContactManager from "./components/listers/CustomerVerifiedAndContactedCustomerContactCards"
import CustomerVerifiedAndContactedCustomerContactDetail from "./components/listers/CustomerVerifiedAndContactedCustomerContactDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/customerVerifiedAndContacteds/customerContacts',
            name: 'CustomerVerifiedAndContactedCustomerContactManager',
            component: CustomerVerifiedAndContactedCustomerContactManager,
        },
        {
            path: '/customerVerifiedAndContacteds/customerContacts/:id',
            name: 'CustomerVerifiedAndContactedCustomerContactDetail',
            component: CustomerVerifiedAndContactedCustomerContactDetail,
        },
    ]
})
