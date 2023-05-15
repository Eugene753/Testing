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
        stage('Test'){
            steps {
                bat 'mvn clean test -DsuiteXmlFile'
            }
        }
        stage('Deploy'){
            steps {
                echo 'tests done sending slack messgaes'
            }
        }
    }
}