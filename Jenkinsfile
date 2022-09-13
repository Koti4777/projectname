pipeline {
  agent any
  stages {
    stage ('Compile Stage') {
      steps{
        withMaven(maven : 'MAVEN_HOME'){
          bat 'mvn clean compile'
        }
      }
    }
stages {
    stage ('Testing Stage') {
      steps{
        withMaven(maven : 'MAVEN_HOME'){
          bat 'mvn clean test'
        }
      }
    }
    
  }
}
