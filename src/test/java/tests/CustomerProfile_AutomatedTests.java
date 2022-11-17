package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://yubi.cloud.testinsights.io/app/#!/model-engine/guid/9010edde-c945-4651-a977-c1f6927c027f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 115, profileId = 100019)
public class CustomerProfile_AutomatedTests extends TestBase
{
    

    
    @Test  (groups= {"Customer Profile","Customer Profile - Automated Tests"})
    @TestModellerPath(guid = "5a3573a2-2746-42ad-aaba-a09242d1d7e6")
    public void CustomerLogintoCreditCreateaDealClickYubiLoansClickTermLoanClickProvidedealdetailsEnterloanAm()
    {
        
           pages.Login _Login = new pages.Login(getDriver());
    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Enter_Email_address("arunef1customer@yopmail.com");

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Click_Continue();

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Enter_Password("Think@1234");

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Click_Continue();

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Enter_Digit_1("9");

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Enter_Digit_2("9");

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Enter_Digit_3("9");

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Enter_Digit_4("9");

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Enter_Digit_5("9");

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Enter_Digit_6("9");

    TestModellerLogger.SetLastNodeGuid("c681d6c1-1771-4c54-88a4-129cd1c04bd7");
    _Login.Click_Verify_Email();

   pages.Deal_Initiation _Deal_Initiation = new pages.Deal_Initiation(getDriver());
    TestModellerLogger.SetLastNodeGuid("984bb371-2335-47b6-8145-d827550d6505");
    _Deal_Initiation.Click_Create_a_deal();

    TestModellerLogger.SetLastNodeGuid("4ab5a6d8-e5f2-4dc1-8334-4aec7e082c25");
    _Deal_Initiation.Click_Yubi_Loans();

    TestModellerLogger.SetLastNodeGuid("c83f604d-bb56-46e0-b48f-24caa6bb9198");
    _Deal_Initiation.Click_Term_Loan();

    TestModellerLogger.SetLastNodeGuid("c83f604d-bb56-46e0-b48f-24caa6bb9198");
    _Deal_Initiation.Click_Continue();

    TestModellerLogger.SetLastNodeGuid("93208d38-b210-42fb-880d-09f8e02e31ce");
    _Deal_Initiation.Click_Provide_deal_details();

    TestModellerLogger.SetLastNodeGuid("e06360f4-ee83-45fb-8524-2206393174e1");
    _Deal_Initiation.Enter_loan_Amount("4912");

    TestModellerLogger.SetLastNodeGuid("e72314f8-d2bb-4d92-a6cf-357a10647bd3");
    _Deal_Initiation.Enter_Rate_of_Interest("2");

    TestModellerLogger.SetLastNodeGuid("4eb97d11-d9cb-48b0-ad5d-f9e3c5845318");
    _Deal_Initiation.Select_Tenure();

    TestModellerLogger.SetLastNodeGuid("4eb97d11-d9cb-48b0-ad5d-f9e3c5845318");
    _Deal_Initiation.Click__4_Years();

    TestModellerLogger.SetLastNodeGuid("ac7b13f8-4e08-4c8c-8183-b0dd3f0897a7");
    _Deal_Initiation.Select_Loan_Type();

    TestModellerLogger.SetLastNodeGuid("ac7b13f8-4e08-4c8c-8183-b0dd3f0897a7");
    _Deal_Initiation.Select_New_loan();

    TestModellerLogger.SetLastNodeGuid("ac7b13f8-4e08-4c8c-8183-b0dd3f0897a7");
    _Deal_Initiation.Select_Unsecured();

    TestModellerLogger.SetLastNodeGuid("b79d53c4-658e-4822-bd0a-66a20376b7d4");
    _Deal_Initiation.Select_Corporate();

    TestModellerLogger.SetLastNodeGuid("7ec9fcc9-87fc-48c8-b4f6-0e10362f76e4");
    _Deal_Initiation.Select_Capex();

    TestModellerLogger.SetLastNodeGuid("d75d94a2-ab84-4b4a-895b-545303dc4c37");
    _Deal_Initiation.Click_Submit_application();

    TestModellerLogger.SetLastNodeGuid("d863e80f-1a35-47de-b704-5745ef639cc1");
    _Deal_Initiation.Click_Dismiss();

    TestModellerLogger.SetLastNodeGuid("8137f716-11d9-4aa9-85f4-0fb709df3e47");
    _Deal_Initiation.Click_Transaction_Header();

   pages.Home _Home = new pages.Home(getDriver());
    TestModellerLogger.SetLastNodeGuid("8137f716-11d9-4aa9-85f4-0fb709df3e47");
    _Home.Click_Yubi_Loans();

   pages.Loan_Transaction_Page _Loan_Transaction_Page = new pages.Loan_Transaction_Page(getDriver());
    TestModellerLogger.SetLastNodeGuid("e07fc043-2891-4a22-a246-035f59aa3b76");
    _Loan_Transaction_Page.Click_Live_deal();

   pages.Loan_Transactions _Loan_Transactions = new pages.Loan_Transactions(getDriver());
    TestModellerLogger.SetLastNodeGuid("b014a3b5-4ac0-4822-963b-e84be1640727");
    _Loan_Transactions.Click_Select_Recent_Deal();

    }


}