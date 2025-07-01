package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0028_PayrollLWF extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 3)
    public void verify_clkPayroll() throws InterruptedException {
        lp=new LeftMenuPage(driver);
        lp.clkPayroll();
    }

    @Test(priority = 4)
    public void verify_clkLWF()
    {
        Payroll_Pages pp=new Payroll_Pages(driver);
        pp.clkSetupMaster();
        Payroll_SetupMaster ps=new Payroll_SetupMaster(driver);
        ps.clkStatutoryComponents();
        PayrollSetupMaster_StatutoryComponents psc=new PayrollSetupMaster_StatutoryComponents(driver);
        psc.clkLWF();
        PayrollStatutory_LWFPage pl=new PayrollStatutory_LWFPage(driver);
        pl.clkAddState();
        pl.selectStateName();
        pl.selectLWFApplicable();
        pl.selectLWFApplicableEffectiveDate();
        pl.clkSave();
        pl.selectFrequencyType();
        pl.selectMonth();
        pl.enterEmpContributionAmount("1500");
        pl.enterEmployersContributionAmount("1500");
        pl.enterRemark("It is LWF");
        pl.changeSave();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
