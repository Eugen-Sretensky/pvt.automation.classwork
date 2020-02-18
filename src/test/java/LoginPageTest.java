import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginPageTest {
    private LoginPage loginPage;
    private WebDriver driver;

    @BeforeClass
    public void before(){
        System.setProperty("webdriver.chrome.driver", "D:\\students\\Java_Automation\\E.S\\chromedriver_win32\\chromedriver.exe");        WebDriver driver = new ChromeDriver();
        driver.get("http://mail.ru");
        loginPage = new LoginPage(driver);
    }
    @Test
    public void testLogin(){
        loginPage.login("wane-bruce", "pvtautomation");
        //......
        //Assert.assertEquals("wane-bruce@mail.ru", );
    }

    @AfterClass
    public void after(){
        driver.close();
    }
}
