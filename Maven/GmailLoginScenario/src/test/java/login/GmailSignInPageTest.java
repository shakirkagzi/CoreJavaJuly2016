package login;

import account.Base;
import account.GmailSignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 4/19/2017.
 */
public class GmailSignInPageTest extends Base{
    @Test
    public void Login_To_Gmail() throws InterruptedException {
        GmailSignInPage signInPage = new GmailSignInPage(driver);
        signInPage.clickOnSignIn();
        sleepFor(5);
        signInPage.enterUsername("shakirkagzi");
        signInPage.clickOnNextButton();
        sleepFor(5);
        signInPage.enterPassword("shakir84");
        signInPage.clickOnsigninforlogon();
        sleepFor(10);
        Assert.assertTrue(GmailSignInPage.validateGoogleIconDisplay());
        sleepFor(10);
        signInPage.clickOnProfilePic();
        signInPage.clickOnSignoutButton();
        sleepFor(5);
    }
}
