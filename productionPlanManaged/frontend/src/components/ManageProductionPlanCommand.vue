<template>
    <v-card outlined>
        <v-card-title>
            ManageProductionPlan
        </v-card-title>

        <v-card-text>
            <String label="PlanId" v-model="value.planId" :editMode="editMode"/>
            <String label="FishType" v-model="value.fishType" :editMode="editMode"/>
            <String label="Status" v-model="value.status" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="manageProductionPlan"
            >
                ManageProductionPlan
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
        name: 'ManageProductionPlanCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.planId = '';
            this.value.fishType = '';
            this.value.status = '';
        },
        watch: {
        },
        methods: {
            manageProductionPlan() {
                this.$emit('manageProductionPlan', this.value);
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

