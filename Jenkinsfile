// Declarative //
def gv

pipeline {
    agent any

    stages {
        stage("init"){
            steps{
                 script{
                    gv = load "fun.groovy"
                }
            }
        }
        stage('Build') {
            steps {
               gv.build()
            }
        }
        stage('Test') {
            steps {
                script{
                    gv.test()
                }
            }
        }
        stage('Deploy') {
            steps {
                script{
                    gv.deploy()
                }
            }
        }
    }
}
