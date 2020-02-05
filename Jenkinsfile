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
                     sh "mv target/*.war target/myweb.war"
                }
               
            }
            stage("deploy-dev"){
                sshagent(['5']) {
                    sh """
                    scp -o StrictHostKeyChecking=no target/myweb.war ec2-user@172.31.19.13:/opt/tomcat8/webapps/
                    shh ec2-user@172.31.5.176 /opt/tomcat8/bin/shutdown.sh
                    shh ec2-user@172.31.5.176 /opt/tomcat8/bin/startup.sh

                    """
            }
            }

        }

}
