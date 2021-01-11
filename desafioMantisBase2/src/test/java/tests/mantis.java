package tests;

import core.BaseTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import pages.ButtonsPage;
import pages.FormLoginFieldsPage;
import pages.FormReportIssueFieldsPage;
import pages.MyViewFieldsPage;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "src/test/java/data/data.csv")

public class mantis extends BaseTest {

    @Test
    public void testAutomationMantis(@Param(name = "username") String username,
                                        @Param(name = "password") String password,
                                        @Param(name = "MyProject") String MyProject,
                                        @Param(name = "category") String category,
                                        @Param(name = "reproducibility") String reproducibility,
                                        @Param(name = "severity") String severity,
                                        @Param(name = "priority") String priority,
                                        @Param(name = "profile") String profile,
                                        @Param(name = "platform") String platform,
                                        @Param(name = "os") String os,
                                        @Param(name = "osVersion") String osVersion,
                                        @Param(name = "summary") String summary,
                                        @Param(name = "description") String description,
                                        @Param(name = "stepsToReproduce") String stepsToReproduce,
                                        @Param(name = "additionalInfo") String additionalInfo) {

        new FormLoginFieldsPage(driver)
                .FormLogin(username,
                        password);

        new ButtonsPage(driver)
                .clickLoginButton();

        String mensageLogged = driver.findElement(By.className("login-info-left")).getText();
        Assert.assertTrue(mensageLogged.contains("Logged in as: " + username));

        new MyViewFieldsPage(driver)
                .MYViewPage(MyProject);

        new ButtonsPage(driver)
                .clickLinkReportIssue();

        new FormReportIssueFieldsPage(driver)
                .FormReportIssue(category,
                        reproducibility,
                        severity,
                        priority,
                        profile,
                        platform,
                        os,
                        osVersion,
                        summary,
                        description,
                        stepsToReproduce,
                        additionalInfo);

        new ButtonsPage(driver)
                .clickUploadFiles()
                .clickViewStatus()
                .clickReportStay()
                .clickSubmitReport();
        String mensageSuccessful = driver.findElement(By.cssSelector("div[align='center']")).getText();
        Assert.assertTrue(mensageSuccessful.contains("Operation successful."));
    }
}
