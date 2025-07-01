package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0031_PayrollGratuity extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 3)
    public void verify_clkPayroll() throws InterruptedException {
        lp=new LeftMenuPage(driver);
        lp.clkPayroll();
    }

    @Test(priority = 4)
    public void verify_clkGratuity()
    {
        Payroll_Pages pp=new Payroll_Pages(driver);
        pp.clkSetupMaster();
        Payroll_SetupMaster ps=new Payroll_SetupMaster(driver);
        ps.clkStatutoryComponents();
        PayrollSetupMaster_StatutoryComponents psc=new PayrollSetupMaster_StatutoryComponents(driver);
        psc.clkGratuity();
        PayrollStatutory_BonusAndLeaveWageAndGratuityPage pb=new PayrollStatutory_BonusAndLeaveWageAndGratuityPage(driver);
        pb.clkAddNewComponent();
        pb.enterBonusCode("TestingBonus01");
        pb.enterBonusName("TestingBonus");
        pb.enterEmployeesContributionFormula("Bonus = (Basic Salary + Dearness Allowance) * 8.33 / 100");
        pb.clkSave1();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
