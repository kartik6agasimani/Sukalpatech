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

public class DirectionIndicatorLamp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://bv-reg.com/");
            driver.manage().window().maximize();

            WebElement logbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Get in (Login)']")));
            logbtn.click();

            WebElement usrname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            usrname.sendKeys("kartik1@yopmail.com");

            WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            pwd.sendKeys("Password");

            WebElement finlogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
            finlogin.click();


            WebElement 	Action = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[4]/td[5]/p[1]//*[name()='svg']")));
        	Action.click();
//        	
//        	---------------------------------------------------------------------------------------------------------------------------
//
        	
            WebElement DirectionIndicatorLamp  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[1]")));
            DirectionIndicatorLamp.click();
            
//            WebElement AddSupplier  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div/div/img")));
//            AddSupplier.click();
//            
//            
//            driver.findElement(By.id("field-:r2d:")).sendKeys("Supplier Name");
//            
//            driver.findElement(By.id("field-:r2e:")).sendKeys("TR12345");
//            
//            driver.findElement(By.id("field-:r2f:")).sendKeys("TAC67890");
//
//            WebElement licenceValidityDate = driver.findElement(By.id("field-:r2g:"));
//            licenceValidityDate.sendKeys(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//            driver.findElement(By.id("field-:r2h:")).sendKeys("123 456 789");
//
//            WebElement submissionDate = driver.findElement(By.id("field-:r2i:"));
//            submissionDate.sendKeys(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//            driver.findElement(By.id("field-:r2j:")).sendKeys("987 654 321");
//
//            WebElement copCertificationValidityDate = driver.findElement(By.id("field-:r2k:"));
//            copCertificationValidityDate.sendKeys(LocalDate.now().plusYears(2).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//            driver.findElement(By.cssSelector("button[type='submit']")).click();
            
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");

            
            WebElement tacValidityDate = driver.findElement(By.name("TAC_Validity&&&Front_Direction_Indicator_LED_Type"));
            tacValidityDate.sendKeys(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

            WebElement submissionDate = driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Front_Direction_Indicator_LED_Type"));
            submissionDate.sendKeys(LocalDate.now().plusMonths(1).format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

            WebElement copCertNo = driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Front_Direction_Indicator_LED_Type"));
            String copCertValue = "CoP789012 valid until " + LocalDate.now().plusYears(2).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            copCertNo.sendKeys(copCertValue);

            WebElement BulbTypeTacValidityDate = driver.findElement(By.name("TAC_Validity&&&Front_Direction_indicator_Bulb_Type"));
            BulbTypeTacValidityDate.sendKeys(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

            WebElement BulbTypeSubmissionDate = driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Front_Direction_indicator_Bulb_Type"));
            BulbTypeSubmissionDate.sendKeys(LocalDate.now().plusMonths(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

            WebElement BulbTypeCopCertNo = driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Front_Direction_indicator_Bulb_Type"));
            String BulbTypeCopCertValue = "CoP789012 valid until " + LocalDate.now().plusYears(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            BulbTypeCopCertNo.sendKeys(BulbTypeCopCertValue);

            WebElement RearLEDTacNumber = driver.findElement(By.name("TAC_Number&&&Rear_Direction_Indicator_LED_Type"));
            RearLEDTacNumber.sendKeys("TAC123456");

            WebElement RearLEDTacValidityDate = driver.findElement(By.name("TAC_Validity&&&Rear_Direction_Indicator_LED_Type"));
            RearLEDTacValidityDate.sendKeys(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

            WebElement RearLEDSubmissionDate = driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Rear_Direction_Indicator_LED_Type"));
            RearLEDSubmissionDate.sendKeys(LocalDate.now().plusMonths(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

            WebElement RearLEDCopCertNo = driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Rear_Direction_Indicator_LED_Type"));
            String RearLEDCopCertValue = "CoP789012 valid until " + LocalDate.now().plusYears(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            RearLEDCopCertNo.sendKeys(RearLEDCopCertValue);

            WebElement RearLED1CopCertNo = driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Rear_Direction_Indicator_Bulb_Type"));
            String RearLED1CopCertValue = "CoP789012 valid until " + LocalDate.now().plusYears(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            RearLED1CopCertNo.sendKeys(RearLED1CopCertValue);

            WebElement RearLED1SubmissionDate = driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Rear_Direction_Indicator_Bulb_Type"));
            RearLED1SubmissionDate.sendKeys(LocalDate.now().plusMonths(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

            WebElement RearLED1TacValidityDate = driver.findElement(By.name("TAC_Validity&&&Rear_Direction_Indicator_Bulb_Type"));
            RearLED1TacValidityDate.sendKeys(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

            WebElement tacValidityInput2 = driver.findElement(By.name("TAC_Validity&&&Side_Direction_Indicator"));
            tacValidityInput2.sendKeys(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

            WebElement submissionDateInput2 = driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Side_Direction_Indicator"));
            submissionDateInput2.sendKeys(LocalDate.now().plusDays(30).format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

            WebElement copCertInput2 = driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Side_Direction_Indicator"));
            copCertInput2.sendKeys("Your CoP Cert No. here");

//            WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[1]/form/div[6]/div/button[2]"));
//            button.click();
     
            
            
            
// a1            
            WebElement a1  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[1]/button[2]")));
            a1.click();
            
            
// Front Direction Indicator LED Type
            WebElement frontDirIndicatorsInput = driver.findElement(By.name("Front_Dir_Indiactors_colors&&&Front_Dir_Indicator_LED_Type"));
            frontDirIndicatorsInput.sendKeys("2 Demo");

            WebElement tacNumFrontDirIndicatorInput = driver.findElement(By.name("TAC_Num_Front_Direction_Indicator&&&Front_Dir_Indicator_LED_Type"));
            tacNumFrontDirIndicatorInput.sendKeys("TAC12345");

            WebElement makeFrontDirIndicatorInput = driver.findElement(By.name("Make_Front_Direction_Indicator&&&Front_Dir_Indicator_LED_Type"));
            makeFrontDirIndicatorInput.sendKeys("Demo");
            
            
  //Front Dir indicator Bulb Type          
           
            
            WebElement tacDirIndicatorFrontType = driver.findElement(By.name("TAC_Dir_Indicator&&&Front_Dir_indicator_Bulb_Type"));
            tacDirIndicatorFrontType.sendKeys("TAC12345");

            WebElement categoryAIS035FrontType = driver.findElement(By.name("Category_per_AIS_035&&&Front_Dir_indicator_Bulb_Type"));
            categoryAIS035FrontType.sendKeys("Demo 1");

            WebElement makeFrontDirIndicatorsFrontType = driver.findElement(By.name("Make_Front_Dir_Indicators&&&Front_Dir_indicator_Bulb_Type"));
            makeFrontDirIndicatorsFrontType.sendKeys("DemoX");
               
            
 //Rear Direction Indicator LED Type           
            
            WebElement makeRearDirectionIndicatorRearLED = driver.findElement(By.name("Make_Front_Direction_Indicator&&&Rear_Direction_Indicator_LED_Type"));
            makeRearDirectionIndicatorRearLED.sendKeys("DemoY");

            WebElement tacNoRearDirectionIndicatorRearLED = driver.findElement(By.name("TAC_Front_Direction_Indicator&&&Rear_Direction_Indicator_LED_Type"));
            tacNoRearDirectionIndicatorRearLED.sendKeys("TAC67890");
         
            WebElement numberColourLightRearLED = driver.findElement(By.name("Number_and_Colour_of_light&&&Rear_Direction_Indicator_LED_Type"));
            numberColourLightRearLED.sendKeys("Demo 2");  
            
          //  Rear Direction Indicator Bulb Type
            
            WebElement inputField = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > form:nth-child(1) > div:nth-child(6) > div:nth-child(3) > div:nth-child(1) > input:nth-child(2)"));
            inputField.sendKeys("Demo");
            
            WebElement flashingFrequencyRearBulb = driver.findElement(By.name("Flashing_Frequency&&&Rear_Direction_Indicator_Bulb_Type"));
            flashingFrequencyRearBulb.sendKeys("90");

            WebElement flasherDirectionIndicatorsRearBulb = driver.findElement(By.name("Flasher_Direc_Indicators&&&Rear_Direction_Indicator_Bulb_Type"));
            flasherDirectionIndicatorsRearBulb.sendKeys("Demo");

            WebElement identificationRearBulb = driver.findElement(By.name("TAC_BIS_License_E_Marking_no&&&Rear_Direction_Indicator_Bulb_Type"));
            identificationRearBulb.sendKeys("Demo 12345");

            WebElement categoryAIS035RearBulb = driver.findElement(By.name("Category_per_AIS_035&&&Rear_Direction_Indicator_Bulb_Type"));
            categoryAIS035RearBulb.sendKeys("Demo 2a");
            
            
            //Side Direction Indicator
            
            
            WebElement sideFlashingFrequencyInput = driver.findElement(By.name("Flashing_Freq_direc_indicator&&&Side_Direction_Indicator"));
            sideFlashingFrequencyInput.sendKeys("90");

            WebElement sideMakeFlasherInput = driver.findElement(By.name("Make_Flasher_Direc_Indicators&&&Side_Direction_Indicator"));
            sideMakeFlasherInput.sendKeys("ExampleMake");

            WebElement sideTACNumberInput = driver.findElement(By.name("TAC_Num_Side_Direc_Indiacator&&&Side_Direction_Indicator"));
            sideTACNumberInput.sendKeys("TAC123456");

            WebElement sideMakeIndicatorInput = driver.findElement(By.name("Make_Side_Direction_Indicator&&&Side_Direction_Indicator"));
            sideMakeIndicatorInput.sendKeys("DemoMake");

            WebElement sideColorLightInput = driver.findElement(By.name("Num_and_Colour_light&&&Side_Direction_Indicator"));
            sideColorLightInput.sendKeys("Demo 3");
            
            
            
//            
//            WebElement SUB = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[2]/form/div[6]/div/button[2]")));
//            SUB.click();
            
            
            
            
            
            
            

            Thread.sleep(5000);
            
          //  driver.close();
            
            
          

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
