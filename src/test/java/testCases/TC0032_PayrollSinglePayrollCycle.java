package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0032_PayrollSinglePayrollCycle extends BaseClass {

    LeftMenuPage lp;

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
        ps.clkPayrollCycleSetting();
        PayrollCycleSetting_SinglePayrollCycle psp=new PayrollCycleSetting_SinglePayrollCycle(driver);
        psp.clkSelectBusinessUnit();
        psp.selectFromDate();
        psp.selectAttendanceMarkingSetup();
        psp.selectAttendanceCaptureMode();
        psp.selectTypeOfAttends();
        psp.clkSave();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
