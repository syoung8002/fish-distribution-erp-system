<template>
    <v-card outlined>
        <v-card-title>
            VerifyAndContactCustomer
        </v-card-title>

        <v-card-text>
            <String label="ContactId" v-model="value.contactId" :editMode="editMode"/>
            <String label="OrderId" v-model="value.orderId" :editMode="editMode"/>
            <String label="CustomerName" v-model="value.customerName" :editMode="editMode"/>
            <String label="ContactStatus" v-model="value.contactStatus" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="verifyAndContactCustomer"
            >
                VerifyAndContactCustomer
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
        name: 'VerifyAndContactCustomerCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.contactId = '';
            this.value.orderId = '';
            this.value.customerName = '';
            this.value.contactStatus = '';
        },
        watch: {
        },
        methods: {
            verifyAndContactCustomer() {
                this.$emit('verifyAndContactCustomer', this.value);
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

