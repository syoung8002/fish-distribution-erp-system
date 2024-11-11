<template>
    <v-app>
        <v-app-bar 
                app 
                clipped-left 
                flat
                color="primary"
        >
            <v-toolbar-title>
                <span class="second-word font uppercase"
                    style="font-weight:700;"
                >
                    <v-app-bar-nav-icon
                        @click="openSideBar()"
                        style="z-index:1;
                        height:56px;
                        width:30px;
                        margin-right:10px;
                        font-weight:300;
                        font-size:55px;"
                    >
                        <div style="line-height:100%;">≡</div>
                    </v-app-bar-nav-icon>
                </span>
            </v-toolbar-title>

            <v-btn icon to="/">
                <v-icon>mdi-home</v-icon>
            </v-btn>
            
            <v-spacer></v-spacer>

        </v-app-bar>

        <v-navigation-drawer 
                v-model="sideBar"
                app 
                clipped 
                flat 
        >
            <v-list>
                <v-list-item
                    class="px-2"
                    key="supplyChainInformations"
                    to="/supplyChainInformationManageds/supplyChainInformations"
                    color="primary"
                    style="font-weight:700;"
                >
                    공급망 정보
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="inventories"
                    to="/inventoryMonitoreds/inventories"
                    color="primary"
                    style="font-weight:700;"
                >
                    재고
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="productionPlans"
                    to="/productionPlanManageds/productionPlans"
                    color="primary"
                    style="font-weight:700;"
                >
                    생산 계획
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="orders"
                    to="/orderCreateds/orders"
                    color="primary"
                    style="font-weight:700;"
                >
                    주문
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="customerContacts"
                    to="/customerVerifiedAndContacteds/customerContacts"
                    color="primary"
                    style="font-weight:700;"
                >
                    고객 연락
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="fishDeliveries"
                    to="/fishDispatchedAndDelivereds/fishDeliveries"
                    color="primary"
                    style="font-weight:700;"
                >
                    생선 배송
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="orderHistories"
                    to="/orderHistoryCheckeds/orderHistories"
                    color="primary"
                    style="font-weight:700;"
                >
                    주문 이력
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="fishInventories"
                    to="/inventoryCheckeds/fishInventories"
                    color="primary"
                    style="font-weight:700;"
                >
                    생선 재고
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="fishInventories"
                    to="/inventoryAdjusteds/fishInventories"
                    color="primary"
                    style="font-weight:700;"
                >
                    생선 재고
                </v-list-item>

                <v-list-item
                    class="px-2"
                    key="fish"
                    to="/expirationDateManageds/fish"
                    color="primary"
                    style="font-weight:700;"
                >
                    생선
                </v-list-item>

            </v-list>
        </v-navigation-drawer>

        <v-main>
            <router-view></router-view>
        </v-main>
    </v-app>
</template>

<script>
    export default {
        name: "App",
        data: () => ({
            sideBar: true,
        }),
        created() {
        },
        methods: {
            openSideBar(){
                this.sideBar = !this.sideBar
            },
        }
    };
</script>

<style>
</style>
