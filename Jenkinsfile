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
                     sh "mvn clean compile"
                }
               
            }
            stage('Mavien Test') {
                steps {
                    sh 'mvn test'
                }
    
              }

                stage("deploy-dev"){
                steps{
                        sh 'mvn deploy'
            }
            }

        }

}
