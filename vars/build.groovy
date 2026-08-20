def call(String ProjectName, String ImageTage, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTage} ."
}
