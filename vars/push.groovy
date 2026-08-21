def call(String Project,String ImageTage,String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:"docker-cred",passwordVariable:"DOCKER_PASS",usernameVariable:"DOCKER_USER")]){
  sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
}
sh "docker push ${DOCKER_USER}/${Project}:${ImageTage}"
}
