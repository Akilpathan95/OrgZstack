package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0027_PayrollProfessionalTax extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 3)
    public void verify_clkPayroll() throws InterruptedException {
        lp=new LeftMenuPage(driver);
        lp.clkPayroll();
    }

    @Test(priority = 4)
    public void verify_clkProfessionalTax()
    {
        Payroll_Pages pp=new Payroll_Pages(driver);
        pp.clkSetupMaster();
        Payroll_SetupMaster ps=new Payroll_SetupMaster(driver);
        ps.clkStatutoryComponents();
        PayrollSetupMaster_StatutoryComponents psc=new PayrollSetupMaster_StatutoryComponents(driver);
        psc.clkProfessionalTax();
        PayrollStatutory_ProfessionalTaxPage ppt=new PayrollStatutory_ProfessionalTaxPage(driver);
        ppt.clkAddState();
        ppt.selectStateName("Karnataka");
        ppt.selectStateApplicable();
        ppt.selectEffectiveDate();
        ppt.selectSave();
        ppt.enterStateName("Karnataka");
        ppt.selectEffectiveDate();
        ppt.selectFrequency();
    }
}
