package ui.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import ui.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
           try{
               String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
               TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
               File source = ts.getScreenshotAs(OutputType.FILE);
               String target = System.getProperty("user.dir") + "/test-output/Screenshots/"  + date + ".png";
               File finalDestination = new File(target);
               FileUtils.copyFile(source, finalDestination);
                     } catch (IOException e) {
               e.printStackTrace();
           }
        }
        Driver.closeDriver();
    }

}