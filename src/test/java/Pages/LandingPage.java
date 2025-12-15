package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {

    WebDriver driver;

    //Elements
    @FindBy(xpath = "//span[@class='title']")
    WebElement productsTitle;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement emptyCart;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebElement fullCart;


    //Methods
    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyProductTitleIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productsTitle));
        productsTitle.isDisplayed();
    }

    public void clickAddToCartButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addCartButton));
        addCartButton.click();
    }

    public void confirmAddedToCart(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(fullCart));
        fullCart.isDisplayed();
    }

    public void clickCartButton(){
       fullCart.click();
    }

}
