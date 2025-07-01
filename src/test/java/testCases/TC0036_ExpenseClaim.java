package testCases;

import org.testng.annotations.Test;
import pageObject.LeftMenuPage;
import pageObject.MyReimbursements;
import testBase.BaseClass;

public class TC0036_ExpenseClaim extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 3)
    public void verify_Reimbursement()
    {
        lp=new LeftMenuPage(driver);
        lp.clkReimbursement();

    }

    @Test(priority = 4)
    public void verify_PettyExpenseClaim() {

        MyReimbursements mr=new MyReimbursements(driver);
        mr.clkExpenseClaim();
        mr.clkAddDetails();
        mr.enterBillDate();
        mr.selectClaimType();
        mr.enterAmount("600");
        mr.addFile();
        mr.enterAddRemark("One Month Mobile Bill");
        mr.clkAddExpence();
    }

    @Test(priority = 5)
    public void verify_TravelExpenseClaim() throws InterruptedException {
        MyReimbursements mr=new MyReimbursements(driver);
        mr.clkTravelExpense();
        mr.enterTripName("Banglore");
        mr.enterPurpose("Business Trip");
        mr.selectTravelDateFrom();
        mr.selectTravelDateTo();
        mr.enterLocationFrom("Mumbai");
        mr.enterLocationTo("Banglore");
        mr.clkAddDetails();
        mr.enterBillDate();
        mr.selectClaimType();
        mr.enterAmount("600");
        mr.addFile();
        mr.enterAddRemark("One Month Mobile Bill");
        mr.clkAddExpence();

    }
}
