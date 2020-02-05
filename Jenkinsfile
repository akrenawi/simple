pipeline {
    agent any
    environment{
        Path = "/usr/bin:$PATH"
        
    }
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
                     sshagent(['5']) {
                    sh """
                    scp -o StrictHostKeyChecking=no


                    """
                     }
            }
            }

        }

}
