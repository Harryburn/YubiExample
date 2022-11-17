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

// https://yubi.cloud.testinsights.io/app/#!/module-collection/guid/0c0dbe0c-c8fd-473b-862b-8bb2a1af1e91
@TestModellerModule(guid = "0c0dbe0c-c8fd-473b-862b-8bb2a1af1e91")
public class Login extends BasePage
{
	public Login (WebDriver driver)
	{
		super(driver);
	}


	
	private By ContinueElem = By.xpath("//BUTTON[contains(text(),'Continue')]");

	private By Digit_1Elem = By.cssSelector("INPUT[aria-label='Please\\ enter\\ verification\\ code\\.\\ Digit\\ 1']");
	private By Digit_2Elem = By.cssSelector("INPUT[aria-label='Digit\\ 2']");
	private By Digit_3Elem = By.cssSelector("INPUT[aria-label='Digit\\ 3']");
	private By Digit_4Elem = By.cssSelector("INPUT[aria-label='Digit\\ 4']");
	private By Digit_5Elem = By.cssSelector("INPUT[aria-label='Digit\\ 5']");
	private By Digit_6Elem = By.cssSelector("INPUT[aria-label='Digit\\ 6']");
	private By Email_addressElem = By.xpath("//label[normalize-space()= 'Email address']/../input");

	private By PasswordElem = By.xpath("//label[normalize-space()= 'Password']/../input");

	private By Verify_EmailElem = By.xpath("//BUTTON[contains(text(),'Verify Email')]");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://auth-qa.credavenue.in/u/login/password?state=hKFo2SBhbk1UbDRjV013aGthQlhqTk1jNjdqZzhBNDgxNVNrWKFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIEF0UTNrMzBqV0VMODdhemluVjNBVjYtLU5OalVVYXdHo2NpZNkgS3VvNnYwRXJXUlR0WEd0QUY2N1o0U05GQlg3UDIyQVo";

