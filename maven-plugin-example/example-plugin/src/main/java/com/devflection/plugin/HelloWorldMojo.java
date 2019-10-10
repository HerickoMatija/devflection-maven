package com.devflection.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Says a custom message that is passed to it or
 * "Hello world from our own maven plugin!"
 */
@Mojo(name = "helloworld")
public class HelloWorldMojo extends AbstractMojo {

    /**
     * The message to display.
     */
    @Parameter(property = "helloworld.message", defaultValue = "Hello world from our own maven plugin!")
    private String message;

    public void execute() throws MojoExecutionException {
        getLog().info(message);
    }
}
