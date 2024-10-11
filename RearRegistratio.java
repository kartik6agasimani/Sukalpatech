package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RearRegistratio {
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

            WebElement action = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[4]/td[5]/p[1]//*[name()='svg']")));
            action.click();
            
            WebElement action1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[3]/td[5]/p[1]//*[name()='svg']")));
            action1.click();
            
            
            WebElement nextSection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Add Supplier']")));
            nextSection.click();

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
//
//            WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
//            addButton.click();
//            
            
							            WebElement cancel2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div[2]/div[5]/div/button[1]")));
							            cancel2.click();
            

            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");

            WebElement a1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[1]/button[2]")));
            a1.click();

            WebElement makeInput = wait.until(ExpectedConditions.elementToBeClickable(By.name("Make_Rear_Reg_Plate_Lamp&&&Registration_Plate_Lamp_LED_Type")));
            makeInput.click();
            makeInput.sendKeys("Sample Make");

            WebElement tacInput = wait.until(ExpectedConditions.elementToBeClickable(By.name("TAC_Rear_Reg_Plate_Lamp&&&Registration_Plate_Lamp_LED_Type")));
            tacInput.click();
            tacInput.sendKeys("Sample123456");

            WebElement numberColourInput = wait.until(ExpectedConditions.elementToBeClickable(By.name("Number_and_Colour_light&&&Registration_Plate_Lamp_LED_Type")));
            numberColourInput.click();
            numberColourInput.sendKeys("2 Sample");

            WebElement makeOfNumberPlateLampBulb = wait.until(ExpectedConditions.elementToBeClickable(By.name("Make_Number_Plate_Lamp_Bulb&&&Registration_Plate_Lamp_bulb_type")));
            makeOfNumberPlateLampBulb.click();
            makeOfNumberPlateLampBulb.sendKeys("Sample Make");

            WebElement categoryPerAIS035 = wait.until(ExpectedConditions.elementToBeClickable(By.name("Category_per_AIS_035&&&Registration_Plate_Lamp_bulb_type")));
            categoryPerAIS035.click();
            categoryPerAIS035.sendKeys("Sample AIS-035");

            WebElement tacOfNumberPlateLampBulb = wait.until(ExpectedConditions.elementToBeClickable(By.name("TAC_Number_Plate_Lamp_Bulb&&&Registration_Plate_Lamp_bulb_type")));
            tacOfNumberPlateLampBulb.click();
            tacOfNumberPlateLampBulb.sendKeys("TAC Sample");

//            WebElement sub2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/div[2]/form/div[3]/div/button[2]")));
//            sub2.click();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
