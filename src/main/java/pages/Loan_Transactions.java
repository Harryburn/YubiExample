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

// https://yubi.cloud.testinsights.io/app/#!/module-collection/guid/88eeb7cc-72be-43e2-9501-7bcbc2bfc92c
@TestModellerModule(guid = "88eeb7cc-72be-43e2-9501-7bcbc2bfc92c")
public class Loan_Transactions extends BasePage
{
	public Loan_Transactions (WebDriver driver)
	{
		super(driver);
	}


	
	private By Archived_dealsElem = By.xpath("//BUTTON[contains(text(),'Archived deals')]");

	private By Live_dealElem = By.xpath("//BUTTON[contains(text(),'Live deal')]");

	private By MaturedElem = By.xpath("//BUTTON[contains(text(),'Matured')]");

	private By Select_Recent_DealElem = By.xpath("//*[contains(text(),'Deal ID')]");

	private By SettledElem = By.xpath("//BUTTON[contains(text(),'Settled')]");


	
      
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
 	 * Click Select Recent Deal
     * @name Click Select Recent Deal
     */
    public void Click_Select_Recent_Deal()
    {
         
        WebElement elem = getWebElement(Select_Recent_DealElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Select_Recent_Deal", "Click_Select_Recent_Deal failed. Unable to locate object: " + Select_Recent_DealElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Select_Recent_Deal", "Click_Select_Recent_Deal failed. Unable to locate object: " + Select_Recent_DealElem.toString());

            Assert.fail("Unable to locate object: " + Select_Recent_DealElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Select_Recent_Deal");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Select_Recent_Deal");
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
    }}