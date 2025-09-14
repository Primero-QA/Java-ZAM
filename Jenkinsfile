pipeline {
    agent any
    
    environment {
        PROJECT_NAME = "Wet shoes"
        OWNER_NAME = "ZAM"
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Hello2') {
            steps {
                echo "This is a project: ${PROJECT_NAME}"
                bat 'dir'
                dir('/Windows') {
                  bat 'dir'
                }
            }
        }
        stage('Hello3') {
            steps {
                echo "Hello ${OWNER_NAME}"
            }
        }
    }
}
