package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormReportIssueFieldsPage extends BasePage {

    public FormReportIssueFieldsPage(WebDriver driver){
        super(driver);
    }

    private void categoryText(String category) {
        Select dropdown = new Select(driver.findElement(new By.ByName("category_id")));
        dropdown.selectByVisibleText(category);
    }

    private void reproducibilityText(String reproducibility) {
        Select dropdown = new Select(driver.findElement(new By.ByName("reproducibility")));
        dropdown.selectByVisibleText(reproducibility);
    }

    private void severityText(String severity) {
        Select dropdown = new Select(driver.findElement(new By.ByName("severity")));
        dropdown.selectByVisibleText(severity);
    }

    private void priorityText(String priority) {
        Select dropdown = new Select(driver.findElement(new By.ByName("priority")));
        dropdown.selectByVisibleText(priority);
    }

    private void profileText(String profile) {
        Select dropdown = new Select(driver.findElement(new By.ByName("profile_id")));
        dropdown.selectByVisibleText(profile);
    }

    private void platformText(String platform){
        driver.findElement(new By.ByName("platform")).clear();
        driver.findElement(new By.ByName("platform")).sendKeys(platform);
    }

    private void osText(String os){
        driver.findElement(new By.ByName("os")).clear();
        driver.findElement(new By.ByName("os")).sendKeys(os);
    }

    private void osVersionText(String osVersion){
        driver.findElement(new By.ByName("os_build")).clear();
        driver.findElement(new By.ByName("os_build")).sendKeys(osVersion);
    }

    private void summaryText(String summary){
        driver.findElement(new By.ByName("summary")).clear();
        driver.findElement(new By.ByName("summary")).sendKeys(summary);
    }

    private void descriptionText(String description){
        driver.findElement(new By.ByName("description")).clear();
        driver.findElement(new By.ByName("description")).sendKeys(description);
    }

    private void stepsToReproduceText(String stepsToReproduce){
        driver.findElement(new By.ByName("steps_to_reproduce")).clear();
        driver.findElement(new By.ByName("steps_to_reproduce")).sendKeys(stepsToReproduce);
    }

    private void additionalInfoText(String additionalInfo){
        driver.findElement(new By.ByName("additional_info")).clear();
        driver.findElement(new By.ByName("additional_info")).sendKeys(additionalInfo);
    }

    public FormReportIssueFieldsPage FormReportIssue(String category,
                                                     String reproducibility,
                                                     String severity,
                                                     String priority,
                                                     String profile,
                                                     String platform,
                                                     String os,
                                                     String osVersion,
                                                     String summary,
                                                     String description,
                                                     String stepsToReproduce,
                                                     String additionalInfo){
        categoryText(category);
        reproducibilityText(reproducibility);
        severityText(severity);
        priorityText(priority);
        profileText(profile);
        platformText(platform);
        osText(os);
        osVersionText(osVersion);
        summaryText(summary);
        descriptionText(description);
        stepsToReproduceText(stepsToReproduce);
        additionalInfoText(additionalInfo);
        return this;

    }
}
