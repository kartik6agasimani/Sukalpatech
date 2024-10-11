
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class loginxls {

    public static void main(String[] args) throws Exception {
        String[] emails = {
                "kartik1@yopmail.com",
                "kartik2@yopmail.com",
                "demoo3@yopmail.com",
                "demoo4@yopmail.com",
                "demoo5@yopmail.com"
        };

        String password = "Password";

        FileOutputStream fo = new FileOutputStream("E:\\Kartik\\eclips\\Sukalpatech\\Result.xls");
        WritableWorkbook wwb = Workbook.createWorkbook(fo);
        WritableSheet ws = wwb.createSheet("result1", 0);

        Label emailHeader = new Label(0, 0, "Email");
        Label resultHeader = new Label(1, 0, "Result");
        ws.addCell(emailHeader);
        ws.addCell(resultHeader);

        WebDriver[] drivers = new WebDriver[emails.length];
        WebDriverWait[] waits = new WebDriverWait[emails.length];

        for (int i = 0; i < emails.length; i++) {
            drivers[i] = new ChromeDriver();
            drivers[i].get("https://bv-reg.com/");
            waits[i] = new WebDriverWait(drivers[i], Duration.ofSeconds(10));
        }

        for (int i = 0; i < emails.length; i++) {
            WebDriver driver = drivers[i];
            WebDriverWait wait = waits[i];

            WebElement logbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Get in (Login)']")));
            logbtn.click();

            Thread.sleep(1000);

            WebElement usrname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            usrname.sendKeys(emails[i]);

            Thread.sleep(1000);

            WebElement pwd = driver.findElement(By.id("password"));
            pwd.sendKeys(password);

            Thread.sleep(1000);

            WebElement finlogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
            finlogin.click();

            Thread.sleep(1000);

            String result;
            if (driver.findElements(By.xpath("//b[@class='chakra-text emotion-css-cache-zdof9g']")).size() > 0) {
                result = "Login successful";
                System.out.println("Login successful for email: " + emails[i]);
            } else {
                result = "Login failed";
                System.out.println("Login failed for email: " + emails[i]);
            }

            Label emailLabel = new Label(0, i + 1, emails[i]);
            Label resultLabel = new Label(1, i + 1, result);
            ws.addCell(emailLabel);
            ws.addCell(resultLabel);

          driver.close();
        }

        wwb.write();
        wwb.close();
        fo.close();

        System.out.println("Records successfully updated in Excel.");
    }
}
