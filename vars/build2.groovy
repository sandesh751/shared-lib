def call(String projectName, String imageTag) {
    sh "docker build -t ${projectName}:${imageTag} ."
    // '@contrib/html.tpl' ko hata kar sirf 'html' likh dein
sh "trivy image --format template --template html -o trivy-report.html app:latest"
    publishHTML([
        allowMissing: false,
        alwaysLinkToLastBuild: true,
        keepAll: true,
        reportDir: '.',
        reportFiles: 'trivy-report.html',
        reportName: 'Trivy Security Report' 
    ])
}

