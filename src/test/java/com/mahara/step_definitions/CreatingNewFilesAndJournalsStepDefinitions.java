
//OZGEN
//IMPLEMENT SECOND ONE
package com.mahara.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mahara.pages.MaharaNewFilesNewJournalsPage;
import com.mahara.utilities.BrowserUtils;
import com.mahara.utilities.Driver;

import cucumber.api.java.en.Then;

public class CreatingNewFilesAndJournalsStepDefinitions {

	MaharaNewFilesNewJournalsPage filesJournals = new MaharaNewFilesNewJournalsPage();
	private WebDriver driver = Driver.getDriver();

	@Then("^user click on Files button$")
	public void user_click_on_Files_button() {
		filesJournals.filesButton.click();
	}

	@Then("^click Choose Files$")
	public void click_Choose_Files() {
		String file = "/Users/ozgenoktemkose/Desktop/06a8c541-2526-4d07-a816-50771a7fc352.jpg";
		filesJournals.uploadFile.sendKeys(file);
	}

	@Then("^upload two different files which are related to group project$")
	public void upload_two_different_files_which_are_related_to_group_project() {
		String file = "/Users/ozgenoktemkose/Desktop/06a8c541-2526-4d07-a816-50771a7fc352.jpg";
		filesJournals.uploadFile.sendKeys(file);

	}

	@Then("^user click create a folder button and named it \"([^\"]*)\"$")
	public void user_click_create_a_folder_button_and_named_it(String name) {
		filesJournals.createFolderBox.sendKeys(name);
		filesJournals.createFolderButton.click();
	}

	@Then("^user click edit file button$")
	public void user_click_edit_file_button() {
		filesJournals.editButton.click();
	}

	@Then("^user change Comments radio button from Off to On$")
	public void user_change_Comments_radio_button_from_Off_to_On() {
		filesJournals.clicking(filesJournals.onOff);
	}

	@Then("^user click Save Changes$")
	public void user_click_Save_Changes() {
		filesJournals.saveChanges.click();
	}

	// 2.scenario

	@Then("^user click on Journals button$")
	public void user_click_on_Journals_button() {
		filesJournals.journal.click();
	}

	@Then("^user click New Entry button$")
	public void user_click_New_Entry_button() {
		filesJournals.newEntry.click();
	}

	@Then("^user enter \"([^\"]*)\" into Title inbox$")
	public void user_enter_into_Title_inbox(String title) {
		filesJournals.journalTitle.sendKeys(title);

	}

	@Then("^user click bold button in entry box$")
	public void user_click_bold_button_in_entry_box() {
		filesJournals.boldButton.click();
	}

	@Then("^user enter \"([^\"]*)\" into entry box$")
	public void user_enter_into_entry_box(String entry) {
		// WebDriverWait wait=new WebDriverWait(driver,5);
		WebElement iframe = driver.findElement(By.tagName("iframe"));

		// WebElement
		// element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@data-id='editpost_description']")));
		driver.switchTo().frame(iframe);
		// driver.switchTo().parentFrame();
		driver.findElement(By.tagName("body")).sendKeys(entry + Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//*[@id='editpost_tags_container']/span[1]/span[1]/span/ul/li/input"))
				.sendKeys(Keys.PAGE_DOWN);
		// ooo filesJournals.journalInbox.sendKeys(entry);
		// WebDriverWait wait = new WebDriverWait(driver, 5);
		// WebElement element =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileform_firstname")));

		// filesJournals.clicking(filesJournals.journalInbox);

	}

	@Then("^user click Save Entry$")
	public void user_click_Save_Entry() {
		Actions actions = new Actions(driver);
		// JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		// jsEX.executeScript("window.scrollBy(0,3000);");
		// BrowserUtils.waitFor(4);

		actions.moveToElement(filesJournals.saveJournal).perform();
		actions.click();
		// WebElement element = driver.findElement(By.className("btn-primary
		// submitcancel"));
		// element.click();
		// submit btn"));
		// actions.moveToElement(element).perform();
		// element.click();
		
		//PLEASE ASK MARUF
		//WE TRIED MANY THINGS WITH MARIFAT, BUT DIDNT WORK
		
		
		

	}

}
