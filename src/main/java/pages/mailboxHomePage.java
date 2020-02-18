package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailboxHomePage {
    @FindBy(xpath = ".//i[@class=\"x-ph__menu__button__text x-ph__menu__button__text_auth\" and @id=\"PH_user-email\"]")
    private WebElement accountName;

    private WebDriver driver;

    public mailboxHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}