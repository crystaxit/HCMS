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

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div__mat-select-arrow-wrapper ng-tns-c153-8'))

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

'Verify Text Symptoms'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/h1_Symptoms'), 'Symptoms')

'Verify Text Are you experiencing any of the following symptoms? If yes, from how many days?'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/div_Are you experiencing any of the followi_7d6d74'), 
    'Are you experiencing any of the following symptoms? If yes, from how many days ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/mat-icon_add_circle'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Health Compliance Management System/mat-icon_remove_circle'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/div_OTHER SYMTPOMS'), 
    'OTHER SYMPTOMS')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/textarea_Shadow(s) In Peripheral Vision_others'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Back'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.closeBrowser()

