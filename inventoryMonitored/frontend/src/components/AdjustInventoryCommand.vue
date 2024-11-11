<template>
    <v-card outlined>
        <v-card-title>
            AdjustInventory
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
                    @click="adjustInventory"
            >
                AdjustInventory
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
        name: 'AdjustInventoryCommand',
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
            adjustInventory() {
                this.$emit('adjustInventory', this.value);
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

