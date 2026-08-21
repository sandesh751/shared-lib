def call(String projectName, String imageTag, String dockerHubUser, String dockerfilePath = "Dockerfile", String contextPath = ".") {
    // -f flag se hum custom Dockerfile name paas kar sakte hain
    sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} -f ${dockerfilePath} ${contextPath}"
}
