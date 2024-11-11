<template>
    <v-card outlined>
        <v-card-title>
            CheckFishInventory
        </v-card-title>

        <v-card-text>
            <String label="InventoryId" v-model="value.inventoryId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="checkFishInventory"
            >
                CheckFishInventory
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
        name: 'CheckFishInventoryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.inventoryId = '';
        },
        watch: {
        },
        methods: {
            checkFishInventory() {
                this.$emit('checkFishInventory', this.value);
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

