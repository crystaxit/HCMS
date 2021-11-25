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

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/h1_Questionnaire'), 'Questionnaire')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/div_Thank you for sharing'), 
    'Thank you for sharing.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Health Compliance Management System/div_To help us analyse your health better, _360464'), 
    'To help us analyse your health better, kindly answer the following:')

'check clickable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/div_Medical Visit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Back'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/button_Back'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/div__mat-select-arrow-wrapper ng-tns-c143-5'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/span_Year(s)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/span_Month(s)'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_Medical Visit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/label_Yes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/label_No'))

WebUI.closeBrowser()

