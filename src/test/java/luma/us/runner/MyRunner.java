package luma.us.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json" },		 	
		features = {".//Features/"}, 
        glue = {"luma.us.stepdefinition","luma.us.hooks"}, 	
        	   //dryRun = true,  // Stop the execution and give me new steps = true
        	                               // If false then browser and steps 
                //monochrome = true, 
               //strict = false,
		tags = "@smoke") 



public class MyRunner extends AbstractTestNGCucumberTests{

}
