# 

## Model
www.msaez.io/#/48265118/storming/fish-distribution-erp-system-1111

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- supply-chain-information-managed
- inventory-monitored
- production-plan-managed
- order-created
- customer-verified-and-contacted
- fish-dispatched-and-delivered
- order-history-checked
- inventory-checked
- inventory-adjusted
- expiration-date-managed


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- supply-chain-information-managed
```
 http :8088/supplyChainInformations informationId="informationId" informationType="informationType" informationData="informationData" 
```
- inventory-monitored
```
 http :8088/inventories inventoryId="inventoryId" fishType="fishType" quantity="quantity" 
```
- production-plan-managed
```
 http :8088/productionPlans planId="planId" fishType="fishType" status="status" 
```
- order-created
```
 http :8088/orders orderId="orderId" customerName="customerName" fishType="fishType" 
```
- customer-verified-and-contacted
```
 http :8088/customerContacts contactId="contactId" orderId="orderId" customerName="customerName" contactStatus="contactStatus" 
```
- fish-dispatched-and-delivered
```
 http :8088/fishDeliveries deliveryId="deliveryId" orderId="orderId" deliveryStatus="deliveryStatus" 
```
- order-history-checked
```
 http :8088/orderHistories orderId="orderId" customerName="customerName" orderDate="orderDate" 
```
- inventory-checked
```
 http :8088/fishInventories inventoryId="inventoryId" fishType="fishType" quantity="quantity" location="location" 
```
- inventory-adjusted
```
 http :8088/fishInventories inventoryId="inventoryId" fishType="fishType" quantity="quantity" location="location" 
```
- expiration-date-managed
```
 http :8088/fish fishId="fishId" fishType="fishType" expirationDate="expirationDate" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

