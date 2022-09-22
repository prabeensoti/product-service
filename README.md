## USE k8s-config for other configuration before executing it

`https://github.com/prabeensoti/k8s-config`

execute command to deploy on minikube

`minikube kubectl -- apply ./k8s/deployment.yaml`

### OR

`kubectl apply ./k8s/deployment.yaml`

### USE BELOW EXPOSED URL TO ACCESS THE SERVICE
`microservice.test/product/products`

## REQUIRES ADMIN LOGIN TO PERFORM BELOW ACTIONS

## SAVE VENDOR
### POST METHOD: microservice.test/product/vendors
### REQUEST BODY:
### 
    `{
    "name":"Apple",
    "contact":"2342",
    "email":"app@apple.com",
    "address1":"CU",
    "address2":"CA",
    "city":"Seatt",
    "state":"CA",
    "zip":52557,
    "country":"USA"}`


## SAVE CATEGORY
### POST METHOD: microservice.test/product/categories
### REQUEST BODY:
### 
    `{
    "name":"Apple",
    "contact":"2342",
    "email":"app@apple.com",
    "address1":"CU",
    "address2":"CA",
    "city":"Seatt",
    "state":"CA",
    "zip":52557,
    "country":"USA"}`


### USE BELOW EXPOSED URL TO ACCESS THE SERVICE
## GET PRODUCTS
### GET METHOD: microservice.test/product/products
### RESPONSE BODY:
### `List`

## SAVE PRODUCT
### POST METHOD: microservice.test/product/products
### REQUEST BODY:
### 
    `{
    "name":"Laptop",
    "description":"Apple Laptop",
    "vendorId":1,
    "categoryId":1 }`
