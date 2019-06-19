node {
    def app

    stage('Clone repository') {
        /* clone the repository */
        checkout scm
        /* set maven wrapper permissions */
        sh "chmod 711 ./mvnw"
    }
    
    stage('Test Project') {
        /* run tests */
        sh "./mvnw test"
    }
    
    stage('Build Project') {        
        /* build the project */
        sh "./mvnw clean install"
    }

    stage('Build image') {
        /* build the docker image */
        app = docker.build("ammonking/hello-deployment")
    }

    stage('Push image') {
        /* push with tag : build number (historical tracking) */
        /* push with tag : latest */
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
    }
}
