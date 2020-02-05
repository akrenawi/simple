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
                     sh "target/*jar target/myweb.jar" 
                }
               
            }
            stage("deploy-dev"){
                steps{
                sshagent(credentials: ['5'], ignoreMissing: true) {
                    sh """
                        scp -o StrictHostKeyChecking=no target/myweb.war ec2-user@172.31.19.13:/opt/tomcat8/webapps/
                        ssh ec2-user@172.31.19.13 /opt/tomcat8/bin/shutdown.sh
                        ssh ec2-user@172.31.19.13 /opt/tomcat8/bin/startup.sh
                        
                    """
                }
            }
            }

        }

}
