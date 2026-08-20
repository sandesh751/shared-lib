def call(String ProjectName, String ImageTage, String DockerHubUser){
  sh "docker build -t ${DckerHubUser}/${ProjectName}:${ImageTage} ."
}
