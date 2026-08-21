def call(String dockerHubUser, String projectName, String ImageTag){
withCredentials([usernamePassword(credentialsId:"docker-cred",usernameVariable:"DOCKER_USER",passwordVariable:"DOCKER_PASS")]){
sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
sh "docker image tag ${projectName} ${DOCKER_USER}/${projectName}:${ImageTag}"
sh "docker push ${DOCKER_USER}/${projectName}:${ImageTag}"
}
}
