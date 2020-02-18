package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = ".//input[@id=\"mailbox:login\"]")
    private WebElement loginInput;

    @FindBy(xpath = ".//input[@class=\"o-control\" and @type=\"submit\"]")
    private WebElement confirmCreds;

    @FindBy(xpath = ".//input[@id=\"mailbox:password\" and @class=\"input mailbox__input mailbox__input_password mailbox__rwd-control\"]")
    private WebElement passwordInput;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String login, String password){
        loginInput.sendKeys(login);
        confirmCreds.click();
        passwordInput.sendKeys(password);
        confirmCreds.click();
    }


}
