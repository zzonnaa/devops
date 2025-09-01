pipeline{
  agent any
  stages{
    stage('Compile'){
      steps{
        bat 'javac Fact.java Test.java'
      }
    }
    stage('Test'){
      steps{
        bat 'java Test'
      }
    }
    stage('Run'){
      steps{
        bat 'java Fact'
      }
    }
    stage('Package JAR'){
      steps{
        bat '"C:\\Program Files\\Java\\jdk-17\\bin\\jar" cfm factorial.jar manifest.txt Fact.class'
      }
    }
    stage('Archive JAR'){
      steps{
        archiveArtifacts artifacts: 'factorial.jar'
      }
    }
  }
  post{
    success{
      echo 'Build, test, packaging JAR successful'
    }
    failure{
      echo 'JAR packaging failed'
    }
  }
}
      
