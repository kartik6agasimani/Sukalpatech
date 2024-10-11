package auto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addnewrequest {
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

            WebElement addNewRequestBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add New Request']")));
            addNewRequestBtn.click();

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

        } catch (Exception e) {
            e.printStackTrace();
        } finally {}
    }
}
