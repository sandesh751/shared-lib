def call(String projectName, String ImageTag){
  sh "docker build -t ${projectName}:${ImageTag} ."
  sh "trivy image --ignore-unfixed --severity HIGH,CRITICAL ${projectName}"
}
