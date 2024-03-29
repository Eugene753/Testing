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
                docker version
                docker info
                docker compose version
                curl --version
                '''
            }
        }
        stage('Start container') {
            steps {
                bat 'docker swarm init'
                bat 'docker stack deploy -c src/main/resources/docker-compose-v3-swarm.yml grid'
                bat 'docker ps'
            }
        }
        stage('Test'){
            steps {
                bat 'mvn clean test -Dsurefire.suiteXmlFiles=${suiteFileGrid}'
                echo 'verifyed tools and ran tests'
            }
        }
        stage('Deploy'){
            steps {
                echo 'tests done sending slack messages'
            }
        }
    }
    post {
        always {
            bat 'docker stack rm grid'
            bat 'docker swarm leave --force'
            bat 'docker ps'
        }
    }
}