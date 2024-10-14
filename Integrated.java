package autocanon;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Integrated {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://bv-reg.com/");
            driver.manage().window().maximize();

            WebElement logbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Get in (Login)']")));
            logbtn.click();

            WebElement usrname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            usrname.sendKeys("kartik2@yopmail.com");

            WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            pwd.sendKeys("Password");

            WebElement finlogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
            finlogin.click();
//        	
//        	---------------------------------------------------------------------------------------------------------------------------
//

            WebElement addNewRequestBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add New Request']")));
            addNewRequestBtn.click();
            
//            WebElement 	Action = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[4]/td[5]/p[1]//*[name()='svg']")));
//        	  Action.click();
//        	
        	   
            Select vehicleTypeSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("vehicle_type"))));
            vehicleTypeSelect.selectByVisibleText("2 Wheeler");

            Select fuelTypeSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("fuel_type"))));
            fuelTypeSelect.selectByVisibleText("Battery Operated");

            Select certificationTypeSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("certification_type"))));
            certificationTypeSelect.selectByVisibleText("New-Type Approval Certification");

            Select vehicleMaxSpeedSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("vehicle_max_speed"))));
            vehicleMaxSpeedSelect.selectByIndex(1);

            Select nominalPowerSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("motor_nominal_power"))));
            nominalPowerSelect.selectByIndex(1);

            Select peakPowerSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("motor_peak_power"))));
            peakPowerSelect.selectByIndex(1);

            Select lengthSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("vehicle_length"))));
            lengthSelect.selectByIndex(1);

            Select heightSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("vehicle_height"))));
            heightSelect.selectByIndex(1);

            Select widthSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("vehicle_width"))));
            widthSelect.selectByIndex(1);

            WebElement unloadedWeightInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("vehicle_unloded_weight")));
            unloadedWeightInput.sendKeys("100");

            Select categorySelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("vehicle_category"))));
            categorySelect.selectByIndex(1);

            Select agencySelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.name("prefered_testing_agency"))));
            agencySelect.selectByVisibleText("ARAI");

//            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
//            submitButton.click();
            
            Thread.sleep(1000);
            
            
            
					
					            WebElement cancel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div/div[13]/div/button[1]")));
					            cancel.click();
					            
					            WebElement yes = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/dialog/button[1]")));
					            yes.click();
//            
					            
					            
					            
            WebElement action = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[3]/td[5]/p[1]//*[name()='svg']")));
            action.click();
            
            
            WebElement nextSection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Add Supplier']")));
            nextSection.click();

            WebElement supplierName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("nameOfSupplier")));
            supplierName.sendKeys("Sample Supplier Name");

            WebElement testReportNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("testReportNumber")));
            testReportNumber.sendKeys("TR123456");

            WebElement licenceNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("licenceNumber")));
            licenceNumber.sendKeys("LIC789012");
            
            Thread.sleep(2000);

            LocalDate futureDate = LocalDate.now().plusYears(1);
            String formattedDate = futureDate.format(DateTimeFormatter.ISO_DATE);

            WebElement licenceValidityDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("licenceValidityDate")));
            licenceValidityDate.sendKeys(formattedDate);
            
            Thread.sleep(2000);


            WebElement applicationReferenceNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("applicationReferenceNumber")));
            applicationReferenceNumber.sendKeys("ARN345678");

            WebElement submissionDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submissionDate")));
            submissionDate.sendKeys(LocalDate.now().format(DateTimeFormatter.ISO_DATE));

            WebElement copCertificationNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("copCertificationNumber")));
            copCertificationNumber.sendKeys("COP987654");
            
            Thread.sleep(2000);


            WebElement copCertificationValidityDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("copCertificationValidityDate")));
            copCertificationValidityDate.sendKeys(formattedDate);
////
//            WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
//            addButton.click();
//            
            
							            WebElement cancel2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div[2]/div[5]/div/button[1]")));
							            cancel2.click();
            
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");
            
          //Registration Plate Lamp LED Type
          driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Registration_Plate_Lamp_LED_Type")).sendKeys("demo");
          driver.findElement(By.name("TAC_Validity&&&Registration_Plate_Lamp_LED_Type")).sendKeys("06-06-2006");
          driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Registration_Plate_Lamp_LED_Type")).sendKeys("06-06-2006");
          
          

          
          
          //Registration Plate Lamp bulb type
          
          driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Registration_Plate_Lamp_bulb_type")).sendKeys("demo");

          driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Registration_Plate_Lamp_bulb_type")).sendKeys("06-06-2006");

          driver.findElement(By.name("TAC_Validity&&&Registration_Plate_Lamp_bulb_type")).sendKeys("06-06-2006");
          
          
