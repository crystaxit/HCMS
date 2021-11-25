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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.heaps.ai/hra/member/MEM112/U2FsdGVkX18Cm0p4eiQJzffRjGaIswbn9fXwHUG7S+LbN6yBGnAHKdTsPGWnvyBd/followup/preexisting')

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/a_Report'))

WebUI.verifyElementClickable(findTestObject('Page_Health Compliance Management System/button_Book Lab Tests'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Book Lab Tests'))

WebUI.verifyElementClickable(findTestObject('Page_Health Compliance Management System/button_Consult Doctor'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Consult Doctor'))

WebUI.verifyElementClickable(findTestObject('Page_Health Compliance Management System/button_Order Medicine'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Order Medicine'))

WebUI.verifyElementVisible(findTestObject('Page_Health Compliance Management System/button_Download Report'))

WebUI.verifyElementClickable(findTestObject('Page_Health Compliance Management System/button_Download Report'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Download Report'))

