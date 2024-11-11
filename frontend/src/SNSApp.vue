

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
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
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="supplyChainInformations"
                        to="/supplyChainInformationManageds/supplyChainInformations"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        공급망 정보
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="inventories"
                        to="/inventoryMonitoreds/inventories"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        재고
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="productionPlans"
                        to="/productionPlanManageds/productionPlans"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        생산 계획
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="orders"
                        to="/orderCreateds/orders"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        주문
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="customerContacts"
                        to="/customerVerifiedAndContacteds/customerContacts"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        고객 연락
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="fishDeliveries"
                        to="/fishDispatchedAndDelivereds/fishDeliveries"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        생선 배송
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="orderHistories"
                        to="/orderHistoryCheckeds/orderHistories"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        주문 이력
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="fishInventories"
                        to="/inventoryCheckeds/fishInventories"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        생선 재고
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="fishInventories"
                        to="/inventoryAdjusteds/fishInventories"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        생선 재고
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="fish"
                        to="/expirationDateManageds/fish"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        생선
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container style="padding:0px;" v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container style="padding:0px;" v-else fluid>
                <div style="width:100%; margin:0px 0px 20px 0px; position: relative;">
                    <v-img style="width:100%; height:300px;"
                        src=""
                    ></v-img>
                    <div class="App-main-text-overlap"></div>
                    <div class="App-sub-text-overlap"></div>
                </div>
                <v-row>
                    <v-col cols="4" class="d-flex justify-center" v-for="(aggregate, index) in aggregate" :key="index">
                        <div 
                            class="flip-card"
                            @mouseover="flipCard(index)"
                            @mouseleave="unflipCard(index)"
                            :class="{ 'is-flipped': flipped[index] }"
                        >
                            <div class="flip-card-inner">
                                <div class="flip-card-front">
                                    <v-card
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <div style="text-align: left; padding:10px 15px 15px 15px; margin-top:-10px;">
                                            <h2>{{ aggregate.title }}</h2>
                                            <div>{{ aggregate.description }}</div>
                                        </div>
                                    </v-card>
                                </div>
                                <div class="flip-card-back">
                                    <v-card
                                        color="primary"
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                        :key="aggregate.key"
                                        :to="aggregate.route"
                                        @click="changeUrl()"
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <h2 style="color:white;">{{ aggregate.title }} 관리</h2>
                                    </v-card>
                                </div>
                            </div>
                        </div>
                    </v-col>
                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
        flipped: [],
        ImageUrl: '',
        aggregate: [
            { 
                title: '공급망 정보', 
                description: '생선 생산, 유통 및 판매와 관련된 정보를 등록, 수정 또는 삭제하는 모델', 
                key: 'supplyChainInformations', 
                route: '/supplyChainInformationManageds/supplyChainInformations',
                ImageUrl: '',
            },
            { 
                title: '재고', 
                description: '현재 생선 재고를 확인하고, 필요한 경우 재고 수량을 조절하는 모델', 
                key: 'inventories', 
                route: '/inventoryMonitoreds/inventories',
                ImageUrl: '',
            },
            { 
                title: '생산 계획', 
                description: '생선 생산 계획을 생성하고, 실행 상태를 모니터링하는 모델', 
                key: 'productionPlans', 
                route: '/productionPlanManageds/productionPlans',
                ImageUrl: '',
            },
            { 
                title: '주문', 
                description: '고객의 생선 주문을 받아 새로운 주문을 생성하는 모델', 
                key: 'orders', 
                route: '/orderCreateds/orders',
                ImageUrl: '',
            },
            { 
                title: '고객 연락', 
                description: '고객 정보를 검증하고 주문에 대한 의견이나 추가 정보를 요청하기 위해 연락하는 모델', 
                key: 'customerContacts', 
                route: '/customerVerifiedAndContacteds/customerContacts',
                ImageUrl: '',
            },
            { 
                title: '생선 배송', 
                description: '주문된 생선을 창고에서 출고하여 배송하는 과정을 처리하는 모델', 
                key: 'fishDeliveries', 
                route: '/fishDispatchedAndDelivereds/fishDeliveries',
                ImageUrl: '',
            },
            { 
                title: '주문 이력', 
                description: '고객의 생선 주문 이력을 조회하고, 이전 주문 정보에 기반하여 도움을 제공하는 모델', 
                key: 'orderHistories', 
                route: '/orderHistoryCheckeds/orderHistories',
                ImageUrl: '',
            },
            { 
                title: '생선 재고', 
                description: '현재 생선의 재고 수량과 위치를 조회하고, 입고 및 출고 기록을 관리하는 모델', 
                key: 'fishInventories', 
                route: '/inventoryCheckeds/fishInventories',
                ImageUrl: '',
            },
            { 
                title: '생선 재고', 
                description: '현재 생선의 재고 수량과 위치를 조회하고, 입고 및 출고 기록을 관리하는 모델', 
                key: 'fishInventories', 
                route: '/inventoryAdjusteds/fishInventories',
                ImageUrl: '',
            },
            { 
                title: '생선', 
                description: '생선의 유통 기한을 관리하고, 지난 유통 기한을 가진 생선의 처리를 알리는 모델', 
                key: 'fish', 
                route: '/expirationDateManageds/fish',
                ImageUrl: '',
            },
            
        ],
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },
    watch: {
        cards(newCards) {
            this.flipped = new Array(newCards.length).fill(false);
        },
    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
            this.flipped.fill(false);
        },
        goHome() {
            this.urlPath = null;
        },
        flipCard(index) {
            this.$set(this.flipped, index, true);
        },
        unflipCard(index) {
            this.$set(this.flipped, index, false);
        },
    }
};
</script>
<style>
</style>
