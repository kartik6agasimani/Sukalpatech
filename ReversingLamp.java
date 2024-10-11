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

public class ReversingLamp {
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
        	
            WebElement  ReversingLamp  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div/div[8]/div[1]/img")));
            ReversingLamp.click();
            
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
            js.executeScript("window.scrollBy(0,800)");
            
            //Reversing Lamp

            wait.until(ExpectedConditions.elementToBeClickable(By.name("CoP_Cert_No_with_validity_date&&&Reversing_Lamp"))).sendKeys("demo");

            wait.until(ExpectedConditions.elementToBeClickable(By.name("Possible_date_of_submission_of_required_approval&&&Reversing_Lamp"))).sendKeys("06-06-2006");

            wait.until(ExpectedConditions.elementToBeClickable(By.name("TAC_Validity&&&Reversing_Lamp"))).sendKeys("06-06-2006");

            
            //Reverse Lamp Bulb Type
            wait.until(ExpectedConditions.elementToBeClickable(By.name("CoP_Cert_No_with_validity_date&&&Reverse_Lamp_Bulb_Type"))).sendKeys("demo");

            wait.until(ExpectedConditions.elementToBeClickable(By.name("Possible_date_of_submission_of_required_approval&&&Reverse_Lamp_Bulb_Type"))).sendKeys("06-06-2006");

            wait.until(ExpectedConditions.elementToBeClickable(By.name("TAC_Validity&&&Reverse_Lamp_Bulb_Type"))).sendKeys("06-06-2006");
            
            
        //    WebElement  sub  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div/div[8]/div[1]/img")));
        //   sub.click();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}