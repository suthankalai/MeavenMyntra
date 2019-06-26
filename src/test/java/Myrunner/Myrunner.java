package Myrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Kalai\\MavenMyntra\\src\\main\\java\\Features\\SignUp.feature",
glue= {"StepDefinition"}
 )

public class Myrunner {

}
