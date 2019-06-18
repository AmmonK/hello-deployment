node {
	stage('test') {
		sh 'docker ps -a'
		checkout scm
		sh 'sudo ./mvnw test'
	}
}
