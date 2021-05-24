pipeline {
	agent any
		tools {
        maven 'maven_3.8.1' 
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