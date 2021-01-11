package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MyViewFieldsPage extends BasePage {
    public MyViewFieldsPage(WebDriver driver){
        super(driver);
    }

    private void myProjectText(String myProject) {
        Select dropdown = new Select(driver.findElement(new By.ByName("project_id")));
        dropdown.selectByValue(myProject);
    }

    public MyViewFieldsPage MYViewPage(String MyProject){
        myProjectText(MyProject);
        return this;

    }
}
