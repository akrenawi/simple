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
            stage("Maven Build"){
                sh "mvn clean package"
            }

        }

}
