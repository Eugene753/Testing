// Declarative //

pipeline {
    def gv;

    agent any

       stage('Build') {
           steps {
              script{
                 gv = load "src/main/GrovyFiles/Fun.groovy";
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
