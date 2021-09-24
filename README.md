# springboot-azure-kubernetes

Purpose of this Project is to build docker image of Springboot application & 
deploy to Azure Kubernetes Cluster.

Please follow certain steps in order to do that :-

1. Kubernetes Cluster Creation :-

create Resources -> K8s Services -> create K8s Cluster at the bottom ->  At the basic tab, select resource group or create new by clicking {azure-springboot} rest leave as it is by default -> Click on Review + Create at the basic tab below -> Azure & platofmr validates the privilidges & will create the new cluster on Azure K8s. {Switzerland North with Bs2}


2. Now go to Container Registries in Azure Cloud,
   Using Add button on the top left in Registry create the container Registry and tag it to the same resource group created in previous steps.

Here check for Repositories under the registry section upon clicking it.



3. docker login {url of container registry} example as below:

docker login aksnksk8s.azurecr.io

4. docker build -t springboot-azure-kubernetes .

5. docker tag springboot-azure-kubernetes aksnksk8s.azurecr.io/spring-aks/springboot-azure-kubernetes

6. docker push aksnksk8s.azurecr.io/spring-aks/springboot-azure-kubernetes

7. kubectl apply -f k8s/

8. kubectl get pods

{In case kubectl get pods, shows error like ImageErr etc, trigger below command}:-

9. az aks update -n aks-nks-k8s-cluster -g aks-nks-k8s-rg --attach-acr aksnksk8s

After executing the above command, below will be displayed:-

    Add ROLE Propagation done [###############] 100.0000%

and then,
`Running..` followed by Response trail after some time.

Here,

    aks-nks-k8s-cluster : Cluster name I have created and using
    aks-nks-k8s-rg : Resource Group have created and using
    aksnksk8s : Container Registries which I have created and using


Then,

10. kubectl get pods

11. kubectl expose pod springboot-azure-kubernetes-76685d6796-6j4vz --type=LoadBalancer --port=80 --target-port=8080

12. kubectl get svc

And use External IP of your running Pod to check if it is working or not.

