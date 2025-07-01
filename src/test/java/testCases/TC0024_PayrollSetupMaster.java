package testCases;

import org.testng.annotations.Test;
import pageObject.LeftMenuPage;
import pageObject.PayrollPage_VariableMaster;
import pageObject.Payroll_Pages;
import testBase.BaseClass;

public class TC0024_PayrollSetupMaster extends BaseClass {

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
        PayrollPage_VariableMaster rp=new PayrollPage_VariableMaster(driver);
        rp.clkSelectBU();
        rp.clkBUOption();
        rp.clkAddNewVariable();
        rp.clkVariableType();
        rp.clkTAX();
        rp.enterAutoVariableCode("Testing1234");
        rp.enterVariableName("Testing");
        rp.enterVariableDescription("This is new Variable for Earning");
        rp.clkSave();
    }
}
