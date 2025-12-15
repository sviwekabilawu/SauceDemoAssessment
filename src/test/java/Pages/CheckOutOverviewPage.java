package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutOverviewPage {

    WebDriver driver;

    //Elements
    @FindBy(xpath = "//span[@class='title']")
    WebElement checkOutOverviewTitle;

    //Methods
    public CheckOutOverviewPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyCheckOutOverviewIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(checkOutOverviewTitle));
        checkOutOverviewTitle.isDisplayed();
    }

}
