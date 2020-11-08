pipeline {
  agent any
  stages {
    stage('Build and Test Angular') {
      steps {
        dir(path: 'angular-frontend') {
          sh 'npm install'
          sh 'ng test'
        }

      }
    }

    stage('Build and Test Spring') {
      steps {
        dir(path: 'spring-backend') {
          sh 'mvn clean test'
        }

      }
    }

  }
}