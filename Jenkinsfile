// Declarative //
def gv

pipeline {
    agent any

    def myclass = new MyClass();

    stages {
        stage('Build') {
            steps {
               script{
                    myclass.build()
               }
            }
        }
        stage('Test') {
            steps {
                script{
                    myclass.test()
                }
            }
        }
        stage('Deploy') {
            steps {
                script{
                    myclass.deploy()
                }
            }
        }
    }
}
