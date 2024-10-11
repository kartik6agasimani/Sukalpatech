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

public class safetycomponent2 {
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
            
            WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[2]")));
            menuItem.click();
            
            Thread.sleep(1000);

            
            WebElement image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")));
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
          
            
            
            WebElement rearViewMirror1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/WheelRim.png']")));
            rearViewMirror1.click();
            
            WebElement clickableImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")));
            clickableImage.click();

            Thread.sleep(1000);

            // --------------------------------------------------------------------------------------------------

            WebElement supplierNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("nameOfSupplier")));
            supplierNameField.sendKeys("Sample Supplier Name");

            WebElement reportNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("testReportNumber")));
            reportNumberField.sendKeys("TR123456");

            WebElement licenseNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("licenceNumber")));
            licenseNumberField.sendKeys("LIC789012");

            LocalDate futureDates = LocalDate.now().plusYears(1);
            String formattedDates = futureDate.format(DateTimeFormatter.ISO_DATE);

            WebElement licenseValidityDateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("licenceValidityDate")));
            licenseValidityDateField.sendKeys(formattedDate);

            WebElement applicationRefNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("applicationReferenceNumber")));
            applicationRefNumberField.sendKeys("ARN345678");

            WebElement submissionDateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submissionDate")));
            submissionDateField.sendKeys(LocalDate.now().format(DateTimeFormatter.ISO_DATE));

            WebElement copCertificationNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("copCertificationNumber")));
            copCertificationNumberField.sendKeys("COP987654");

            WebElement copCertificationValidityDateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("copCertificationValidityDate")));
            copCertificationValidityDateField.sendKeys(formattedDate);

            // WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
            // addButton.click();

            WebElement cancelButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div[2]/div[5]/div/button[1]")));
            cancelButton.click();

            
            

            WebElement rearViewMirror2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/Horn.png']")));
            rearViewMirror2.click();

            // Click on HandleLock image
            WebElement handleLock = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/HydraulicBrakeHose.png']")));
            handleLock.click();
            
            Thread.sleep(1000);

            // Click on SpraySuppression image
            WebElement spraySuppression = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/BrakeFluid.png']")));
            spraySuppression.click();
            Thread.sleep(1000);

            
            // Click on BrakeFluid images
            WebElement brakeFluid1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[8]/div[1]")));
            brakeFluid1.click();
            Thread.sleep(1000);

            WebElement brakeFluid2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[contains(@src, '/images/allcomponetimages/BrakeFluid.png')][2]")));
            brakeFluid2.click();
            Thread.sleep(1000);


            // Click on HydraulicBrakeHose image
            WebElement hydraulicBrakeHose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[contains(@src, '/images/allcomponetimages/HydraulicBrakeHose.png')]")));
            hydraulicBrakeHose.click();
            Thread.sleep(1000);

            WebElement spraySuppressio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/SpraySuppression.png']")));
            spraySuppressio.click();
            Thread.sleep(1000);


            // Click on Horn images
            WebElement horn1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[contains(@src, '/images/allcomponetimages/Horn.png')][1]")));
            horn1.click();
            Thread.sleep(1000);


            WebElement horn2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[contains(@src, '/images/allcomponetimages/Horn.png')][2]")));
            horn2.click();
            Thread.sleep(1000);
            

            WebElement brakeFluid3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/BrakeFluid.png']")));
            brakeFluid3.click();
            Thread.sleep(1000);

            
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
           // driver.quit();
        }
    }
}