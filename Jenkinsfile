pipeline {
	agent any
		tools {
        maven 'MAVEN_HOME' 
    }
		stages {
				stage ('Compile Stage') {
					steps {
							bat 'mvn clean compile'
					}
			}
				stage ('Install Stage') {
					steps {
							bat 'mvn install'
						}
					}
				}
	}		