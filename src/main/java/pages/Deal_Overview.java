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

// https://yubi.cloud.testinsights.io/app/#!/module-collection/guid/0a076f55-da65-4c3e-b154-c8803baa5220
@TestModellerModule(guid = "0a076f55-da65-4c3e-b154-c8803baa5220")
public class Deal_Overview extends BasePage
{
	public Deal_Overview (WebDriver driver)
	{
		super(driver);
	}


	
	private By Express_InterestElem = By.xpath("//BUTTON[contains(text(),'Express Interest')]");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://loan-qa.go-yubi.in/tl/63720fcdde54630018b03e2a";

        if (!currentUrl.equals("https://loan-qa.go-yubi.in/tl/63720fcdde54630018b03e2a")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click Express Interest
     * @name Click Express Interest
     */
    public void Click_Express_Interest()
    {
         
        WebElement elem = getWebElement(Express_InterestElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Express_Interest", "Click_Express_Interest failed. Unable to locate object: " + Express_InterestElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Express_Interest", "Click_Express_Interest failed. Unable to locate object: " + Express_InterestElem.toString());

            Assert.fail("Unable to locate object: " + Express_InterestElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Express_Interest");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Express_Interest");
    }
	public void GoToUrl()
	{
		m_Driver.get("https://loan-qa.go-yubi.in/tl/63720fcdde54630018b03e2a");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://loan-qa.go-yubi.in/tl/63720fcdde54630018b03e2a");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://loan-qa.go-yubi.in/tl/63720fcdde54630018b03e2a");
	}
}