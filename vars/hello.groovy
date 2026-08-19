def call(){
  withCredentials([usernamePassword(credentialsId:"docker-cred",passwordVariable:"DOCKER_PASS",usernameVariable:"DOCKER_USER")]){
  sh "docker login -u ${env.DOCKER_USER} -p ${env.DOCKER_PASS}"
  sh "docker image tag two-tier ${env.DOCKER_USER}/two-tier:latest"
  sh "docker push ${env.DOCKER_USER}/two-tier:latest"
  }  
}
