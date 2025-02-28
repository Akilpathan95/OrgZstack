package testCases;

import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.RequisitionPage;
import testBase.BaseClass;

import java.time.Duration;

public class TC002_CreateRequition extends BaseClass {

    @Test(priority = 1)
    public void verify_Login()
    {
        LoginPage lp=new LoginPage(driver);
        lp.enterEmail(p.getProperty("email"));
        lp.enterPassword(p.getProperty("password"));
        lp.clkLogin();
    }

    @Test(priority = 2)
    public void click_requisition()
    {
        HomePage hp=new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        hp.clkRequisition();
    }

    @Test(priority = 3)
    public void click_RequisitionPage()
    {
        RequisitionPage rp=new RequisitionPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        rp.clkRequitionPage();
        rp.clkCreateRequisition();
        rp.clkCreateRequisitionPopUp();
    }


}
