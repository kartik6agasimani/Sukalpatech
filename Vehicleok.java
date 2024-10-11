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

public class Vehicleok {
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
            
            WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='menu-list-:rd:-menuitem-:rh:']")));
            menuItem.click();
            
            Thread.sleep(1000);

            
            WebElement image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")));
            image.click();
            
            Thread.sleep(1000);
            

            WebElement TellTales = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/TellTales.png']")));
            TellTales.click();
            Thread.sleep(2000);
            
            
            WebElement vehicleControlsImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/VehicleControlsandTheirLocation.png']")));
            vehicleControlsImage.click();
            Thread.sleep(2000);

            WebElement brakesImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/Brakes.png']")));
            brakesImage.click();
            Thread.sleep(2000);

            WebElement suspensionImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/Suspension.png']")));
            suspensionImage.click();
            Thread.sleep(2000);

            WebElement weightsImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/Weights.png']")));
            weightsImage.click();
            Thread.sleep(2000);

            WebElement vehicleDimensionsImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/VehicleDimensions.png']")));
            vehicleDimensionsImage.click();
            Thread.sleep(2000);

            WebElement generalArrangementImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/Generalarrangementofthevehicle.png']")));
            generalArrangementImage.click();
            Thread.sleep(2000);


            
            WebElement indicatorsImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/Indicators.png']")));
            indicatorsImage.click();
            Thread.sleep(2000);

            WebElement vinImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/VehicleIdentificationNumber.png']")));
            vinImage.click();
            Thread.sleep(2000);

            WebElement handleLockImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/HandleLockAntiTheftDevice.png']")));
            handleLockImage.click();
            Thread.sleep(2000);

            WebElement aggregatesImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/TwoWheelerAggregates.png']")));
            aggregatesImage.click();
            Thread.sleep(2000);

            WebElement externalProjectionImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/TwoWheelerExternalProjection.png']")));
            externalProjectionImage.click();
            Thread.sleep(2000);

            WebElement driveTrainImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/DriveTrainsystem.png']")));
            driveTrainImage.click();
            Thread.sleep(2000);

            WebElement coolingSystem1Image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/CoolingSystem.png']")));
            coolingSystem1Image.click();
            Thread.sleep(2000);

            WebElement coolingSystem2Image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/images/allcomponetimages/CoolingSystem.png']")));
            coolingSystem2Image.click();
            Thread.sleep(2000);
            

            
            
            
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
           // driver.quit();
        }
    }
}