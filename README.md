# spring-cloud-netflix-proxy-apis
[Criando proxy de APIs com Spring cloud, Zuul e Eureka](https://wp.me/p5RSbg-kW)

## Pré requisito
- Maven 3
- Java 8

## Preparando ambiente

- ```cd spring-cloud-netflix-proxy-apis```
- ```mvn clean package```

## Executando 

Service Discovery (Eureka)
- ```cd eureka```
- ```mvn spring-boot:run```

Proxy (Zuul)
- ```cd zuul```
- ```mvn spring-boot:run```

API de Customers
- ```cd customers```
- ```mvn spring-boot:run```

API de Products
- ```cd products```
- ```mvn spring-boot:run```


Acessando Eureka: http://localhost:8761
````
Instances currently registered with Eureka

Application	AMIs	Availability Zones	Status
CUSTOMERS	n/a (1)	(1)	UP (1) - 192.168.11.247:customers:8060
PRODUCTS	n/a (1)	(1)	UP (1) - 192.168.11.247:products:8070
ZUUL	      n/a (1)	(1)	UP (1) - 192.168.11.247:zuul:8080
````

## Acessando APIs

#### Diretamente
- http://localhost:8070/products
- http://localhost:8060/customers

#### Via Proxy (Zuul)
- http://localhost:8080/api/products
- http://localhost:8080/api/customers

