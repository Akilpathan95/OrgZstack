package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;
import utilities.Dataproviders;

public class TC001_LoginTest extends BaseClass {

    //@Test //This is for single login
    public void verify_Login()
    {
        LoginPage lp=new LoginPage(driver);
        lp.enterEmail(p.getProperty("email"));
        lp.enterPassword(p.getProperty("password"));
        lp.clkLogin();
    }

    @Test(dataProvider = "LoginData", dataProviderClass = Dataproviders.class, groups = "Master") //Getting dataprovider from different class
    public void verify_LoginFromData(String email, String pwd, String exp)
    {
        logger.info("**** Starting TC003 LoginDDT started  ****");

        try
        {
            LoginPage lp=new LoginPage(driver);

            BasePage pp=new BasePage(driver);
            logger.info("**** Starting TC003 Pop-up handled  ****");
            pp.handleAlert();
            logger.info("**** Starting TC003 clearing the field  ****");

            logger.info("**** Starting TC003 email is entering  ****");

            lp.enterEmail(email);
            logger.info("**** Starting TC003 password is entering  ****");
            lp.enterPassword(pwd);
            lp.clkLogin();
            logger.info("**** Starting TC003 Login is done  ****");
            logger.info("**** Starting TC003 Pop is handeling  ****");
            pp.handleAlert();

            HomePage hp=new HomePage(driver);
            boolean targetPage=hp.isMyDashboardExists();


            if (exp.equalsIgnoreCase("Valid"))
            {
                if (targetPage == true)
                {
                    hp.clkMyProfile();
                    hp.clkLogOut();
                    Assert.assertTrue(true);
                }
                else
                {
                    Assert.assertTrue(false);
                }
            }

            if (exp.equalsIgnoreCase("Invalid"))
            {
                if (targetPage == true)
                {
                    hp.clkMyProfile();
                    hp.clkLogOut();
                    Assert.assertTrue(false);
                }
                else
                {
                    Assert.assertTrue(true);
                }
            }

        } catch (Exception e)
        {
            Assert.fail();
        }

    }
}
