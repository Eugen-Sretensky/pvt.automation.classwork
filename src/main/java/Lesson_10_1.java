import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Lesson_10_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\students\\Java_Automation\\E.S\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        //chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://www.mail.ru");
        WebElement loginInput = chromeDriver.findElement(By.xpath(".//input[@id=\"mailbox:login\"]"));
        loginInput.sendKeys("wane-bruce");
        WebElement confirmLogin = chromeDriver.findElement(By.xpath(".//input[@class=\"o-control\" and @type=\"submit\"]"));
        confirmLogin.click();
       //Wait
        WebElement explicitWait = (new WebDriverWait(chromeDriver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//input[@id=\"mailbox:password\" and @class=\"input mailbox__input mailbox__input_password mailbox__rwd-control\"]")));
        WebElement inputPassword = chromeDriver.findElement(By.xpath(".//input[@id=\"mailbox:password\" and @class=\"input mailbox__input mailbox__input_password mailbox__rwd-control\"]"));
        inputPassword.sendKeys("pvtautomation");
        WebElement confirmPassword = chromeDriver.findElement(By.xpath(".//input[@class=\"o-control\" and @type=\"submit\"]"));
        confirmPassword.click();
        //Wait
        explicitWait = (new WebDriverWait(chromeDriver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//i[@class=\"x-ph__menu__button__text x-ph__menu__button__text_auth\" and @id=\"PH_user-email\"]")));
        WebElement accountName = chromeDriver.findElement(By.xpath(".//i[@class=\"x-ph__menu__button__text x-ph__menu__button__text_auth\" and @id=\"PH_user-email\"]"));
        System.out.println(accountName.getText());

    }
}
