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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys 
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select 

WebUI.callTestCase(findTestCase('select-dropdown/nav-select-dropdown'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('select-dropdown/select_JavaScriptJavaPythonSwiftC'))

WebUI.getNumberOfTotalOption(findTestObject('select-dropdown/select_JavaScriptJavaPythonSwiftC'))

int total = WebUI.getNumberOfTotalOption(findTestObject('select-dropdown/select_JavaScriptJavaPythonSwiftC'))

println(total)
int newTotal = total-1
println(newTotal)

WebUI.selectOptionByIndex(findTestObject('select-dropdown/select_JavaScriptJavaPythonSwiftC'), newTotal)


Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath("//select[@id='lang']")))

String lang = select.getFirstSelectedOption().getText()

println(lang)




