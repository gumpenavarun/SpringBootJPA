pipeline {
	agent any
		tools {
        maven 'Maven_Latest' 
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