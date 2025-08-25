node {
    stage('Script') {
        checkout([
            $class: 'GitSCM',
            branches: [[name: '*/scripted']],
            userRemoteConfigs: [[
                url: 'https://github.com/cihy999/JenkinsSample.git'
            ]],
            changelog: false
        ])
    }
    stage('Build') {
        echo 'This is BUILD stage'
    }
    stage('Test') {
        echo 'This is TEST stage'
    }
    stage('Deploy') {
        echo 'This is DEPLOY stage'
    }
    stage('Release') {
        echo 'This is RELEASE stage'
    }
}
