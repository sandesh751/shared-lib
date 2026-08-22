def call(String projectName,String dockerHubUser,String ImageTag){
  withCredentials([usernamePassword(credentialsId:"docker-cred",usernameVariable:"docker_user",passwordVariable:"docker_pass")]){
  sh "docker login -u ${docker_user} -p ${docker_pass}"
  sh "docker image tag ${projectName} ${dockerHubUser}/${projectName}:${ImageTag}"
  sh "docker push ${dockerHubUser}/${projectName}:${ImageTag}"
  }
}
