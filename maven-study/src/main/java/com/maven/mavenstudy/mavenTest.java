package com.maven.mavenstudy;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author yk
 * @date 2019/4/15 15:21
 */
@Mojo(name = "mavenPlugin")
public class mavenTest extends AbstractMojo {
    @Parameter
    private String args;
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
            File file=ResourceUtils.getFile(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("好哦"+args);
    }
    public static void circle(String filePath){

    }
}
