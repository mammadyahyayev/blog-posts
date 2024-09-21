# Kubernetes Aliases

```bash
# usage: k get pods (will give pods in current namespace)
alias k=kubectl

# set current namespace
# usage: ksetns test
ksetns() {
 kubectl config set-context --current --namespace="$1"
}

# get current namespace 
# usage: kgetns
kgetns() {
 kubectl config view --minify --output 'jsonpath={..namespace}'
 echo -e ""
}
```