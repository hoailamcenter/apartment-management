# Apartment Environment

The docker should install the machine.

*Step 1*

To share/communicate between difference docker-compose files, we need to create the external network.
To make the external network by the command:

```shell
   docker network create shared_env_net
```

*Step 2*
* Go to the _env_ folder and run the required services by the below command:

```shell
   docker compose up -d
   [or]
   docker-compose up -d
```

* Go to the _apartment_ folder and run the required services by the below command:

```shell
   docker compose up
```
* Note: need to push required services to registry by the below command:

```shell
   docker build -t identity:1.0 .
   docker tag identity:1.0 localhost:5000/apartment/apartment-identity-service:1.0
   docker push localhost:5000/apartment/apartment-identity-service:1.0

   docker build -t master:1.0 .
   docker tag master:1.0 localhost:5000/apartment/apartment-master-service:1.0
   docker push localhost:5000/apartment/apartment-master-service:1.0

   docker build -t notification:1.0 .
   docker tag notification:1.0 localhost:5000/apartment/apartment-notification-service:1.0
   docker push localhost:5000/apartment/apartment-notification-service:1.0

   docker build -t eureka-discovery:1.0 .
   docker tag eureka-discovery:1.0 localhost:5000/apartment/apartment-eureka-discovery:1.0
   docker push localhost:5000/apartment/apartment-eureka-discovery:1.0

   docker build -t cloud-config:1.0 .
   docker tag cloud-config:1.0 localhost:5000/apartment/apartment-cloud-config:1.0
   docker push localhost:5000/apartment/apartment-cloud-config:1.0

   docker build -t api-gateway:1.0 .
   docker tag api-gateway:1.0 localhost:5000/apartment/apartment-api-gateway:1.0
   docker push localhost:5000/apartment/apartment-api-gateway:1.0
```

# Dashboard

*Eureka Discover*

| URL | Credentials | Description |
| http://localhost:8761 | admin/admin | N/A |

*e-Mail Web UI*

| URL | Credentials | Description |
| http://localhost:8000 | noreply/admin1! | N/A |

*Greenmail Open API*
| URL | Credentials | Description |
| http://localhost:8181 | N/A | N/A |

