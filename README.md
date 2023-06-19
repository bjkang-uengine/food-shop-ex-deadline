# 

## Model
www.msaez.io/#/storming/foodshopexdeadline0619

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- store
- front
- delivery
- deadline
- inventory


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- store
```
 http :8088/storeOrders orderId="OrderId" oderId="oderId" menuId="menuId" customerId="customerId" adress="adress" status="status" qty="qty" 
```
- front
```
 http :8088/oeders id="id" customerId="customerId" address="address" menuId="menuId" status="status" qty="qty" 
```
- delivery
```
 http :8088/deliveries orderId="orderId" customerId="customerId" address="address" status="status" 
```
- deadline
```
 http :8088/deadlines id="id" deadline="deadline" sratedTime="sratedTime" orderId="orderId" 
```
- inventory
```
 http :8088/menus id="id" menuName="menuName" stock="stock" 
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

