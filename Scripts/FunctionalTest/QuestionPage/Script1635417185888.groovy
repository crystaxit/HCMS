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

'verify text h1 Pre-Existing Disease Conditions'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/h1_Pre-Existing Disease Conditions'), 
    'Pre-Existing Disease Conditions')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/h1_Pre-Existing Disease Conditions'))

'Search box visible or not'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/input_Please select the medical conditionco_1040f5'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/input_Please select the medical conditionco_1040f5'))

'set text in search cancer'
WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Please select the medical conditionco_1040f5'), 
    'Blindness')

'check box check'
WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Please select the medical conditioncond_63a4bd_1'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/h1_Questionnaire'), 'Questionnaire')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/div_Thank you for sharing'), 
    'Thank you for sharing.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/div_To help us analyse your health better, _360464'), 
    'To help us analyse your health better, kindly answer the following:')

'1st question list arrow'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div__mat-select-arrow-wrapper ng-tns-c143-5'))

'selecte yes'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_YES'))

'year input 1'
WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input__mat-input-1'), '1')

'month input 1'
WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Year(s)_mat-input-2'), '1')

'3rd question list arrow'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div__mat-select-arrow-wrapper ng-tns-c143-9'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_NO'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

'check clickable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/div_Medical Visit'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_No'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_YES'))

WebUI.delay(3)

'3rd q List arrow'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div__mat-select-arrow-wrapper ng-tns-c143-13'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Health Compliance Management System/span_VASCULAR SURGERY'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Health Compliance Management System/span_CARDIOLOGY'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Click, if you need any help filling t_6a7446'), 
    'others')

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/mat-pseudo-checkbox_Click, if you need any _ee682e'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/mat-icon_close'))

WebUI.closeBrowser()

