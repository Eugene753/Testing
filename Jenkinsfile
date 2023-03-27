// Declarative //
node {
def  gv = load "src/main/GrovyFiles/Fun.groovy";
}
//def gv = Fun.groovy
pipeline {

    agent any


    stages {
       /*stage('init') {
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