// Declarative //
import MyClass;

pipeline {
    agent any

    stages {
        stage("init"){
            steps{
                 script{
                    def gv = new MyClass();
                }
            }
        }
        stage('Build') {
            steps {
               script{
                    gv.build()
               }
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
