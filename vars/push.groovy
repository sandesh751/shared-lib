def call(String Project,string ImageTage,string dockerhubuser){
  withCredentials([usernamePassword(credentialsId:"docker-cred",passwordVariable:"DOCKER_PASS",usernameVariable:"DOCKER_USE")]){
}
sh "docker push ${DOCKER_USER}/${Project}:${ImageTage}"
}
