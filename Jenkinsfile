pipeline {
	agent any
		tools {
        maven 'MAVEN_HOME' 
    }
		stages {
				stage ('Clean Stage') {
					steps {
							bat 'mvn clean'
					}
			}	stage ('Compile Stage') {
					steps {
							bat 'mvn compile'
					}
			}
				stage ('Install Stage') {
					steps {
							bat 'mvn install'
						}
					}
				}
	}		