<template>
    <v-card outlined>
        <v-card-title>
            ManageExpirationDate
        </v-card-title>

        <v-card-text>
            <String label="FishId" v-model="value.fishId" :editMode="editMode"/>
            <String label="FishType" v-model="value.fishType" :editMode="editMode"/>
            <Date label="ExpirationDate" v-model="value.expirationDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="manageExpirationDate"
            >
                ManageExpirationDate
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
        name: 'ManageExpirationDateCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.fishId = '';
            this.value.fishType = '';
            this.value.expirationDate = '2024-11-11';
        },
        watch: {
        },
        methods: {
            manageExpirationDate() {
                this.$emit('manageExpirationDate', this.value);
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

