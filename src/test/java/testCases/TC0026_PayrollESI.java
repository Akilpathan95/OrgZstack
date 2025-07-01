package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0026_PayrollESI extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 3)
    public void verify_clkPayroll() throws InterruptedException {
        lp=new LeftMenuPage(driver);
        lp.clkPayroll();
    }

    @Test(priority = 4)
    public void verify_clkESI()
    {
        Payroll_Pages pp=new Payroll_Pages(driver);
        pp.clkSetupMaster();
        Payroll_SetupMaster ps=new Payroll_SetupMaster(driver);
        ps.clkStatutoryComponents();
        PayrollSetupMaster_StatutoryComponents psc=new PayrollSetupMaster_StatutoryComponents(driver);
        psc.clkESI();
        PayrollStatutory_ESIPage pe=new PayrollStatutory_ESIPage(driver);
        pe.clkAddNewComponentESI();
        pe.enterCodeESI("TestingEPF1234");
        pe.enterNameEpfESI("TestingEPF");
        pe.enterEmployeesContributionFormulaESI("((Basic+DA)/100)*13");
        pe.enterEmployersContributionFormula("((Basic+DA)/100)*12");
        pe.clkSave();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
