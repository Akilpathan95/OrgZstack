package testCases;

import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.RequisitionPage;
import pageObject.Requisition_FormPage;
import testBase.BaseClass;

import java.time.Duration;

public class TC002_CreateRequition extends BaseClass {


    @Test(priority = 2, groups = "Master")
    public void click_requisition()
    {
        HomePage hp=new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        hp.clkRequisition();
    }

    @Test(priority = 3, groups = "Master")
    public void click_RequisitionPage()
    {
        RequisitionPage rp=new RequisitionPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        rp.clkRequitionPage();
        rp.clkCreateRequisition();
        rp.clkCreateRequisitionPopUp();
    }

    @Test(priority = 4, groups = "Master")
    public void fill_NewRequirement()
    {
        Requisition_FormPage form=new Requisition_FormPage(driver);
        form.clkSelectTypeCanditate();
        form.enterJobTitle("Senior Software Tester");
        form.clkPriority();
        form.clkBusinessUnit();
        form.clkDepartment();
        form.clkRequirementType();
        form.clkWorkLocationPlus();
        form.enterLocationName("Navi Mumbai");
        form.enterPosition("2");
        form.verifytxtTotal_NumberOf_Position();
        form.clkWorkLocationPlus();
        form.enterLocationName("Mumbai");
        form.enterPosition("3");
        form.clkWorkLocationPlus();
        form.enterLocationName("Pune");
        form.enterPosition("5");
        form.clkWorkLocationMinus();
        form.enterFunctionalArea("IT Department");
        form.enterPrimarySkill("Automation Testing With Java");
        form.enterKeySkill("Java with Selenium");
        form.enterQualification("B.sc in Computer Science");
        form.enterAgeGroupFrom("21");
        form.enterAgeGroupTo("60");
        form.enterJobDescription("We are looking for a Software Tester to assess software quality through manual and automated testing. You will be responsible for identifying bugs, reporting defects, and ensuring our applications meet high-quality standards before deployment. The ideal candidate should have a keen eye for detail, strong analytical skills, and experience in software testing methodologies.");
        form.enterCTC_from("10");
        form.enterCTC_To("15");
        form.enterRemark("Candidate clear the first round");
        form.enterTAT("30");
        form.clkReset();
    }
}
