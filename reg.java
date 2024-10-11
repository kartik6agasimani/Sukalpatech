package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class reg {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bv-reg.com/");

        WebElement getStartedButton = driver.findElement(By.xpath("//button[normalize-space()='Get started']"));
        getStartedButton.click();

        driver.findElement(By.name("firstName")).sendKeys("Demo");
        driver.findElement(By.name("lastName")).sendKeys("User");
        driver.findElement(By.name("emailId")).sendKeys("kartik7@yopmail.com");
        Thread.sleep(2000);

        Select businessType = new Select(driver.findElement(By.name("typeOfBusiness")));
        businessType.selectByVisibleText("Company");

        driver.findElement(By.name("businessName")).sendKeys("Demo Enterprises");
        driver.findElement(By.name("registrationDate")).sendKeys("07-10-2024");
        driver.findElement(By.name("registrationNumber")).sendKeys("REG123456");
        driver.findElement(By.name("address1")).sendKeys("#28, 5th Cross");
        driver.findElement(By.name("address2")).sendKeys("Indiranagar");
        driver.findElement(By.name("city")).sendKeys("Bangalore");
        driver.findElement(By.name("zipCode")).sendKeys("560038");
        driver.findElement(By.name("contact")).sendKeys("9845698889");
        driver.findElement(By.name("alternateContact")).sendKeys("9845698890");

        Select countrySelect = new Select(driver.findElement(By.name("country")));
        countrySelect.selectByVisibleText("India");

        Select stateSelect = new Select(driver.findElement(By.name("state")));
        stateSelect.selectByVisibleText("Chandigarh");

     
        WebElement termsLabel = driver.findElement(By.xpath("//span[contains(text(),'I agree terms and condition')]"));
        termsLabel.click();
        
        Thread.sleep(2000);

        WebElement registerButton = driver.findElement(By.xpath("//button[normalize-space()='Register']"));
        registerButton.click();
        
        Thread.sleep(2000);
//        driver.close();
//      
    }
}
