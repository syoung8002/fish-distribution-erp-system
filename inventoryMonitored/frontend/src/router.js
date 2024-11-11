import Vue from 'vue'
import Router from 'vue-router'

import InventoryMonitoredInventoryManager from "./components/listers/InventoryMonitoredInventoryCards"
import InventoryMonitoredInventoryDetail from "./components/listers/InventoryMonitoredInventoryDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/inventoryMonitoreds/inventories',
            name: 'InventoryMonitoredInventoryManager',
            component: InventoryMonitoredInventoryManager,
        },
        {
            path: '/inventoryMonitoreds/inventories/:id',
            name: 'InventoryMonitoredInventoryDetail',
            component: InventoryMonitoredInventoryDetail,
        },
    ]
})
