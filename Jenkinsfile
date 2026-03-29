pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Clean and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit testResults: '**/surefire-reports/*.xml', allowEmptyResults: true
        }
    }
}