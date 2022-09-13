pipeline {
  agent any
  stages {
           stage('Stage1') {
            steps{
            catchError {
           build quietPeriod: 10, job: 'DemoProject'
                }
                echo currentBuild.result
            }
        }

   
            stage('Stage1') {
            steps{
            catchError {
          build quietPeriod: 10, job: 'DempProject2'
                }
                echo currentBuild.result
            }
        }
   
  }
}
