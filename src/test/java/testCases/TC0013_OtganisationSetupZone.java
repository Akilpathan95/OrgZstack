package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LeftMenuPage;
import pageObject.OrgSetup_CodePage;
import testBase.BaseClass;

public class TC0013_OtganisationSetupZone extends BaseClass {

    LeftMenuPage lp;
    OrgSetup_CodePage oc;
    BasePage bp;

    @Test(priority = 2)
    public void verify_AddZone()
    {

        lp=new LeftMenuPage(driver);
        lp.clkZone();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak70869" + randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
        bp=new BasePage(driver);
        bp.handleAlert();
    }

    @Test(priority = 3)
    public void verify_EditZone()
    {
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterSearch("Testing");
        oc.clkEdit();
        oc.enterCode("Ak7086" + randomNumber());
        oc.enterDescrption("Desciption for Division " + randomString());
        oc.clkUpdate();
        bp = new BasePage(driver);
        bp.handleAlert();
    }

    @Test(priority = 4)
    public void verify_DeleteZone() throws InterruptedException {
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing Delete");
        oc.enterCode("Ak70869" + randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
        bp = new BasePage(driver);
        bp.handleAlert();
        oc.enterSearch("Testing Delete");
        oc.clkDelete();
        Thread.sleep(1000);
        bp.handleAlert();
    }
}
