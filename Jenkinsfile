// Declarative //

pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }
    stages {
        stage('verify tooling') {
            steps {
                bat '''
                mvn -version
                docker version
                docker info
                docker compose version
                curl --version
                jq --version
                '''
            }
        }
        stage('Test'){
            steps {
                //bat 'mvn clean test -DsuiteXmlFile'
                echo 'veried tools'
            }
        }
        stage('Deploy'){
            steps {
                echo 'tests done sending slack messgaes'
            }
        }
    }
}