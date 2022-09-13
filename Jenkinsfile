pipeline {
  agent any
  stages {
    stage ('validate Stage') {
      steps{
        withMaven(maven : 'MAVEN_HOME'){
          bat 'mvn clean validate'
        }
      }
    }

    stage ('Compile Stage') {
      steps{
        withMaven(maven : 'MAVEN_HOME'){
         bat 'mvn clean compile'
        }
      }
    }
    
    stage ('Testing Stage') {
      steps{
        withMaven(maven : 'MAVEN_HOME'){
          bat 'mvn clean test'
        }
      }
    }
    stage ('package Stage') {
      steps{
        withMaven(maven : 'MAVEN_HOME'){
          bat 'mvn clean package'
        }
      }
    }
  }
}
