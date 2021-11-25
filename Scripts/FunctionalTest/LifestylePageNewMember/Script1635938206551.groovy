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

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_MembersAKSHITH'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/mat-option_Akshith D2  (Dependent) PO112  A_63240e'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/span_Lets get started -'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Do you take Annual Medical Tests_mat-ch_08f550'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Yes_mat-checkbox-inner-container'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_History of sudden family deaths, due to_055630'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Cigarettes smoking, per day_mat-checkbo_c274c5'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Tobacco, pan masala packs per day_mat-c_b9ce90'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_No. of Hospital Admissions in last 6 mo_e078b4'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_4_mat-checkbox-inner-container'))

WebUI.check(findTestObject('Object Repository/Page_Health Compliance Management System/div_Alcohol consumption per day (in pegs)_m_be9479'))

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_Height Cms'))

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Just a few more details_height'), 
    '170')

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/div_Height Cms Weight  Kgs WaistInches'))

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Cms_weight'), '70')

WebUI.setText(findTestObject('Object Repository/Page_Health Compliance Management System/input_Kgs_waist'), '32')

WebUI.click(findTestObject('Object Repository/Page_Health Compliance Management System/button_Next'))

WebUI.closeBrowser()

