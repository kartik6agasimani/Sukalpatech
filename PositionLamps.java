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

public class PositionLamps {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://auto-canon.in/");
        

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
        	
            WebElement  PositionLamps  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div/div[7]/div/img")));
            PositionLamps.click();
            
//            
//          WebElement AddSupplier  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div/div/img")));
//          AddSupplier.click();
//          
//          driver.findElement(By.id("field-:r2d:")).sendKeys("demo");
//
//          driver.findElement(By.id("field-:r2e:")).sendKeys("demo");
//
//          driver.findElement(By.id("field-:r2f:")).sendKeys("demo");
//
//          WebElement licenceValidityDate = driver.findElement(By.id("field-:r2g:"));
//          licenceValidityDate.sendKeys(LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//          driver.findElement(By.id("field-:r2h:")).sendKeys("demo");
//
//          WebElement submissionDate = driver.findElement(By.id("field-:r2i:"));
//          submissionDate.sendKeys(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//          driver.findElement(By.id("field-:r2j:")).sendKeys("demo");
//
//          WebElement copCertificationValidityDate = driver.findElement(By.id("field-:r2k:"));
//          copCertificationValidityDate.sendKeys(LocalDate.now().plusYears(2).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//          driver.findElement(By.cssSelector("button[type='submit']")).click();
//            
            

            
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");
            
            
//            //Front Position Lamp LED Type
//      
//            driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Front_Position_Lamp_LED_Type")).sendKeys("demo");
//
//            driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Front_Position_Lamp_LED_Type")).sendKeys("06-06-2006");
//            driver.findElement(By.cssSelector("input[name='TAC_Validity&&&Front_Position_Lamp_LED_Type']")).sendKeys("06-06-2006");
//
//
//
//            
//            //Front Position Lamp Bulb Type
//            driver.findElement(By.cssSelector("input[name='TAC_Validity&&&Front_Position_Lamp_Bulb_Type']")).sendKeys("06-06-2006");
//            driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Front_Position_Lamp_Bulb_Type")).sendKeys("06-06-2006");
//            driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Front_Position_Lamp_Bulb_Type")).sendKeys("demo");
//            
//            
//            //Parking Lamp Bulb Rear
//            driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Parking_Lamp_Bulb_Rear")).sendKeys("demo");
//            driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Parking_Lamp_Bulb_Rear")).sendKeys("06-06-2006");
//            driver.findElement(By.cssSelector("input[name='TAC_Validity&&&Parking_Lamp_Bulb_Rear']")).sendKeys("06-06-2006");
//
//            
//            //Stop Lamp LED Type
//            driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Stop_Lamp_LED_Type")).sendKeys("demo");
//            driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Stop_Lamp_LED_Type")).sendKeys("06-06-2006");
//            driver.findElement(By.name("TAC_Validity&&&Stop_Lamp_LED_Type")).sendKeys("06-06-2006");
//
//
//            
//            
//            
//            
//            
//            //Stop lamp bulb Filament Type
//            driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Stop_lamp_bulb_Filament_Type")).sendKeys("demo");
//
//            driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Stop_lamp_bulb_Filament_Type")).sendKeys("06-06-2006");
//
//            driver.findElement(By.cssSelector("input[name='TAC_Validity&&&Stop_lamp_bulb_Filament_Type']")).sendKeys("06-06-2006");
//
//                      
//            WebElement sub1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[1]/form/div[6]/div/button[2]")));
//            sub1.click();
            
            WebElement a1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[1]/button[2]/div[2]")));
            a1.click();
            
            //Front Position Lamp LED Type

            driver.findElement(By.name("Number_of_Front_Position_lamps_and_Colour_of_light&&&Front_Position_Lamp_LED_Type")).sendKeys("demo");

            driver.findElement(By.cssSelector("input[name='TAC_Number_of_Front_Position_Lamp&&&Front_Position_Lamp_LED_Type']")).sendKeys("demo");

            driver.findElement(By.name("Make_of_front_Position_lamp&&&Front_Position_Lamp_LED_Type")).sendKeys("demo");

            //Front Position Lamp Bulb Type
            driver.findElement(By.cssSelector("input[name='TAC_Number_of_Front_Position_Lamp&&&Front_Position_Lamp_Bulb_Type']")).sendKeys("demo");

            driver.findElement(By.name("Category_as_per_AIS034&&&Front_Position_Lamp_Bulb_Type")).sendKeys("demo");

            driver.findElement(By.name("Make_of_Front_Position_Lamp&&&Front_Position_Lamp_Bulb_Type")).sendKeys("demo");

            driver.findElement(By.name("Front_Position_Lamp_Bulb_Filament_Type&&&Front_Position_Lamp_Bulb_Type")).sendKeys("demo");
            
            //Front Parking Lamp-LED Type
            driver.findElement(By.name("Number_of_Front_parking_lamps_and_their_colour&&&Front_Parking_Lamp_LED_Type")).sendKeys("demo");

            driver.findElement(By.cssSelector("input[name='TAC_No_Front_Parking_lamp&&&Front_Parking_Lamp_LED_Type']")).sendKeys("demo");

            driver.findElement(By.name("Make_of_Front_Parking_Lamp&&&Front_Parking_Lamp_LED_Type")).sendKeys("demo");

            driver.findElement(By.name("Front_Parking_Lamp_LED&&&Front_Parking_Lamp_LED_Type")).sendKeys("demo");

            
            //Front Parking Lamp Bulb type
            driver.findElement(By.cssSelector("input[name='TAC_No_Front_Parking_lamp&&&Front_Parking_Lamp_Bulb_type']")).sendKeys("demo");

            driver.findElement(By.name("Category_as_per_AIS_035&&&Front_Parking_Lamp_Bulb_type")).sendKeys("demo");

            driver.findElement(By.name("Make_of_Front_parking_lamp_bulb&&&Front_Parking_Lamp_Bulb_type")).sendKeys("demo");

            
            Thread.sleep(1000);
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("window.scrollBy(0, 1000)");
            
            
            //Parking Lamp Bulb Rear
           driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[2]/form/div[5]/div/div[4]/input[1]")).sendKeys("demo");
            driver.findElement(By.name("Category_as_per_AIS035&&&Parking_Lamp_Bulb_Rear")).sendKeys("demo");
            driver.findElement(By.name("Make_of_Parking_lamp_bulb_rear&&&Parking_Lamp_Bulb_Rear")).sendKeys("demo");
            driver.findElement(By.name("Parking_Lamp_bulb_Rear&&&Parking_Lamp_Bulb_Rear")).sendKeys("demo");
            
            
            //Stop Lamp LED Type
            driver.findElement(By.name("Number_of_Stop_lamps_installed_and_Colour_of_light&&&Stop_Lamp_LED_Type")).sendKeys("demo");
            driver.findElement(By.xpath("//div[6]//div[1]//div[2]//input[1]")).sendKeys("demo");
            driver.findElement(By.name("Make_of_Stop_lamp&&&Stop_Lamp_LED_Type")).sendKeys("demo");
            
            
            //
            driver.findElement(By.cssSelector("[name='TAC_Number&&&Stop_Lamp_bulb_Type']")).sendKeys("demo");
            driver.findElement(By.name("Category_as_per_AIS035&&&Stop_Lamp_bulb_Type")).sendKeys("demo");
            driver.findElement(By.name("Make_of_Stop_lamp_bulb&&&Stop_Lamp_bulb_Type")).sendKeys("demo");


            WebElement suba1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[2]/form/div[8]/div/button[2]")));
            suba1.click();
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
