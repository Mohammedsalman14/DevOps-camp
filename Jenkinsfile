def gv
pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }
        stage('build') {
            steps {
                script {
                    gv.build()
                }
            }
        }
        stage('test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.test()
                }
            }
        }
        stage('deploy') {
            // input {
            //     message 'Select the envirnoment to deploy '
            //     ok 'Done'
            //     parameters {
            //         choice(name:'Env', choices:['dev', 'staging', 'prod'], description:'')
            //     }
            // }
            steps {
                script {
                   env.ENV=input message: "Select the environment to deploy", ok: "Done"
                    parameters:[choice(name:'ONE', choices:['dev', 'staging', 'prod'], description:'')]
                    gv.deploy()
                    echo "Deploying to ${ENV}"
                }
                echo "Deploying version ${params.VERSION}"
                // echo "Deploying to ${ENV}"
            }
        }
    }
}
