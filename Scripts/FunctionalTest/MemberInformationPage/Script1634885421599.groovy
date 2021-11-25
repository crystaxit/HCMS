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

WebUI.navigateToUrl('https://dev.heaps.ai/hra/member/MEM112/U2FsdGVkX18Cm0p4eiQJzffRjGaIswbn9fXwHUG7S%2BLbN6yBGnAHKdTsPGWnvyBd/followup/memberinfo')

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_MembersAKSHITH'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_Vimarsha  (Dependent) MOINPERMILITESTI_7ec61a'))

'Whole member info card'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/mat-card_Member Information Name  Age FEMAL_680937'))

'header text Member Information'
WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/mat-card-header_Member Information'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/input_Member Information_member_name'))

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Member Information_member_name'), 
    'ABCD')

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Name_age'), '28')

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_FEMALE'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_FEMALE'))

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Gender_phone'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/textarea_Email_address'), 'India')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Health Compliance Management System/span_Lets get started -'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_Lets get started -'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_Member record saved successfully'))

