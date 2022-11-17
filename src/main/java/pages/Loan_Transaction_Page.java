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

// https://yubi.cloud.testinsights.io/app/#!/module-collection/guid/0bd22bab-5a3d-4481-91fc-ac2baa1ab099
@TestModellerModule(guid = "0bd22bab-5a3d-4481-91fc-ac2baa1ab099")
public class Loan_Transaction_Page extends BasePage
{
	public Loan_Transaction_Page (WebDriver driver)
	{
		super(driver);
	}


	
	private By ApprovedElem = By.xpath("//BUTTON[contains(text(),'Approved')]");

	private By Archived_dealsElem = By.xpath("//BUTTON[contains(text(),'Archived deals')]");

	private By DeclinedElem = By.xpath("//BUTTON[contains(text(),'Declined')]");

	private By ExploreElem = By.xpath("//BUTTON[contains(text(),'Explore')]");

	private By FinalisedElem = By.xpath("//BUTTON[contains(text(),'Finalised')]");

	private By Final_SanctionElem = By.xpath("//BUTTON[contains(text(),'Final Sanction')]");

	private By Green_ChannelElem = By.xpath("//BUTTON[contains(text(),'Green Channel')]");

	private By In_Principle_ApprovalElem = By.xpath("//BUTTON[contains(text(),'In Principle Approval')]");

	private By Live_dealElem = By.xpath("//BUTTON[contains(text(),'Live deal')]");

	private By MaturedElem = By.xpath("//BUTTON[contains(text(),'Matured')]");

	private By My_DealsElem = By.xpath("//BUTTON[contains(text(),'My Deals')]");

	private By My_InterestElem = By.xpath("//BUTTON[contains(text(),'My Interest')]");

	private By Pending_ApprovalElem = By.xpath("//BUTTON[contains(text(),'Pending Approval')]");

	private By Search_by_client_or_dealElem = By.xpath("//INPUT[@placeholder='Search by client or deal']");

	private By SettledElem = By.xpath("//BUTTON[contains(text(),'Settled')]");

	private By Show_MoreElem = By.xpath("//BUTTON[@class='sc-Dmqmp bFHbvy show-more-button']");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://loan-qa.go-yubi.in/loans/transactions";

