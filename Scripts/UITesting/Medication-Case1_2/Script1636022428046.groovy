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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_Endstage Kidney Disease_mat-checkbox-in_2c7592'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div__mat-select-arrow-wrapper ng-tns-c153-8 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_YES (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_For how long have you been suffering fr_94401d (1) (1) (1) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input__mat-input-1 (1) (1) (1) (1)'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Year(s)_mat-input-2 (1) (1) (1) (1)'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input__mat-input-3 (1) (1) (1) (1)'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next (1) (1) (1) (1)'))

'no option 1'
WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/label_No (1) (1) (1) (1)'))

'no option 2'
WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_No (1) (1) (1) (1)'))

'Question page next'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next (1) (1) (1) (1)'))

'SYmptoms page next'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/label_No (2)'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next (1) (1) (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/h1_Medication'), 'Medication')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/label_Do you take any medications on a regu_873365'), 
    'Do you take any medications on a regular basis?')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/div_Do you take any medications on a regula_6ac15d'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Back (2)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next (1) (1) (1) (1)'))

'Yes or NO'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_Do you take any medications on a regula_6ac15d_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/div_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/div_Since how long'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/span_Daily Intake (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/div_Morning'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/div_Afternoon'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/div_Evening'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/div_Night'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Save (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/button_Save (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/div_New Medications0'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/div_No New Medication Added'), 
    0)

WebUI.closeBrowser()

