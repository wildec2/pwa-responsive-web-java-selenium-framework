 node{
    stage ('SCM checkout'){
        git "https://github.com/wildec2/pwa-responsive-web-java-selenium-framework.git"
    }
 	stage ('Bring Up Selenium Grid'){
        sh "docker-compose up -d"
    }
 	stage ('Build'){
        sh "gradle clean build"
 	}
 	stage ('Run Tests') {
 	    sh "gradle clean runChromeSuite -Dheadless=true -Ddocker=true"
 	    sh "gradle clean runFirefoxSuite -Dheadless=true -Ddocker=true"
 	}
 	stage ('Bring Down Selenium Grid'){
        sh "docker-compose down"
    }
}