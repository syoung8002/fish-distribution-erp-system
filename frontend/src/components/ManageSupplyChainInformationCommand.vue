<template>
    <v-card outlined>
        <v-card-title>
            ManageSupplyChainInformation
        </v-card-title>

        <v-card-text>
            <String label="InformationId" v-model="value.informationId" :editMode="editMode"/>
            <String label="InformationType" v-model="value.informationType" :editMode="editMode"/>
            <String label="InformationData" v-model="value.informationData" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="manageSupplyChainInformation"
            >
                ManageSupplyChainInformation
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
        name: 'ManageSupplyChainInformationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.informationId = '';
            this.value.informationType = '';
            this.value.informationData = '';
        },
        watch: {
        },
        methods: {
            manageSupplyChainInformation() {
                this.$emit('manageSupplyChainInformation', this.value);
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

