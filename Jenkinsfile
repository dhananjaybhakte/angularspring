pipeline {
  agent any
  stages {
    stage('Dependency scaner') {
          steps {
            dir(path: 'angular-frontend') {
              sh 'npm audit'
              
            }

          }
        }
    stage('Build and Test Angular') {
      steps {
        dir(path: 'angular-frontend') {
          sh 'npm install'
          
          sh 'ng test'
          
          
        }

      }
    }

    stage('Build and Test Spring') {
      parallel {
        stage('Build and Test Spring') {
          steps {
            dir(path: 'spring-backend') {
              sh 'mvn clean install test'
            }

          }
        }

        stage('Run Sonar on Angular') {
          steps {
            dir(path: 'angular-frontend') {
              sh 'ng test --code-coverage --watch=false'
              sh 'npm run sonar'
            }

          }
        }

      }
    }

    stage('Run Sonar on springs') {
      steps {
        dir(path: 'spring-backend') {
          sh 'mvn sonar:sonar'
        }

      }
    }

  }
}
