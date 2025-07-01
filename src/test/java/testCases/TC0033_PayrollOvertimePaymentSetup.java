package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0033_PayrollOvertimePaymentSetup extends BaseClass {

    LeftMenuPage lp;
    BasePage bp;

    @Test(priority = 3)
    public void verify_clkPayroll() throws InterruptedException {
        lp=new LeftMenuPage(driver);
        lp.clkPayroll();
    }

    @Test(priority = 4)
    public void verify_clkSetupMastert()
    {
        Payroll_Pages pp=new Payroll_Pages(driver);
        pp.clkSetupMaster();
        Payroll_SetupMaster ps=new Payroll_SetupMaster(driver);
        ps.clkOvertimePaymentSetup();
        PayrollOvertimePaymentSetup pop=new PayrollOvertimePaymentSetup(driver);
        pop.clkBusinessUnit();
        pop.clkOption1();
        pop.clkSave();
        bp=new BasePage(driver);
        bp.handleAlert();
        pop.clkOption2("400");
        pop.clkSave();
        bp.handleAlert();
    }
}
