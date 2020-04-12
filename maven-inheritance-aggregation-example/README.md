# Devflection maven example project using aggregation and inheritance 

## Introduction

This project is to demonstrate how aggregation and inheritance in Maven is used. 
The project structure is 
    
    -devflection-bank
        -devflection-bank-core
        -devflection-bank-desktop
        -devflection-bank-web

# Build the plugin

To build the whole project go into the root project

	cd devflection-bank

and execute the maven command
	
	mvn clean install

This generates two executable jar files (desktop app and webapp). They are located in the target directory of
their respective project. To execute them do

    cd devflection-bank-desktop/target

or 

    cd devflection-bank-web/target

and execute them with:

    java -jar devflection-bank-desktop-1.0-SNAPSHOT-jar-with-dependencies.jar

or 

    java -jar devflection-bank-web-1.0-SNAPSHOT.jar