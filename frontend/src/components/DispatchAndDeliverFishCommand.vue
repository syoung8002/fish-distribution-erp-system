<template>
    <v-card outlined>
        <v-card-title>
            DispatchAndDeliverFish
        </v-card-title>

        <v-card-text>
            <String label="DeliveryId" v-model="value.deliveryId" :editMode="editMode"/>
            <String label="OrderId" v-model="value.orderId" :editMode="editMode"/>
            <String label="DeliveryStatus" v-model="value.deliveryStatus" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="dispatchAndDeliverFish"
            >
                DispatchAndDeliverFish
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DispatchAndDeliverFishCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.deliveryId = '';
            this.value.orderId = '';
            this.value.deliveryStatus = '';
        },
        watch: {
        },
        methods: {
            dispatchAndDeliverFish() {
                this.$emit('dispatchAndDeliverFish', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

