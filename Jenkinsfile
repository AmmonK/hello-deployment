node {
	stage('test') {
		sh 'docker ps -a'
		checkout scm
		sh 'mvn test'
	}
}
