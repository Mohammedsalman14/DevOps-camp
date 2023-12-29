pipeline {
    agent any
    
    stages {
        stage("build") {
            steps {
                echo 'building the application'
            }
        }
        stage("test") {
            steps {
                echo 'testing the application'
            }
        }
        stage("deploy") {

            steps {
                echo 'deploying the application'
                withCredentials([
                    usernamePassword(credentials: 'github-login', usernameVariable:USER, passwordVariable: PWD)
                ]){
                    echo "some Script ${USER} ${PWD}"
                }
            }
        }
    }
    
}