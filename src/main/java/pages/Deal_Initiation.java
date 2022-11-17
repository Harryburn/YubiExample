package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jayway.jsonpath.JsonPath;

// https://yubi.cloud.testinsights.io/app/#!/module-collection/guid/fc31dff2-eb2b-4043-9a90-6c76b845d76c
@TestModellerModule(guid = "fc31dff2-eb2b-4043-9a90-6c76b845d76c")
public class Deal_Initiation extends BasePage
{
	public Deal_Initiation (WebDriver driver)
	{
		super(driver);
	}


	
	private By _4_YearsElem = By.xpath("//DIV[contains(text(),'4 Years')]");

	private By CapexElem = By.xpath("//LABEL[contains(text(),'Capex')]");

	private By ContinueElem = By.xpath("//BUTTON[contains(text(),'Continue')]");

	private By CorporateElem = By.xpath("//LABEL[@for='dealGuarantee-corporate']");

	private By Create_a_dealElem = By.xpath("//BUTTON[@id='term']");

	private By Deal_Guarantee_No_GuaranteeElem = By.xpath("//LABEL[contains(text(),'No Guarantee')]");

	private By DismissElem = By.xpath("//*[contains(text(),'Dismiss')]");

	private By End_Use_Acquisition_FinancingElem = By.xpath("//LABEL[contains(text(),'Acquisition Financing')]");

	private By Enter_loan_AmountElem = By.xpath("//INPUT[@name='amount']");

	private By Live_dealElem = By.xpath("//BUTTON[contains(text(),'Live deal')]");

	private By New_loanElem = By.xpath("//DIV[contains(text(),'New loan')]");

	private By NextElem = By.xpath("//BUTTON[contains(text(),'Next')]");

	private By Provide_deal_detailsElem = By.xpath("//BUTTON[contains(text(),'+ Provide deal details')]");

	private By Rate_of_InterestElem = By.xpath("//INPUT[@name='roi']");

	private By Security_Type_UnsecuredElem = By.xpath("//INPUT[@value='unsecured']");

	private By Select_Loan_TypeElem = By.xpath("//*[contains(text(),'Loan type')]/../div/div/div");

	private By Select_TenureElem = By.xpath("//*[contains(text(),'Tenure')]/../div/div/div");

	private By Select_Term_LoanElem = By.xpath("//LABEL[@for='tl']");

	private By Select_YubiLoanElem = By.xpath("//DIV[@class='sc-gKXOVf bhofdz sc-kTGBUR eKnSgL vc-grid vc-grid-container dvc--1 el-selection']");

	private By Submit_applicationElem = By.xpath("//BUTTON[contains(text(),'Submit application')]");

	private By Transaction_HeaderElem = By.xpath("//P[contains(text(),'Transactions')]");

	private By UnsecuredElem = By.xpath("//INPUT[@value='unsecured']");

	private By WCDLElem = By.xpath("//LABEL[@for='wcdl']");

	private By Yubi_LoansElem = By.xpath("//SPAN[contains(text(),'Loans')]");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/deal-creation/term/loans/deal-details";

