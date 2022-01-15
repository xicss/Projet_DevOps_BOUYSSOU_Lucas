#!groovy

pipeline {
    agent any
    tools {
        maven 'maven'
    }
    environment {
        TEST = 'TEST'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '100'))
        ansiColor('xterm')
    }
    stages {
        stage('Job description') {
            steps {
                script {
                    println('Env var: ' + env.TEST)
                    sh 'java --version'
                    sh 'mvn --version'
                    sh 'python3 --version'
                    currentBuild.displayName = "#${BUILD_NUMBER} ${params.PARAM1}"
                }
                git https://github.com/Ozz007/sb3t
                sh 'ls -ls'
            }
        }
        stage('compile'){
            steps{
                sh 'mvn compile'
            }
        }
        stage('testunit'){
            steps{
                sh 'mvn test'
            }
        }
    }
}