//        WebElement sub1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[1]/form/div[3]/div/button[2]")));
//        sub1.click();

          //a1

        WebElement a1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[1]/button[2]")));
        a1.click();

          
          //Registration Plate Lamp LED Type
          
          
        WebElement makeInput = wait.until(ExpectedConditions.elementToBeClickable(By.name("Make_Rear_Reg_Plate_Lamp&&&Registration_Plate_Lamp_LED_Type")));
        makeInput.click();
        makeInput.sendKeys("Sample Make");

        WebElement tacInput = wait.until(ExpectedConditions.elementToBeClickable(By.name("TAC_Rear_Reg_Plate_Lamp&&&Registration_Plate_Lamp_LED_Type")));
        tacInput.click();
        tacInput.sendKeys("Sample123456");

        WebElement numberColourInput = wait.until(ExpectedConditions.elementToBeClickable(By.name("Number_and_Colour_light&&&Registration_Plate_Lamp_LED_Type")));
        numberColourInput.click();
        numberColourInput.sendKeys("2 Sample");
          
          
        //  /Registration Plate Lamp LED Type

        WebElement makeOfNumberPlateLampBulb = wait.until(ExpectedConditions.elementToBeClickable(By.name("Make_Number_Plate_Lamp_Bulb&&&Registration_Plate_Lamp_bulb_type")));
        makeOfNumberPlateLampBulb.click();
        makeOfNumberPlateLampBulb.sendKeys("Sample Make");


          
        WebElement categoryPerAIS035 = wait.until(ExpectedConditions.elementToBeClickable(By.name("Category_per_AIS_035&&&Registration_Plate_Lamp_bulb_type")));
        categoryPerAIS035.click();
        categoryPerAIS035.sendKeys("Sample AIS-035");

        WebElement tacOfNumberPlateLampBulb = wait.until(ExpectedConditions.elementToBeClickable(By.name("TAC_Number_Plate_Lamp_Bulb&&&Registration_Plate_Lamp_bulb_type")));
        tacOfNumberPlateLampBulb.click();
        tacOfNumberPlateLampBulb.sendKeys("TAC Sample");

//        WebElement sub2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[2]/form/div[3]/div/button[2]")));
//        sub2.click();
        
        
//    	
//    	---------------------------------------------------------------------------------------------------------------------------
//
        
        ///DirectionIndicatorLamp 
        
        
        
        WebElement DirectionIndicatorLamp  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[1]")));
        DirectionIndicatorLamp.click();
        
        WebElement AddSupplier  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div/div/img")));
        AddSupplier.click();
        
        
        WebElement supplierName2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("nameOfSupplier")));
        supplierName2.sendKeys("Sample Supplier Name");

        WebElement testReportNumber2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("testReportNumber")));
        testReportNumber2.sendKeys("TR123456");

        WebElement licenceNumber2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("licenceNumber")));
        licenceNumber2.sendKeys("LIC789012");

        LocalDate futureDate2 = LocalDate.now().plusYears(1);
        String formattedDate2 = futureDate.format(DateTimeFormatter.ISO_DATE);

        WebElement licenceValidityDate2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("licenceValidityDate")));
        licenceValidityDate2.sendKeys(formattedDate);

        WebElement applicationReferenceNumber2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("applicationReferenceNumber")));
        applicationReferenceNumber2.sendKeys("ARN345678");

        WebElement submissionDate2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submissionDate")));
        submissionDate2.sendKeys(LocalDate.now().format(DateTimeFormatter.ISO_DATE));

        WebElement copCertificationNumber2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("copCertificationNumber")));
        copCertificationNumber2.sendKeys("COP987654");

        WebElement copCertificationValidityDate2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("copCertificationValidityDate")));
        copCertificationValidityDate2.sendKeys(formattedDate);
////        
//        WebElement addButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
//		addButton2.click();
//        
        Thread.sleep(1000);
        
        
		        
		        WebElement cancel3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div[2]/div[5]/div/button[1]")));
		        cancel3.click();
				            
				            
				            
//        
        Thread.sleep(1000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0, 200)");
        
       
        } catch (Exception e) {
        	e.printStackTrace();
        } 
        finally {
			driver.close();
		}
      }
	}
	