        if (!currentUrl.equals("https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/deal-creation/term/loans/deal-details")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click 4 Years
     * @name Click 4 Years
     */
    public void Click__4_Years()
    {
         
        WebElement elem = getWebElement(_4_YearsElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__4_Years", "Click__4_Years failed. Unable to locate object: " + _4_YearsElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__4_Years", "Click__4_Years failed. Unable to locate object: " + _4_YearsElem.toString());

            Assert.fail("Unable to locate object: " + _4_YearsElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click__4_Years");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click__4_Years");
    }
      
	/**
 	 * Click Continue
     * @name Click Continue
     */
    public void Click_Continue()
    {
         
        WebElement elem = getWebElement(ContinueElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Continue", "Click_Continue failed. Unable to locate object: " + ContinueElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Continue", "Click_Continue failed. Unable to locate object: " + ContinueElem.toString());

            Assert.fail("Unable to locate object: " + ContinueElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Continue");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Continue");
    }
      
	/**
 	 * Click Create a deal
     * @name Click Create a deal
     */
    public void Click_Create_a_deal()
    {
         
        WebElement elem = getWebElement(Create_a_dealElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Create_a_deal", "Click_Create_a_deal failed. Unable to locate object: " + Create_a_dealElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Create_a_deal", "Click_Create_a_deal failed. Unable to locate object: " + Create_a_dealElem.toString());

            Assert.fail("Unable to locate object: " + Create_a_dealElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Create_a_deal");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Create_a_deal");
    }
      
	/**
 	 * Click Deal Guarantee - No Guarantee
     * @name Click Deal Guarantee - No Guarantee
     */
    public void Click_Deal_Guarantee_No_Guarantee()
    {
         
        WebElement elem = getWebElement(Deal_Guarantee_No_GuaranteeElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Deal_Guarantee_No_Guarantee", "Click_Deal_Guarantee_No_Guarantee failed. Unable to locate object: " + Deal_Guarantee_No_GuaranteeElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Deal_Guarantee_No_Guarantee", "Click_Deal_Guarantee_No_Guarantee failed. Unable to locate object: " + Deal_Guarantee_No_GuaranteeElem.toString());

            Assert.fail("Unable to locate object: " + Deal_Guarantee_No_GuaranteeElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Deal_Guarantee_No_Guarantee");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Deal_Guarantee_No_Guarantee");
    }
      
	/**
 	 * Click Dismiss
     * @name Click Dismiss
     */
    public void Click_Dismiss()
    {
         
        WebElement elem = getWebElement(DismissElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Dismiss", "Click_Dismiss failed. Unable to locate object: " + DismissElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Dismiss", "Click_Dismiss failed. Unable to locate object: " + DismissElem.toString());

            Assert.fail("Unable to locate object: " + DismissElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Dismiss");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Dismiss");
    }
      
	/**
 	 * Click End Use - Acquisition Financing
     * @name Click End Use - Acquisition Financing
     */
    public void Click_End_Use_Acquisition_Financing()
    {
         
        WebElement elem = getWebElement(End_Use_Acquisition_FinancingElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_End_Use_Acquisition_Financing", "Click_End_Use_Acquisition_Financing failed. Unable to locate object: " + End_Use_Acquisition_FinancingElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_End_Use_Acquisition_Financing", "Click_End_Use_Acquisition_Financing failed. Unable to locate object: " + End_Use_Acquisition_FinancingElem.toString());

            Assert.fail("Unable to locate object: " + End_Use_Acquisition_FinancingElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_End_Use_Acquisition_Financing");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_End_Use_Acquisition_Financing");
    }
      
	/**
 	 * Click Live deal
     * @name Click Live deal
     */
    public void Click_Live_deal()
    {
         
        WebElement elem = getWebElement(Live_dealElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Live_deal", "Click_Live_deal failed. Unable to locate object: " + Live_dealElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Live_deal", "Click_Live_deal failed. Unable to locate object: " + Live_dealElem.toString());

            Assert.fail("Unable to locate object: " + Live_dealElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Live_deal");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Live_deal");
    }
      
	/**
 	 * Click New loan
     * @name Click New loan
     */
    public void Click_New_loan()
    {
         
        WebElement elem = getWebElement(New_loanElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_loan", "Click_New_loan failed. Unable to locate object: " + New_loanElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_loan", "Click_New_loan failed. Unable to locate object: " + New_loanElem.toString());

            Assert.fail("Unable to locate object: " + New_loanElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_New_loan");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_New_loan");
    }
      
	/**
 	 * Click Next
     * @name Click Next
     */
    public void Click_Next()
    {
         
        WebElement elem = getWebElement(NextElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Next", "Click_Next failed. Unable to locate object: " + NextElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Next", "Click_Next failed. Unable to locate object: " + NextElem.toString());

            Assert.fail("Unable to locate object: " + NextElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Next");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Next");
    }
      
	/**
 	 * Click Provide deal details
     * @name Click Provide deal details
     */
    public void Click_Provide_deal_details()
    {
         
        WebElement elem = getWebElement(Provide_deal_detailsElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Provide_deal_details", "Click_Provide_deal_details failed. Unable to locate object: " + Provide_deal_detailsElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Provide_deal_details", "Click_Provide_deal_details failed. Unable to locate object: " + Provide_deal_detailsElem.toString());

            Assert.fail("Unable to locate object: " + Provide_deal_detailsElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Provide_deal_details");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Provide_deal_details");
    }
      
	/**
 	 * Click Submit application
     * @name Click Submit application
     */
    public void Click_Submit_application()
    {
         
        WebElement elem = getWebElement(Submit_applicationElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_application", "Click_Submit_application failed. Unable to locate object: " + Submit_applicationElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_application", "Click_Submit_application failed. Unable to locate object: " + Submit_applicationElem.toString());

            Assert.fail("Unable to locate object: " + Submit_applicationElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Submit_application");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Submit_application");
    }
      
	/**
 	 * Click Term Loan
     * @name Click Term Loan
     */
    public void Click_Term_Loan()
    {
         
        WebElement elem = getWebElement(Select_Term_LoanElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Term_Loan", "Click_Term_Loan failed. Unable to locate object: " + Select_Term_LoanElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Term_Loan", "Click_Term_Loan failed. Unable to locate object: " + Select_Term_LoanElem.toString());

            Assert.fail("Unable to locate object: " + Select_Term_LoanElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Term_Loan");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Term_Loan");
    }
      
	/**
 	 * Click Transaction Header
     * @name Click Transaction Header
     */
    public void Click_Transaction_Header()
    {
         
        WebElement elem = getWebElement(Transaction_HeaderElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Transaction_Header", "Click_Transaction_Header failed. Unable to locate object: " + Transaction_HeaderElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Transaction_Header", "Click_Transaction_Header failed. Unable to locate object: " + Transaction_HeaderElem.toString());

            Assert.fail("Unable to locate object: " + Transaction_HeaderElem.toString());
         }
        sleep(12000);
        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Transaction_Header");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Transaction_Header");
    }
      
	/**
 	 * Click WCDL
     * @name Click WCDL
     */
    public void Click_WCDL()
    {
         
        WebElement elem = getWebElement(WCDLElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_WCDL", "Click_WCDL failed. Unable to locate object: " + WCDLElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_WCDL", "Click_WCDL failed. Unable to locate object: " + WCDLElem.toString());

            Assert.fail("Unable to locate object: " + WCDLElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_WCDL");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_WCDL");
    }
      
	/**
 	 * Click Yubi Loans
     * @name Click Yubi Loans
     */
    public void Click_Yubi_Loans()
    {
         
        WebElement elem = getWebElement(Yubi_LoansElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Yubi_Loans", "Click_Yubi_Loans failed. Unable to locate object: " + Yubi_LoansElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Yubi_Loans", "Click_Yubi_Loans failed. Unable to locate object: " + Yubi_LoansElem.toString());

            Assert.fail("Unable to locate object: " + Yubi_LoansElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Yubi_Loans");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Yubi_Loans");
    }
      
	/**
 	 * Enter Enter loan Amount
     * @name Enter Enter loan Amount
     */
 	public void Enter_Enter_loan_Amount(String Enter_loan_Amount)
 	{
 	    
 		WebElement elem = getWebElement(Enter_loan_AmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_loan_Amount", "Enter_Enter_loan_Amount failed. Unable to locate object: " + Enter_loan_AmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_loan_Amount", "Enter_Enter_loan_Amount failed. Unable to locate object: " + Enter_loan_AmountElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_loan_AmountElem.toString());
         }

 		elem.sendKeys(Enter_loan_Amount);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_loan_Amount " + Enter_loan_Amount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_loan_Amount " + Enter_loan_Amount);
 	}

      
	/**
 	 * Enter loan Amount
     * @name Enter loan Amount
     */
 	public void Enter_loan_Amount(String Enter_loan_Amount)
 	{
 	    
 		WebElement elem = getWebElement(Enter_loan_AmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_loan_Amount", "Enter_loan_Amount failed. Unable to locate object: " + Enter_loan_AmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_loan_Amount", "Enter_loan_Amount failed. Unable to locate object: " + Enter_loan_AmountElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_loan_AmountElem.toString());
         }

 		elem.sendKeys(Enter_loan_Amount);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_loan_Amount " + Enter_loan_Amount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_loan_Amount " + Enter_loan_Amount);
 	}

      
	/**
 	 * Enter Rate of Interest
     * @name Enter Rate of Interest
     */
 	public void Enter_Rate_of_Interest(String Rate_of_Interest)
 	{
 	    
 		WebElement elem = getWebElement(Rate_of_InterestElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Rate_of_Interest", "Enter_Rate_of_Interest failed. Unable to locate object: " + Rate_of_InterestElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Rate_of_Interest", "Enter_Rate_of_Interest failed. Unable to locate object: " + Rate_of_InterestElem.toString());

 			Assert.fail("Unable to locate object: " + Rate_of_InterestElem.toString());
         }

 		elem.sendKeys(Rate_of_Interest);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Rate_of_Interest " + Rate_of_Interest);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Rate_of_Interest " + Rate_of_Interest);
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/deal-creation/term/loans/deal-details");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/deal-creation/term/loans/deal-details");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/deal-creation/term/loans/deal-details");
	}

      
	/**
 	 * Select Capex
     * @name Select Capex
     */
    public void Select_Capex()
    {
         
        WebElement elem = getWebElement(CapexElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Capex", "Select_Capex failed. Unable to locate object: " + CapexElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Capex", "Select_Capex failed. Unable to locate object: " + CapexElem.toString());

            Assert.fail("Unable to locate object: " + CapexElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Select_Capex");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Select_Capex");
    }
      
	/**
 	 * Select Corporate
     * @name Select Corporate
     */
    public void Select_Corporate()
    {
         
        WebElement elem = getWebElement(CorporateElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Corporate", "Select_Corporate failed. Unable to locate object: " + CorporateElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Corporate", "Select_Corporate failed. Unable to locate object: " + CorporateElem.toString());

            Assert.fail("Unable to locate object: " + CorporateElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Select_Corporate");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Select_Corporate");
    }
      
	/**
 	 * Select Loan Type
     * @name Select Loan Type
     */
    public void Select_Loan_Type()
    {
         
        WebElement elem = getWebElement(Select_Loan_TypeElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Loan_Type", "Select_Loan_Type failed. Unable to locate object: " + Select_Loan_TypeElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Loan_Type", "Select_Loan_Type failed. Unable to locate object: " + Select_Loan_TypeElem.toString());

            Assert.fail("Unable to locate object: " + Select_Loan_TypeElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Select_Loan_Type");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Select_Loan_Type");
    }
      
	/**
 	 * Select New loan
     * @name Select New loan
     */
    public void Select_New_loan()
    {
         
        WebElement elem = getWebElement(New_loanElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_New_loan", "Select_New_loan failed. Unable to locate object: " + New_loanElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_New_loan", "Select_New_loan failed. Unable to locate object: " + New_loanElem.toString());

            Assert.fail("Unable to locate object: " + New_loanElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Select_New_loan");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Select_New_loan");
    }
      
	/**
 	 * Select Tenure
     * @name Select Tenure
     */
    public void Select_Tenure()
    {
         
        WebElement elem = getWebElement(Select_TenureElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Tenure", "Select_Tenure failed. Unable to locate object: " + Select_TenureElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Tenure", "Select_Tenure failed. Unable to locate object: " + Select_TenureElem.toString());

            Assert.fail("Unable to locate object: " + Select_TenureElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Select_Tenure");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Select_Tenure");
    }
      
	/**
 	 * Select Unsecured
     * @name Select Unsecured
     */
    public void Select_Unsecured()
    {
         
        WebElement elem = getWebElement(UnsecuredElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Unsecured", "Select_Unsecured failed. Unable to locate object: " + UnsecuredElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Unsecured", "Select_Unsecured failed. Unable to locate object: " + UnsecuredElem.toString());

            Assert.fail("Unable to locate object: " + UnsecuredElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Select_Unsecured");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Select_Unsecured");
    }}