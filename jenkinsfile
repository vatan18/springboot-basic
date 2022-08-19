pipeline{
    agent any
    stages{
        stage("Git clone"){
            steps{
               git credentialsId: '6dfc2005-bfeb-4b6d-ba06-a424ae3469aa', url: 'https://github.com/vatan18/springboot-basic.git'
            }
        }
        stage("Maven Test"){
            steps{
              sh  'mvn test'
            }
        }
        stage("Maven Build"){
            steps{
               sh 'mvn package'
            }
        }
        stage("Maven Deploy"){
            steps{
                echo "Deploying the war file"
            }
        }
        
    
