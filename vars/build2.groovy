def call(String projectName, String imageTag) {
    sh "docker build -t ${projectName}:${imageTag} ."
    sh "trivy image --format template --template '@contrib/html.tpl' -o trivy-report.html ${projectName}:${imageTag}"
    publishHTML([
        allowMissing: false,
        alwaysLinkToLastBuild: true,
        keepAll: true,
        reportDir: '.',
        reportFiles: 'trivy-report.html',
        reportName: 'Trivy Security Report' 
    ])
}

