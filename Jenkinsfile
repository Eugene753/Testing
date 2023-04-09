// Declarative //
def gv;
/*node {
    gv = load "src/main/GrovyFiles/Fun.groovy";
}*/
//def gv = Fun.groovy

def load(){
    return gv = load "src/main/GrovyFiles/Fun.groovy";
}



pipeline {

    agent any
    tools{
        maven '3.9.1'
    }

    stages {
        stage('Example'){
            steps {
                sh 'mvn --version'
            }
        }
       /*stage('init') {
           steps {
              script{
                 gv = load "src/main/GrovyFiles/Fun.groovy";
              }
           }
        }*/
/*
        stage('Build') {
            steps {
               script{
                    load().build()
               }
            }
        }
        stage('Test') {
            steps {
                script{
                    load().test()
                }
            }
        }
        stage('Deploy') {
            steps {
                script{
                    load().deploy()
                }
            }
        }
        */
    }

}