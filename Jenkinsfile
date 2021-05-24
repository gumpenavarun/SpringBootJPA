pipeline {
	agent any
		tools {
        maven 'maven_3.8.1' 
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