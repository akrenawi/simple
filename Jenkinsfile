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
                    withMaven(maven : 'maven_3_5_0'){
                     sh "mvn clean compile"
                }
                }
            }
            stage('Mavien Test') {
               steps {
                  withMaven(maven : 'maven_3_5_0'){
                    sh 'mvn test'
                }
               }
              }

                stage("deploy-dev"){
                steps{
                    withMaven(maven : 'maven_3_5_0'){
                        sh 'mvn deploy'
            }
            }
                }

        }

}
