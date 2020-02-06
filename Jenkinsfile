pipeline {
    agent any
        stages {
            stage ('Git Checkout') {
                steps {
                    git 'https://github.com/akrenawi/simple.git'
                }
            }
            stage('compile stage'){
                steps{
                    withMaven(maven : 'Maven_3_0_5'){
                     sh "mvn clean compile"
                }
                }
            }
            stage('Mavien Test') {
               steps {
                  withMaven(maven : 'Maven_3_0_5'){
                    sh 'mvn test'
                }
               }
              }

                stage("deploy-dev"){
                steps{
                    withMaven(maven : 'Maven_3_0_5'){
                        sh 'mvn deploy'
            }
            }
                }

        }

}
