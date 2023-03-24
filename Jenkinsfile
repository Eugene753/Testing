// Declarative //
def gv;
pipeline {

    agent any

    gv = new Fun();

    stages {

      /* stage('init') {
           steps {
              script{
                 gv = load "src/main/GrovyFiles/Fun.groovy";
              }
           }
        }*/

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