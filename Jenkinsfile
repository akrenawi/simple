pipeline {
    agent any
        stages {
            stage ('Git Checkout') {
                steps {
                    git 'https://github.com/akrenawi/simple.git'
                }
            }
            stage('Maven Build'){
                steps{
                     sh "mvn clean package"
                }
               
            }

                stage("deploy-dev"){
                steps{
                    echo 'im deployed'
            }
            }

        }

}
