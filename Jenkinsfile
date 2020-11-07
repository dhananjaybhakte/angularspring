pipeline {
  agent none
  stages {
    stage('Build and Test Angular') {
      steps {
        sh 'cd angular-frontend'
        sh 'npm install'
        sh 'ng test'
      }
    }

    stage('Build Spring') {
      steps {
        sh 'cd spring-backend'
        sh 'mvn clean test'
      }
    }

  }
}