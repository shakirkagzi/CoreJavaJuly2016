package account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Shakir on 4/20/2017.
 */
public class GmailRegistrationPage {
    public static WebDriver driver;
    public GmailRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    protected By signinButton =By.xpath("//a[contains(text(),'Sign In')]");
}
