pipeline {
	agent {
		docker {
			image 'maven:3-alpine'
			args '-v /root/.m2:/root/.m2'
		}
	}
	stages {
		stage('Test') {
			steps {
				sh 'mvn test'
			}
		}
		stage('Build') {
			steps {
			 	sh 'mvn install'
			}
		}
		stage('Dockerfile'){
			steps {
				sh 'mvn dockerfile:build'
			}
		}
		stage('Push'){
			steps {
				script {
					def newApp = docker.build "ammonking/hello-deployment:latest"
					newApp.push()
				}
			}
		}
				
	}
}
