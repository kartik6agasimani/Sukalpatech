package bvreg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Miscellaneous {
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
            
            WebElement Action = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[4]/td[5]/p[1]//*[name()='svg']")));
            Action.click();
            Thread.sleep(4000);
            
            WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button/span[2]")));
            menuButton.click();
            Thread.sleep(2000);
            
            WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/button[5]")));
            menuItem.click();
            Thread.sleep(1000);
            
            WebElement VehiclePerformance = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class=' emotion-css-cache-gvqcbd']")));
            VehiclePerformance.click();
            Thread.sleep(1000);
            
            
            
            WebElement image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Add Supplier']")));
            image.click();
            
            Thread.sleep(1000);

            
            //
            //------------------------------------------------------------------------------------------------------------------------------------------------------------------
            
            
            WebElement supplierName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("nameOfSupplier")));
            supplierName.sendKeys("Sample Supplier Name");

            WebElement testReportNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("testReportNumber")));
            testReportNumber.sendKeys("TR123456");

            WebElement licenceNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("licenceNumber")));
            licenceNumber.sendKeys("LIC789012");

            LocalDate futureDate = LocalDate.now().plusYears(1);
            String formattedDate = futureDate.format(DateTimeFormatter.ISO_DATE);

            WebElement licenceValidityDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("licenceValidityDate")));
            licenceValidityDate.sendKeys(formattedDate);

            WebElement applicationReferenceNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("applicationReferenceNumber")));
            applicationReferenceNumber.sendKeys("ARN345678");

            WebElement submissionDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submissionDate")));
            submissionDate.sendKeys(LocalDate.now().format(DateTimeFormatter.ISO_DATE));

            WebElement copCertificationNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("copCertificationNumber")));
            copCertificationNumber.sendKeys("COP987654");

            WebElement copCertificationValidityDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("copCertificationValidityDate")));
            copCertificationValidityDate.sendKeys(formattedDate);
            

//          WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
//          addButton.click();
//          
//          
							            WebElement cancel2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div[2]/div[5]/div/button[1]")));
							            cancel2.click();

            
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
           // driver.quit();
        }
    }
}