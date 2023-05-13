// Declarative //

pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn -version'
            }
        }
    }
}