        if (!currentUrl.equals("https://auth-qa.credavenue.in/u/login/password?state=hKFo2SBhbk1UbDRjV013aGthQlhqTk1jNjdqZzhBNDgxNVNrWKFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIEF0UTNrMzBqV0VMODdhemluVjNBVjYtLU5OalVVYXdHo2NpZNkgS3VvNnYwRXJXUlR0WEd0QUY2N1o0U05GQlg3UDIyQVo")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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
 	 * Click Verify Email
     * @name Click Verify Email
     */
    public void Click_Verify_Email()
    {
         
        WebElement elem = getWebElement(Verify_EmailElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Verify_Email", "Click_Verify_Email failed. Unable to locate object: " + Verify_EmailElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Verify_Email", "Click_Verify_Email failed. Unable to locate object: " + Verify_EmailElem.toString());

            Assert.fail("Unable to locate object: " + Verify_EmailElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Verify_Email");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Verify_Email");
    }
      
	/**
 	 * Enter Digit 1
     * @name Enter Digit 1
     */
 	public void Enter_Digit_1(String Digit_1)
 	{
 	    
 		WebElement elem = getWebElement(Digit_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Digit_1", "Enter_Digit_1 failed. Unable to locate object: " + Digit_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Digit_1", "Enter_Digit_1 failed. Unable to locate object: " + Digit_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Digit_1Elem.toString());
         }

 		elem.sendKeys(Digit_1);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Digit_1 " + Digit_1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Digit_1 " + Digit_1);
 	}

      
	/**
 	 * Enter Digit 2
     * @name Enter Digit 2
     */
 	public void Enter_Digit_2(String Digit_2)
 	{
 	    
 		WebElement elem = getWebElement(Digit_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Digit_2", "Enter_Digit_2 failed. Unable to locate object: " + Digit_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Digit_2", "Enter_Digit_2 failed. Unable to locate object: " + Digit_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Digit_2Elem.toString());
         }

 		elem.sendKeys(Digit_2);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Digit_2 " + Digit_2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Digit_2 " + Digit_2);
 	}

      
	/**
 	 * Enter Digit 3
     * @name Enter Digit 3
     */
 	public void Enter_Digit_3(String Digit_3)
 	{
 	    
 		WebElement elem = getWebElement(Digit_3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Digit_3", "Enter_Digit_3 failed. Unable to locate object: " + Digit_3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Digit_3", "Enter_Digit_3 failed. Unable to locate object: " + Digit_3Elem.toString());

 			Assert.fail("Unable to locate object: " + Digit_3Elem.toString());
         }

 		elem.sendKeys(Digit_3);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Digit_3 " + Digit_3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Digit_3 " + Digit_3);
 	}

      
	/**
 	 * Enter Digit 4
     * @name Enter Digit 4
     */
 	public void Enter_Digit_4(String Digit_4)
 	{
 	    
 		WebElement elem = getWebElement(Digit_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Digit_4", "Enter_Digit_4 failed. Unable to locate object: " + Digit_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Digit_4", "Enter_Digit_4 failed. Unable to locate object: " + Digit_4Elem.toString());

 			Assert.fail("Unable to locate object: " + Digit_4Elem.toString());
         }

 		elem.sendKeys(Digit_4);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Digit_4 " + Digit_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Digit_4 " + Digit_4);
 	}

      
	/**
 	 * Enter Digit 5
     * @name Enter Digit 5
     */
 	public void Enter_Digit_5(String Digit_5)
 	{
 	    
 		WebElement elem = getWebElement(Digit_5Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Digit_5", "Enter_Digit_5 failed. Unable to locate object: " + Digit_5Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Digit_5", "Enter_Digit_5 failed. Unable to locate object: " + Digit_5Elem.toString());

 			Assert.fail("Unable to locate object: " + Digit_5Elem.toString());
         }

 		elem.sendKeys(Digit_5);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Digit_5 " + Digit_5);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Digit_5 " + Digit_5);
 	}

      
	/**
 	 * Enter Digit 6
     * @name Enter Digit 6
     */
 	public void Enter_Digit_6(String Digit_6)
 	{
 	    
 		WebElement elem = getWebElement(Digit_6Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Digit_6", "Enter_Digit_6 failed. Unable to locate object: " + Digit_6Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Digit_6", "Enter_Digit_6 failed. Unable to locate object: " + Digit_6Elem.toString());

 			Assert.fail("Unable to locate object: " + Digit_6Elem.toString());
         }

 		elem.sendKeys(Digit_6);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Digit_6 " + Digit_6);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Digit_6 " + Digit_6);
 	}

      
	/**
 	 * Enter Email address
     * @name Enter Email address
     */
 	public void Enter_Email_address(String Email_address)
 	{
 	    
 		WebElement elem = getWebElement(Email_addressElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Email_address", "Enter_Email_address failed. Unable to locate object: " + Email_addressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Email_address", "Enter_Email_address failed. Unable to locate object: " + Email_addressElem.toString());

 			Assert.fail("Unable to locate object: " + Email_addressElem.toString());
         }

 		elem.sendKeys(Email_address);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Email_address " + Email_address);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Email_address " + Email_address);
 	}

      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://auth-qa.credavenue.in/u/login/password?state=hKFo2SBhbk1UbDRjV013aGthQlhqTk1jNjdqZzhBNDgxNVNrWKFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIEF0UTNrMzBqV0VMODdhemluVjNBVjYtLU5OalVVYXdHo2NpZNkgS3VvNnYwRXJXUlR0WEd0QUY2N1o0U05GQlg3UDIyQVo");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://auth-qa.credavenue.in/u/login/password?state=hKFo2SBhbk1UbDRjV013aGthQlhqTk1jNjdqZzhBNDgxNVNrWKFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIEF0UTNrMzBqV0VMODdhemluVjNBVjYtLU5OalVVYXdHo2NpZNkgS3VvNnYwRXJXUlR0WEd0QUY2N1o0U05GQlg3UDIyQVo");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://auth-qa.credavenue.in/u/login/password?state=hKFo2SBhbk1UbDRjV013aGthQlhqTk1jNjdqZzhBNDgxNVNrWKFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIEF0UTNrMzBqV0VMODdhemluVjNBVjYtLU5OalVVYXdHo2NpZNkgS3VvNnYwRXJXUlR0WEd0QUY2N1o0U05GQlg3UDIyQVo");
	}
}