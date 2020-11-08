pipeline {
  agent any
  stages {
    stage('Build and Test Angular') {
      parallel {
        stage('Build and Test Angular') {
          steps {
            dir(path: 'angular-frontend') {
              sh 'npm install'
              sh 'ng test'
            }

          }
        }

        stage('Springs sonar') {
          steps {
            dir(path: ' spring-backend ') {
              sh 'mvn sonar:sonar'
            }

          }
        }

      }
    }

    stage('Build and Test Spring') {
      parallel {
        stage('Build and Test Spring') {
          steps {
            dir(path: 'spring-backend') {
              sh 'mvn clean test'
            }

          }
        }

        stage('Run Sonar ') {
          steps {
            dir(path: 'angular-frontend') {
              sh 'ng test --code-coverage --watch=false'
              sh 'npm run sonar'
            }

          }
        }

      }
    }

    stage('Springs Sonar') {
      steps {
        dir(path: ' spring-backend ') {
          sh 'mvn sonar:sonar'
        }

      }
    }

  }
}