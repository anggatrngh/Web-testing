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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Page_DEMOQA/h5_Elements'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/h5_Elements'))

WebUI.scrollToElement(findTestObject('Page_DEMOQA/div_Forms'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Forms'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_Practice Form'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_firstName'), 'angga')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_lastName'), 'trinugraha')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'anggatri78@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_(10 Digits)_userNumber'), '0877884750')

WebUI.scrollToElement(findTestObject('Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), 0)

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '15 Mar 2025')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_15'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), 'kerja')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Sports'))

WebUI.rightClick(findTestObject('Object Repository/Page_DEMOQA/input_Select picture_uploadPicture'))

WebUI.uploadFile(findTestObject('Page_DEMOQA/input_Select picture_uploadPicture'), '/Users/anggatrinugraha/Downloads/sampleFile.jpeg')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'kucica')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/svg_Select State_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Haryana'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/svg_Select City_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Panipat'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

