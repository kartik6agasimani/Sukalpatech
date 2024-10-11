package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HazardWarningLamp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://auto-canon.in/");
            driver.manage().window().maximize();

            WebElement logbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Get in (Login)']")));
            logbtn.click();

            WebElement usrname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            usrname.sendKeys("demoo1@yopmail.com");

            WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            pwd.sendKeys("password");

            WebElement finlogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
            finlogin.click();


            WebElement 	Action = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[4]/td[5]/p[1]//*[name()='svg']")));
        	Action.click();
//        	
//        	---------------------------------------------------------------------------------------------------------------------------
//
        	
        	//HazardWarningLamp
//        	
//            WebElement HazardWarningLamp  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[3]/div[1]/img")));
//            HazardWarningLamp.click();
//            
//            
//            //Supplier
//            WebElement AddSupplier  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div/div/img")));
//            AddSupplier.click();
//            
//            driver.findElement(By.id("field-:r2d:")).sendKeys("Demo Supplier");
//
//            driver.findElement(By.id("field-:r2e:")).sendKeys("DEMO123");
//
//            driver.findElement(By.id("field-:r2f:")).sendKeys("DEMO456");
//
//            WebElement licenceValidityDate = driver.findElement(By.id("field-:r2g:"));
//            licenceValidityDate.sendKeys(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//            driver.findElement(By.id("field-:r2h:")).sendKeys("123 456 7890");
//
//            WebElement submissionDate = driver.findElement(By.id("field-:r2i:"));
//            submissionDate.sendKeys(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//            driver.findElement(By.id("field-:r2j:")).sendKeys("987 654 3210");
//
//            WebElement copCertificationValidityDate = driver.findElement(By.id("field-:r2k:"));
//            copCertificationValidityDate.sendKeys(LocalDate.now().plusYears(2).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
////
////            driver.findElement(By.cssSelector("button[type='submit']")).click();

            
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");
            
//             Hazard warning lamp Front Led Type
            WebElement hazardLedColorLightInput = driver.findElement(By.name("Num_and_Colour_of_light&&&Hazard_Warn_lamp_Front_Led"));
            hazardLedColorLightInput.sendKeys("demo");

            WebElement hazardLedIdentificationInput = driver.findElement(By.name("TAC_BIS_License_EMarking_num&&&Hazard_Warn_lamp_Front_Led"));
            hazardLedIdentificationInput.sendKeys("demo");

            WebElement hazardLedMakeInput = driver.findElement(By.name("Make&&&Hazard_Warn_lamp_Front_Led"));
            hazardLedMakeInput.sendKeys("demo");      

            // Front Direction indicator Bulb Type 
            driver.findElement(By.name("TAC_Dir_Indicator&&&Front_Dir_indicator_Bulb_Type"))
                  .sendKeys("demo");

            driver.findElement(By.name("Category_per_AIS_035&&&Front_Dir_indicator_Bulb_Type"))
                  .sendKeys("demo");

            driver.findElement(By.name("Make_Front_Dir_Indicators&&&Front_Dir_indicator_Bulb_Type"))
                  .sendKeys("demo");

            // Hazard warning Lamp LED Type  
            driver.findElement(By.name("TAC_BIS_EMarking_num&&&Hazard_warning_Lamp_LED_Type"))
                  .sendKeys("demo");

            driver.findElement(By.name("Make&&&Hazard_warning_Lamp_LED_Type"))
                  .sendKeys("demo");

            driver.findElement(By.name("TAC_BIS_EMarking_num&&&Hazard_warning_Lamp_LED_Type"))
                  .sendKeys("demo");

            //Rear Hazard Lamp
            driver.findElement(By.name("TAC_BIS_License_E_Marking_no&&&Rear_Hazard_Lamp"))
                  .sendKeys("demo");

            driver.findElement(By.name("Num_and_Colour_light&&&Rear_Hazard_Lamp"))
                  .sendKeys("demo");

            driver.findElement(By.name("Make&&&Rear_Hazard_Lamp"))
                  .sendKeys("demo");

            
            
            
            // Side Direction Indicator
            driver.findElement(By.name("Category_per_AIS_034&&&Hazard_warning_Lamp_LED_Type"))
                  .sendKeys("demo");
 
            driver.findElement(By.name("Max_intensity_Head_lamp&&&Side_Hazard_Lamp"))
                  .sendKeys("demo");

            driver.findElement(By.name("Num_and_Colour_light&&&Side_Hazard_Lamp"))
                  .sendKeys("demo");

            driver.findElement(By.name("TAC_BIS_LicenseEMarking_num&&&Side_Hazard_Lamp"))
                  .sendKeys("demo");

            driver.findElement(By.name("Make&&&Side_Hazard_Lamp"))
                  .sendKeys("demo");

            driver.findElement(By.name("Diagram_location_lighting&&&Side_Hazard_Lamp"))
                  .sendKeys("demo");

//            driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div/form/div[6]/div/button[2]"))
//           .click();

            
            Thread.sleep(5000);
           driver.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
