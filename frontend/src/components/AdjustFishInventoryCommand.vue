<template>
    <v-card outlined>
        <v-card-title>
            AdjustFishInventory
        </v-card-title>

        <v-card-text>
            <String label="InventoryId" v-model="value.inventoryId" :editMode="editMode"/>
            <Number label="Quantity" v-model="value.quantity" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="adjustFishInventory"
            >
                AdjustFishInventory
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
        name: 'AdjustFishInventoryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.inventoryId = '';
            this.value.quantity = 0;
        },
        watch: {
        },
        methods: {
            adjustFishInventory() {
                this.$emit('adjustFishInventory', this.value);
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

