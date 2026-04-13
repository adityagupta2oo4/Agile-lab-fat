pipeline {
    agent any
    
    tools {
        // Ensure this name matches exactly what you set in Jenkins Tools
        maven 'Maven 3.x' 
    }

    stages {
        stage('Build') {
            steps {
                // Changed 'sh' to 'bat' for Windows compatibility
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Changed 'sh' to 'bat'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Changed 'sh' to 'bat'
                bat 'mvn package'
            }
        }
    }
}