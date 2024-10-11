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

public class DaytimeRunningLamp {
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
        	
            WebElement  DaytimeRunningLamp  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div/div[6]/div[1]")));
            DaytimeRunningLamp.click();

            
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
            
            

            
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");
            
            //Daytime Running Lamp  
            driver.findElement(By.name("CoP_Cert_No_with_validity_date&&&Daytime_Running_Lamp")).sendKeys("demo");
            driver.findElement(By.name("Possible_date_of_submission_of_required_approval&&&Daytime_Running_Lamp")).sendKeys("06-06-2006");
            driver.findElement(By.cssSelector("input[name='TAC_Validity&&&Daytime_Running_Lamp']")).sendKeys("demo");
            driver.findElement(By.name("Make&&&Daytime_Running_Lamp")).sendKeys("demo");
               
            WebElement sub = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div/form/div[2]/div/button[2]")));
            sub.click();
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}