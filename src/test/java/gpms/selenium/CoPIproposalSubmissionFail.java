package gpms.selenium;

/*Made by: Nick
 * Co-PI will attempt to submit proposal, attempt fails as Co-PI does not have this permission.
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CoPIproposalSubmissionFail {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"F:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://localhost:8181/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCoPIcantSubmitProposal() throws Exception {
		// driver.get(baseUrl + "GPMS/");
		// driver.findElement(By.id("user_email")).clear();
		// driver.findElement(By.id("user_email")).sendKeys(
		// "nicholas1234@gmail.com");
		// driver.findElement(By.id("user_password")).clear();
		// driver.findElement(By.id("user_password")).sendKeys("gpmspassword");
		// Thread.sleep(200);
		// driver.findElement(By.name("commit")).click();
		//
		// assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
		// .matches("^[\\s\\S]*$"));
		// driver.findElement(By.cssSelector("li.sfLevel1 > a > span")).click();
		// driver.findElement(By.id("btnAddNew")).click();
		// Thread.sleep(200);
		// driver.findElement(By.name("AddCoPI")).click();
		// Thread.sleep(200);
		// driver.findElement(By.cssSelector("i.sidebarExpand")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("lblSection2")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtProjectTitle")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtProjectTitle")).clear();
		// Thread.sleep(200);
		//
		// int randTest = (int) (Math.random() * 9999);
		//
		// driver.findElement(By.id("txtProjectTitle")).sendKeys(
		// "proposal tests" + randTest);
		// Thread.sleep(200);
		// driver.findElement(By.cssSelector("td.cssClassTableRightCol")).click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlProjectType")))
		// .selectByVisibleText("Research-Applied");
		// Thread.sleep(200);
		// driver.findElement(By.id("txtDueDate")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ddlTypeOfRequest")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtDueDate")).click();
		// Thread.sleep(200);
		// driver.findElement(By.linkText("8")).click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlTypeOfRequest")))
		// .selectByVisibleText("New Proposal");
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlLocationOfProject")))
		// .selectByVisibleText("On-campus");
		// Thread.sleep(200);
		// driver.findElement(By.id("txtProjectPeriodFrom")).click();
		// Thread.sleep(200);
		// driver.findElement(By.linkText("2")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtProjectPeriodTo")).click();
		// Thread.sleep(200);
		// driver.findElement(By.linkText("3")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("lblSection3")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtNameOfGrantingAgency")).clear();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtNameOfGrantingAgency")).sendKeys("NSF");
		// Thread.sleep(200);
		// driver.findElement(By.id("txtDirectCosts")).clear();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtDirectCosts")).sendKeys("500");
		// Thread.sleep(200);
		// driver.findElement(By.id("txtFACosts")).clear();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtFACosts")).sendKeys("900");
		// Thread.sleep(200);
		// driver.findElement(By.id("txtTotalCosts")).clear();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtTotalCosts")).sendKeys("1100");
		// Thread.sleep(200);
		// driver.findElement(By.id("txtFARate")).clear();
		// Thread.sleep(200);
		// driver.findElement(By.id("txtFARate")).sendKeys("20");
		// Thread.sleep(200);
		// driver.findElement(By.id("lblSection4")).click();
		// Thread.sleep(200);
		// new
		// Select(driver.findElement(By.id("ddlInstitutionalCommitmentCost")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlInstitutionalCommitmentCost > option[value=\"1\"]"))
		// .click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlThirdPartyCommitmentCost")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlThirdPartyCommitmentCost > option[value=\"1\"]"))
		// .click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ui-id-9")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ddlNewSpaceRequired")).click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlNewSpaceRequired")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlRentalSpaceRequired")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// new Select(driver.findElement(By
		// .id("ddlInstitutionalCommitmentsRequired")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlInstitutionalCommitmentsRequired > option[value=\"1\"]"))
		// .click();
		// Thread.sleep(200);
		// driver.findElement(By.id("lblSection6")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ddlFinancialCOI")).click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlFinancialCOI")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlDisclosedFinancialCOI")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlDisclosedFinancialCOI > option[value=\"1\"]"))
		// .click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlMaterialChanged")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlMaterialChanged > option[value=\"1\"]"))
		// .click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ui-id-13")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ddlUseHumanSubjects")).click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlUseHumanSubjects")))
		// .selectByVisibleText("Yes");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlUseHumanSubjects > option[value=\"1\"]"))
		// .click();
		// Thread.sleep(200);
		// // driver.findElement(By.name("IRBOptions")).click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlIRBOptions")))
		// .selectByVisibleText("Pending");
		// driver.findElement(
		// By.cssSelector("#ddlUseHumanSubjects > option[value=\"2\"]"))
		// .click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlUseVertebrateAnimals")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlInvovleBioSafety")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlEnvironmentalConcerns")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlEnvironmentalConcerns > option[value=\"2\"]"))
		// .click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ui-id-15")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ddlAnticipateForeignNationals")).click();
		// Thread.sleep(200);
		// new
		// Select(driver.findElement(By.id("ddlAnticipateForeignNationals")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlAnticipateReleaseTime")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlRelatedToEnergyStudies")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlRelatedToEnergyStudies > option[value=\"2\"]"))
		// .click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ui-id-17")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ddlInvolveNonFundedCollabs")).click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlInvolveNonFundedCollabs")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlInvolveNonFundedCollabs > option[value=\"2\"]"))
		// .click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ui-id-19")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ddlProprietaryInformation")).click();
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlProprietaryInformation")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// new Select(driver.findElement(By.id("ddlOwnIntellectualProperty")))
		// .selectByVisibleText("No");
		// Thread.sleep(200);
		// driver.findElement(
		// By.cssSelector("#ddlOwnIntellectualProperty > option[value=\"2\"]"))
		// .click();
		// Thread.sleep(200);
		// driver.findElement(By.id("ui-id-21")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("pi_signature")).clear();
		// Thread.sleep(200);
		// driver.findElement(By.id("pi_signature")).sendKeys("Nicholas chapa");
		// Thread.sleep(200);
		// driver.findElement(By.id("pi_signaturedate")).click();
		// Thread.sleep(200);
		// driver.findElement(
		// By.xpath("//table[@id='trSignPICOPI']/tbody/tr/td[3]")).click();
		// Thread.sleep(200);
		// driver.findElement(By.name("proposalNotes574f7adb65dbb34d17834b57PI"))
		// .clear();
		// Thread.sleep(200);
		// driver.findElement(By.name("proposalNotes574f7adb65dbb34d17834b57PI"))
		// .sendKeys("Test");
		// Thread.sleep(200);
		// driver.findElement(By.id("ui-id-25")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("btnSaveProposal")).click();
		// Thread.sleep(200);
		// driver.findElement(By.id("BoxConfirmBtnOk")).click();
		// Thread.sleep(200);
		// assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
		// .matches("^[\\s\\S]*$"));
		// Thread.sleep(200);
		// driver.findElement(By.id("BoxAlertBtnOk")).click();
		// Thread.sleep(200);
		//
		// driver.findElement(By.cssSelector("span.myProfile.icon-arrow-s"))
		// .click();
		// Thread.sleep(200);
		// driver.findElement(By.linkText("Log Out")).click();
		// Thread.sleep(2000);

		// CoPI signs
		driver.get(baseUrl + "GPMS/");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("gpmspassword");
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("liliana");
		Thread.sleep(200);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(200);
		driver.findElement(By.linkText("My Proposals")).click();
		Thread.sleep(200);
		((JavascriptExecutor) driver)
				.executeScript("var s=document.getElementById('edit0');s.click();");
		Thread.sleep(200);
		driver.findElement(By.id("ui-id-21")).click();
		Thread.sleep(200);
		driver.findElement(By.name("574f638565dbb34d17834b33Co-PI")).clear();
		Thread.sleep(200);
		driver.findElement(By.name("574f638565dbb34d17834b33Co-PI")).sendKeys(
				"Liliana");
		Thread.sleep(200);
		driver.findElement(
				By.name("proposalNotes574f638565dbb34d17834b33Co-PI")).clear();
		Thread.sleep(200);
		driver.findElement(
				By.name("proposalNotes574f638565dbb34d17834b33Co-PI"))
				.sendKeys("Test");
		Thread.sleep(200);
		driver.findElement(
				By.name("signaturedate574f638565dbb34d17834b33Co-PI")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//table[@id='trSignPICOPI']/tbody/tr[2]/td[3]"))
				.click();
		Thread.sleep(200);

		((JavascriptExecutor) driver)
				.executeScript("var s=document.getElementById('btnSubmitProposal');s.click();");

		Thread.sleep(500);
		driver.findElement(By.id("BoxConfirmBtnOk")).click();
		Thread.sleep(200);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*$"));
		Thread.sleep(200);

		assertTrue(driver.findElement(By.cssSelector("div.BoxError"))
				.isDisplayed());
		Thread.sleep(200);

		driver.findElement(By.id("BoxAlertBtnOk")).click();
		Thread.sleep(200);
		driver.findElement(By.cssSelector("span.myProfile.icon-arrow-s"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(200);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

}
