pipeline {
	agent any
	stages {
		stage('Test') {
			steps {
				sh './mvnw test'
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
				sh 'docker ps -a'
			}
		}
				
	}
}
