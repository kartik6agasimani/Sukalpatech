package bvreg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FileUploads {
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

            WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/button[6]")));
            menuItem.click();
            Thread.sleep(1000);

            // New code for file upload
            WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[4]/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/label/span")));
            uploadButton.click();

            // You need to use AutoIT or Robot class to handle the file upload dialog
            // For this example, we'll assume you're using a tool like AutoIT to select the file
            // AutoIT script should select "E:\Kartik\Notes\a.docx" and click "Open"

            // Wait for the acknowledgement dialog
            WebElement acknowledgement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/label/span[1]")));
            acknowledgement.click();

            // Click the final confirmation
            WebElement confirmation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/label/span[1]")));
            confirmation.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Uncomment the next line when you're ready to close the browser automatically
            // driver.quit();
        }
    }
}