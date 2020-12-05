# A simple Java Web App
docker run \-\-name postgres -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres
docker ps \-\-filter "name=postgres" \-\-format "{{.ID}}"

ssh -i JenkinsAgent_Key.pem jenkinsagent@jenkinsagentcloudcomputing.eastus.cloudapp.azure.com
ssh -i Jenkins_Key.pem jenkins@jenkinscloudcomputing.eastus.cloudapp.azure.com