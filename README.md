# Angular + Spring Stack

## Versions
Angular : 10.2.0
Spring Boot : 2.3.4.RELEASE

This is a angular frontend + spring boot backend demo project developed for CI/CD purposes. 
Test files also included for angular + spring project.

This project can also run entire CI/CD from our Custom Docker Image.
https://github.com/PDOP-Beta/Pipeline-Angular-SpringBoot

Pull the above project and jenkinsfile is already set to run with the required setting.


# Steps to Run
### Clone this repository. 

 ##### Run Angular commands in the *angular-frontend* directory
  ##### Run Spring commands in the *spring-backend* directory
 
Angular Setup
```sh
$ npm install
```

Spring-Boot Setup
```sh
$ mvn clean install
```

 
###  Run the Servers

Angular
```sh
$ ng serve
```


Spring-Boot
```sh
$ mvn spring-boot:run
```

 
###  Run the Test Cases

Angular
```sh
$ ng test
```


Spring-Boot
```sh
$ mvn clean test
```

