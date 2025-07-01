package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0025_PayrollEPF extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 3)
    public void verify_clkPayroll() throws InterruptedException {
        lp=new LeftMenuPage(driver);
        lp.clkPayroll();
    }

    @Test(priority = 4)
    public void verify_clkEPF()
    {
        Payroll_Pages pp=new Payroll_Pages(driver);
        pp.clkSetupMaster();
        Payroll_SetupMaster ps=new Payroll_SetupMaster(driver);
        ps.clkStatutoryComponents();
        PayrollStatutory_EPFPage pe=new PayrollStatutory_EPFPage(driver);
        pe.clkAddNewComponent();
        pe.enterCode("TestingEPF1234");
        pe.enterNameEpf("TestingEPF");
        pe.enterEmployeesContributionFormula("((Basic+DA)/100)*13");
        pe.enterEmployersContributionFormula("((Basic+DA)/100)*12");
        pe.clkSave();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
