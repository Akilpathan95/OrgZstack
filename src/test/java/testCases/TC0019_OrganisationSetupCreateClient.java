package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LeftMenuPage;
import pageObject.OrganisationSetup_ClientPage;
import testBase.BaseClass;

public class TC0019_OrganisationSetupCreateClient extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 2)
    public void verify_AddClient() {
        lp=new LeftMenuPage(driver);
        lp.clkClient();
        OrganisationSetup_ClientPage oc=new OrganisationSetup_ClientPage(driver);
        oc.clkAddNew();
        oc.enterClientName("AkilTesting");
        oc.selectLogo();
        oc.inputClientCode(randomString().toLowerCase() + "7086" );
        oc.inputAddress("Goregav" + randomString().toLowerCase());
        oc.clkCountry();
        oc.clkState();
        oc.clkCity();
        oc.inputPhoneNUmber("98" + randomNumberMo());
        oc.inputMobileNumber("98" + randomNumberMo());
        oc.inputEmail(randomString().toLowerCase() + "@ips.com");
        oc.clkAcquiredBy();
        oc.clkAccManager();
        oc.selectSegment();
        oc.inputWebsite(randomString().toLowerCase() + "ips.in");
        oc.selectServices();
        oc.inputGST("22" + "AB" + randomStringNumeric().toUpperCase() + "F2Z5");
        oc.inputPan("CJ" + randomStringNumeric().toUpperCase() + "1K");
        oc.inputTan("C" + randomStringNumeric().toUpperCase() + "12K");
        oc.selectAgreementCopy();
        oc.selectAgreementStartDate("14-08-2023");
        oc.selectAgreementEndDate("14-08-2025");
        oc.inputName("Ghouse" + randomString().toLowerCase());
        oc.inputEmailID(randomString().toLowerCase() + "@ips.com");
        oc.inputMobileNo(randomNumber());
        oc.inputDesignation("Testing" + randomString().toLowerCase());
        oc.clkAddSPOC();
        oc.contractual("100000", "200000", "7");
        oc.selectBonus();
        oc.permanent("20000");
        oc.clkAdd();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
