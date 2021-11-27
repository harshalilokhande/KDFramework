package com.testingshastra.stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources",glue={"com.testingshastra.stepdefinitions"},dryRun=true)
public class Runner extends AbstractTestNGCucumberTests{
 
}
