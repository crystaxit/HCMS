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

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_Endstage Kidney Disease_mat-checkbox-in_2c7592'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_YES'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_For how long have you been suffering fr_94401d'))

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input__mat-input-1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Year(s)_mat-input-2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input__mat-input-3'), '1')

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

'no option 1'
WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/label_No'))

'no option 2'
WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_No'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_how many days_mat-input-5'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_Yes_mat-radio-outer-circle_1'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.closeBrowser()

