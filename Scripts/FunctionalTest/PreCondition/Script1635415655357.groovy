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

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Multiple Sclerosis_mat-checkbox-inner-c_0c977a'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Sleep Apnea (Sleep-related Breathing Di_b1f9b8'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Endstage Kidney Disease_mat-checkbox-in_2c7592'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Hypertension (High Blood Pressure)_mat-_cf28d6'))

WebUI.uncheck(findTestObject('Object Repository/Page_Health Compliance Management System/div_Hypertension (High Blood Pressure)_mat-_cf28d6'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Heart Disease_mat-checkbox-inner-container'))

WebUI.uncheck(findTestObject('Object Repository/Page_Health Compliance Management System/div_Heart Disease_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/input_Please select the medical conditionco_1040f5'))

'set text in search cancer'
WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Please select the medical conditionco_1040f5'),
	'Blindness')

'press enter'
WebUI.sendKeys(findTestObject('Object Repository/Page_Health Compliance Management System/input_Please select the medical conditionco_1040f5'),
	Keys.chord(Keys.ENTER))

'clear text in search\r\n'
WebUI.clearText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Please select the medical conditionco_1040f5'))

'Members menu visible'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/div_MembersAKSHITH'))

'Help option visible or not'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Need Help'))

'help option clickable or not'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/button_Need Help'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Need Help'))

'great button verifications'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/button_Great'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/button_Great'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Great'))

'Report menu visibile'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Health Compliance Management System/a_Report'))

WebUI.takeFullPageScreenshotAsCheckpoint('PreCondition')

WebUI.closeBrowser()

