pipeline{
    agent any
    environment{
        NEW_VERSION ='1.3.0'
        SERVER_CREDENTIALS = credentials("git-repo") //id-name
    }
    stages{
        stage("build"){
            steps{
                echo 'building the application'
            }
        }
        stage("test"){
            steps{
                echo 'testing the application'
            }
        }
        stage("deploy"){
            steps{
                echo 'deploying the application'
                echo " the credentials ${SERVER_CREDENTIALS} "
            }
        }
    }
    
}