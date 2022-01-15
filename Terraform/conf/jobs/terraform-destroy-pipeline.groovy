#!groovy

pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr: '100'))
        ansiColor('xterm')
    }
    stages {
        stage('aller dans l"instance workspace folder') {
            steps {
                sh 'cd /var/jenkins_home/workspace/IaC/terraform && terraform destroy -auto-approve'
            }
        }
    }
}
