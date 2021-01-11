package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public ButtonsPage clickLoginButton(){
        driver.findElement(new By.ByClassName("button")).click();
        return this;
    }

    public ButtonsPage clickLinkReportIssue() {
        driver.findElement(new By.ByLinkText("Report Issue")).click();
        return this;
    }

    public ButtonsPage clickSubmitReport() {
        driver.findElement(By.cssSelector("input[tabindex='17']")).click();
        return this;
    }

    public ButtonsPage clickUploadFiles(){
        driver.findElement(By.name("ufile[]")).sendKeys(System.getProperty("user.dir") + "/src/test/java/image/mantis.png");
        driver.findElement(By.name("ufile[]"));
        return this;
    }

    public ButtonsPage clickViewStatus(){
        driver.findElement(By.cssSelector("input[tabindex='15']")).click();
        return this;
    }

    public ButtonsPage clickReportStay(){
        driver.findElement(new By.ById("report_stay")).click();
        return this;
    }

}
