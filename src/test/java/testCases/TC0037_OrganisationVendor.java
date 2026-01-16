package testCases;

import org.testng.annotations.Test;
import pageObject.LeftMenuPage;
import pageObject.OrgSetup_CodePage;
import pageObject.OrgSetup_VendorPage;
import testBase.BaseClass;

public class TC0037_OrganisationVendor extends BaseClass {
    LeftMenuPage lp;
    OrgSetup_CodePage oc;
    OrgSetup_VendorPage ov;
    @Test
    public void verify_AddVendor()
    {
        lp=new LeftMenuPage(driver);
        lp.clkVendor();
        oc=new OrgSetup_CodePage(driver);
        oc.selectVendor();
        ov=new OrgSetup_VendorPage(driver);
        ov.clkAddNew();
        ov.selectVendorLogo();
        ov.enterVendorName("Akil Testing" + randomString());
        ov.enterVendorCode("Akil" + randomStringNumeric());
        ov.selectOrganisation();
        ov.selectServices();
        //ov.selectDivision();
        ov.enterWebsite(randomString().toLowerCase() + "@orgzstack.com");
        ov.enterPan("CJZPP" + randomNum() + "K");
        ov.enterTan("BTRT" + randomNum() + "1A");
        ov.enterGSTNo("09CDBSA" + randomNum() + "A1Z5");
        ov.enterAddress("Goregav" + randomString());
        ov.selectCountry();
        ov.selectState();
        ov.enterCity("Patna");
        ov.enterEmail(randomString().toLowerCase() + "@gmail.com");
        ov.enterPhoneNumber("98" + randomNumberMo());
        ov.enterMobileNumber("98" + randomNumberMo());
        ov.selectAcquiredBy();
        ov.selectAccountManager();
        ov.selectSegment();
        ov.selectAgreementCopy();
        ov.selectAgreementStartDate("16/02/2026");
        ov.selectAgreementEndDate("16/02/2028");
        ov.enterName("Jasvant" + randomString().toLowerCase());
        ov.selectEmailId(randomString().toLowerCase() + "@yahoo.com");
        ov.selectMobileNo("98" + randomNumberMo());
        ov.enterDesignatio("Senior Manager" + randomString());
        ov.enterAddSPOC();
    }
}
