node {
    stage('Script') {
        checkout([
            $class: 'GitSCM',
            branches: [[name: '*/scripted']],
            userRemoteConfigs: [[
                url: 'https://github.com/cihy999/JenkinsSample.git'
            ]],
            changelog: false,
            poll: false,
            extensions: [[
                $class: 'CloneOption', 
                shallow: true,  // 淺拷貝
                noTags: true,   // 不下載標籤
                depth: 1        // 只抓最近一次 commit
            ]]
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
