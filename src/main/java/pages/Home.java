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

// https://yubi.cloud.testinsights.io/app/#!/module-collection/guid/52a3ccca-444e-4d78-8a54-6972b634140d
@TestModellerModule(guid = "52a3ccca-444e-4d78-8a54-6972b634140d")
public class Home extends BasePage
{
	public Home (WebDriver driver)
	{
		super(driver);
	}


	
	private By ExploreElem = By.xpath("//A[@href='/explore']");

	private By LogoutElem = By.xpath("//P[contains(text(),'Logout')]");

	private By Open_User_ControlsElem = By.xpath("//*[contains(text(),'Arun')]");

	private By Yubi_LoansElem = By.xpath("//A[@href='https://loan-qa.go-yubi.in/loans/transactions']");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/home";

        if (!currentUrl.equals("https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/home")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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
 	 * Click Logout
     * @name Click Logout
     */
    public void Click_Logout()
    {
         
        WebElement elem = getWebElement(LogoutElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Logout", "Click_Logout failed. Unable to locate object: " + LogoutElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Logout", "Click_Logout failed. Unable to locate object: " + LogoutElem.toString());

            Assert.fail("Unable to locate object: " + LogoutElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Logout");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Logout");
    }
      
	/**
 	 * Click Open User Controls
     * @name Click Open User Controls
     */
    public void Click_Open_User_Controls()
    {
         
        WebElement elem = getWebElement(Open_User_ControlsElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Open_User_Controls", "Click_Open_User_Controls failed. Unable to locate object: " + Open_User_ControlsElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Open_User_Controls", "Click_Open_User_Controls failed. Unable to locate object: " + Open_User_ControlsElem.toString());

            Assert.fail("Unable to locate object: " + Open_User_ControlsElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Open_User_Controls");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Open_User_Controls");
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
	public void GoToUrl()
	{
		m_Driver.get("https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/home");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/home");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://credit-qa.go-yubi.in/client/623ae277e60734006b930eb1/home");
	}
}