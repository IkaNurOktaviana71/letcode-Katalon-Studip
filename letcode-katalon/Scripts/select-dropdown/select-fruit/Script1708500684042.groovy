import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.support.ui.Select as Select

WebUI.openBrowser(GlobalVariable.webUrl)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('select-dropdown/h1_Practice and become pro in test automation'), 0)

WebUI.mouseOver(findTestObject('select-dropdown/a_Drop-Down'))

WebUI.click(findTestObject('select-dropdown/a_Drop-Down'))

WebUI.verifyTextPresent('Dropdown', false)

WebUI.mouseOver(findTestObject('select-dropdown/select_Select FruitAppleMangoOrangeBananaPine Apple'))

WebUI.selectOptionByValue(findTestObject('select-dropdown/select_Select FruitAppleMangoOrangeBananaPine Apple'), fruit, 
    false)

Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//select[@id=\'fruits\']')))

String buah = select.getFirstSelectedOption().getText()

println(buah)

WebUI.verifyMatch(buah, 'Orange', false)

WebUI.closeBrowser()

