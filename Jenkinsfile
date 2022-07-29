pipeline {
  
  agent any
  
  tools { 
        maven 'maven3.8.6' 

    }
  
  stages {
    
    stage("build") {
      steps {
        echo 'building the app...'
             sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
      }
    }
    
    stage("test") {
      steps {
        echo 'testing the app...'
        sh 'mvn package' 

      }
    }
    
    stage("deploy") {
      steps {
        echo 'deploying the app...'
      }
    }
    
  }
}
