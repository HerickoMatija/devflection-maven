# Devflection maven plugin example project 

## Introduction

This project is to demonstrate how to create your own simple Maven Plugin. 
There are two two Maven projects - the actual plugin implementation and a dummy project from where we can execute the plugin.

# Build the plugin

To build the plugin go into the folder

	cd example-plugin

and execute the maven command to build the plugin and install it in your local Maven repository
	
	mvn clean install
	
# Call the plugin

To call the plugin move into the plugin-caller folder

	cd plugin-caller
	
and execute either

	mvn hello-world:helloworld
	
to run the plugin directly or 

	mvn compile

to run it as part of the compile phase.