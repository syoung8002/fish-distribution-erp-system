import Vue from 'vue'
import Router from 'vue-router'

import InventoryCheckedFishInventoryManager from "./components/listers/InventoryCheckedFishInventoryCards"
import InventoryCheckedFishInventoryDetail from "./components/listers/InventoryCheckedFishInventoryDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/inventoryCheckeds/fishInventories',
            name: 'InventoryCheckedFishInventoryManager',
            component: InventoryCheckedFishInventoryManager,
        },
        {
            path: '/inventoryCheckeds/fishInventories/:id',
            name: 'InventoryCheckedFishInventoryDetail',
            component: InventoryCheckedFishInventoryDetail,
        },
    ]
})