        if (!currentUrl.equals("https://loan-qa.go-yubi.in/loans/transactions")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click Approved
     * @name Click Approved
     */
    public void Click_Approved()
    {
         
        WebElement elem = getWebElement(ApprovedElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Approved", "Click_Approved failed. Unable to locate object: " + ApprovedElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Approved", "Click_Approved failed. Unable to locate object: " + ApprovedElem.toString());

            Assert.fail("Unable to locate object: " + ApprovedElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Approved");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Approved");
    }
      
	/**
 	 * Click Archived deals
     * @name Click Archived deals
     */
    public void Click_Archived_deals()
    {
         
        WebElement elem = getWebElement(Archived_dealsElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Archived_deals", "Click_Archived_deals failed. Unable to locate object: " + Archived_dealsElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Archived_deals", "Click_Archived_deals failed. Unable to locate object: " + Archived_dealsElem.toString());

            Assert.fail("Unable to locate object: " + Archived_dealsElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Archived_deals");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Archived_deals");
    }
      
	/**
 	 * Click Declined
     * @name Click Declined
     */
    public void Click_Declined()
    {
         
        WebElement elem = getWebElement(DeclinedElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Declined", "Click_Declined failed. Unable to locate object: " + DeclinedElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Declined", "Click_Declined failed. Unable to locate object: " + DeclinedElem.toString());

            Assert.fail("Unable to locate object: " + DeclinedElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Declined");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Declined");
    }
      
	/**
 	 * Click Explore
     * @name Click Explore
     */
    public void Click_Explore()
    {
         
        WebElement elem = getWebElement(ExploreElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Explore", "Click_Explore failed. Unable to locate object: " + ExploreElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Explore", "Click_Explore failed. Unable to locate object: " + ExploreElem.toString());

            Assert.fail("Unable to locate object: " + ExploreElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Explore");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Explore");
    }
      
	/**
 	 * Click Finalised
     * @name Click Finalised
     */
    public void Click_Finalised()
    {
         
        WebElement elem = getWebElement(FinalisedElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Finalised", "Click_Finalised failed. Unable to locate object: " + FinalisedElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Finalised", "Click_Finalised failed. Unable to locate object: " + FinalisedElem.toString());

            Assert.fail("Unable to locate object: " + FinalisedElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Finalised");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Finalised");
    }
      
	/**
 	 * Click Final Sanction
     * @name Click Final Sanction
     */
    public void Click_Final_Sanction()
    {
         
        WebElement elem = getWebElement(Final_SanctionElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Sanction", "Click_Final_Sanction failed. Unable to locate object: " + Final_SanctionElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Sanction", "Click_Final_Sanction failed. Unable to locate object: " + Final_SanctionElem.toString());

            Assert.fail("Unable to locate object: " + Final_SanctionElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Final_Sanction");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Final_Sanction");
    }
      
	/**
 	 * Click Green Channel
     * @name Click Green Channel
     */
    public void Click_Green_Channel()
    {
         
        WebElement elem = getWebElement(Green_ChannelElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Green_Channel", "Click_Green_Channel failed. Unable to locate object: " + Green_ChannelElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Green_Channel", "Click_Green_Channel failed. Unable to locate object: " + Green_ChannelElem.toString());

            Assert.fail("Unable to locate object: " + Green_ChannelElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Green_Channel");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Green_Channel");
    }
      
	/**
 	 * Click In Principle Approval
     * @name Click In Principle Approval
     */
    public void Click_In_Principle_Approval()
    {
         
        WebElement elem = getWebElement(In_Principle_ApprovalElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_In_Principle_Approval", "Click_In_Principle_Approval failed. Unable to locate object: " + In_Principle_ApprovalElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_In_Principle_Approval", "Click_In_Principle_Approval failed. Unable to locate object: " + In_Principle_ApprovalElem.toString());

            Assert.fail("Unable to locate object: " + In_Principle_ApprovalElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_In_Principle_Approval");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_In_Principle_Approval");
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
 	 * Click Matured
     * @name Click Matured
     */
    public void Click_Matured()
    {
         
        WebElement elem = getWebElement(MaturedElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Matured", "Click_Matured failed. Unable to locate object: " + MaturedElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Matured", "Click_Matured failed. Unable to locate object: " + MaturedElem.toString());

            Assert.fail("Unable to locate object: " + MaturedElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Matured");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Matured");
    }
      
	/**
 	 * Click My Deals
     * @name Click My Deals
     */
    public void Click_My_Deals()
    {
         
        WebElement elem = getWebElement(My_DealsElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_My_Deals", "Click_My_Deals failed. Unable to locate object: " + My_DealsElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_My_Deals", "Click_My_Deals failed. Unable to locate object: " + My_DealsElem.toString());

            Assert.fail("Unable to locate object: " + My_DealsElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_My_Deals");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_My_Deals");
    }
      
	/**
 	 * Click My Interest
     * @name Click My Interest
     */
    public void Click_My_Interest()
    {
         
        WebElement elem = getWebElement(My_InterestElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_My_Interest", "Click_My_Interest failed. Unable to locate object: " + My_InterestElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_My_Interest", "Click_My_Interest failed. Unable to locate object: " + My_InterestElem.toString());

            Assert.fail("Unable to locate object: " + My_InterestElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_My_Interest");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_My_Interest");
    }
      
	/**
 	 * Click Pending Approval
     * @name Click Pending Approval
     */
    public void Click_Pending_Approval()
    {
         
        WebElement elem = getWebElement(Pending_ApprovalElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pending_Approval", "Click_Pending_Approval failed. Unable to locate object: " + Pending_ApprovalElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pending_Approval", "Click_Pending_Approval failed. Unable to locate object: " + Pending_ApprovalElem.toString());

            Assert.fail("Unable to locate object: " + Pending_ApprovalElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Pending_Approval");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Pending_Approval");
    }
      
	/**
 	 * Click Settled
     * @name Click Settled
     */
    public void Click_Settled()
    {
         
        WebElement elem = getWebElement(SettledElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settled", "Click_Settled failed. Unable to locate object: " + SettledElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settled", "Click_Settled failed. Unable to locate object: " + SettledElem.toString());

            Assert.fail("Unable to locate object: " + SettledElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Settled");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Settled");
    }
      
	/**
 	 * Click Show More
     * @name Click Show More
     */
    public void Click_Show_More()
    {
         
        WebElement elem = getWebElement(Show_MoreElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Show_More", "Click_Show_More failed. Unable to locate object: " + Show_MoreElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Show_More", "Click_Show_More failed. Unable to locate object: " + Show_MoreElem.toString());

            Assert.fail("Unable to locate object: " + Show_MoreElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Show_More");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Show_More");
    }
      
	/**
 	 * Enter Search by client or deal
     * @name Enter Search by client or deal
     */
 	public void Enter_Search_by_client_or_deal(String Search_by_client_or_deal)
 	{
 	    
 		WebElement elem = getWebElement(Search_by_client_or_dealElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Search_by_client_or_deal", "Enter_Search_by_client_or_deal failed. Unable to locate object: " + Search_by_client_or_dealElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Search_by_client_or_deal", "Enter_Search_by_client_or_deal failed. Unable to locate object: " + Search_by_client_or_dealElem.toString());

 			Assert.fail("Unable to locate object: " + Search_by_client_or_dealElem.toString());
         }

 		elem.sendKeys(Search_by_client_or_deal);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Search_by_client_or_deal " + Search_by_client_or_deal);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Search_by_client_or_deal " + Search_by_client_or_deal);
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://loan-qa.go-yubi.in/loans/transactions");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://loan-qa.go-yubi.in/loans/transactions");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://loan-qa.go-yubi.in/loans/transactions");
	}
}