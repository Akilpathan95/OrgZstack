package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LeftMenuPage;
import pageObject.OrganisationSetup_ClientPage;
import testBase.BaseClass;

public class TC004_EditBusinessUnit extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 3)
    public void verify_clkBusinessUnit()
    {
        lp=new LeftMenuPage(driver);
        lp.clkBusinessUnit();
    }

    @Test(priority = 4)
    public void verify_EditBusinessUnit()
    {
        OrganisationSetup_ClientPage cp=new OrganisationSetup_ClientPage(driver);
        cp.clkEditBusinessUnit();
        cp.inputClientCode("Informatic-" + randomStringNumeric());
        cp.selectLogo();
        cp.inputAddress("Goregav");
        cp.enterLine2("Vakratunda Society");
        cp.selectCountry();
        cp.selectState();
        cp.inputCity("Mumbai");
        cp.inputPhoneNUmber(randomNumber());
        cp.inputMobileNumber(randomNumber());
        cp.inputEmail(randomString().toLowerCase() + "@orgzstack.com");
        cp.inputWebsite("https://app.orgzstack.com/index");
        cp.inputPan("CJ" + randomStringNumeric().toUpperCase() + "1K");
        cp.inputTan("C" + randomStringNumeric().toUpperCase() + "12K");
        cp.inputGST("22" + "AB" + randomStringNumeric().toUpperCase() + "F2Z5");
        cp.enterIndustry("IT");
        cp.clkUpdate();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
