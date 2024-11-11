import Vue from 'vue'
import Router from 'vue-router'

import InventoryAdjustedFishInventoryManager from "./components/listers/InventoryAdjustedFishInventoryCards"
import InventoryAdjustedFishInventoryDetail from "./components/listers/InventoryAdjustedFishInventoryDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/inventoryAdjusteds/fishInventories',
            name: 'InventoryAdjustedFishInventoryManager',
            component: InventoryAdjustedFishInventoryManager,
        },
        {
            path: '/inventoryAdjusteds/fishInventories/:id',
            name: 'InventoryAdjustedFishInventoryDetail',
            component: InventoryAdjustedFishInventoryDetail,
        },
    ]
})
