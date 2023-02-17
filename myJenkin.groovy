pipeline {
    agent any

    stages {
        stage('WelcomeEcho') {
            steps {
                echo 'Hello World {$coursename}'
            }
        }
        stage('Checkout') {
            steps {
                checkout "https://github.com/vihari29/jenkins-git-integration.git"
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}