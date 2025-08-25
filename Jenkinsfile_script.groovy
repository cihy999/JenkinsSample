node {
    stage('Build') {
        echo 'This is BUILD stage'
    }
    stage('Deploy') {
        echo 'This is DEPLOY stage'
    }
    stage('Test') {
        echo 'This is TEST stage'
    }
    stage('Release') {
        echo 'This is RELEASE stage'
    }
}
