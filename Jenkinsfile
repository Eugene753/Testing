// Declarative //

pipeline {

    agent {label 'linux'}

    tools {
        maven '3.9.1'
    }

    stages {
        stage('Example') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}