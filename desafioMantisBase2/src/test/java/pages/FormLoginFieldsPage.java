package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormLoginFieldsPage extends BasePage {

    public FormLoginFieldsPage(WebDriver driver){
        super(driver);
    }
    private void usernameText(String username){
        driver.findElement(new By.ByName("username")).clear();
        driver.findElement(new By.ByName("username")).sendKeys(username);
    }

    private void passwordText(String password){
        driver.findElement(new By.ByName("password")).clear();
        driver.findElement(new By.ByName("password")).sendKeys(password);
    }

    public FormLoginFieldsPage FormLogin(String username, String password){
        usernameText(username);
        passwordText(password);
        return this;

    }

}
