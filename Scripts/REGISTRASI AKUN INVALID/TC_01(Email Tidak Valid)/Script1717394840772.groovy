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

WebUI.navigateToUrl('https://thermos.com/')

WebUI.doubleClick(findTestObject('Object Repository/Page_Thermos Brand/svg'))

WebUI.click(findTestObject('Object Repository/Page_Account  Thermos Brand/a_Create account'))

WebUI.setText(findTestObject('Object Repository/Page_Create Account  Thermos Brand/input_Already have an account_customername'), 
    'cahaya')

WebUI.setText(findTestObject('Object Repository/Page_Create Account  Thermos Brand/input_Already have an account_customeremail'), 
    'cahayaaa')

WebUI.setText(findTestObject('Object Repository/Page_Create Account  Thermos Brand/input_Already have an account_customerphone'), 
    '081265871397')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create Account  Thermos Brand/input_Already have an account_customerpassword'), 
    'Tok7evoUK82UnSWmDAvZkg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create Account  Thermos Brand/input_Must contain 1 capital letter_custome_851cae'), 
    '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Object Repository/Page_Create Account  Thermos Brand/input_concat(, , Close (esc), , )_email'), 
    'Ca')

WebUI.click(findTestObject('Object Repository/Page_Create Account  Thermos Brand/circle'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create Account  Thermos Brand/input_Must contain 1 capital letter_custome_851cae'), 
    'Tok7evoUK82UnSWmDAvZkg==')

WebUI.click(findTestObject('Object Repository/Page_Create Account  Thermos Brand/button_CREATE AN ACCOUNT'))

