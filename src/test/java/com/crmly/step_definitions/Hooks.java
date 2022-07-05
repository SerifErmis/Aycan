package com.crmly.step_definitions;

import com.crmly.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


  /*  @Before
    public void setupScenario(){

    }*/

    @After
    public void teardownScenario(Scenario scenario){
        //if(scenario.isFailed()){}
        byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","IMAGE of "+scenario.getName() );

        Driver.closeDriver();
    }

}
