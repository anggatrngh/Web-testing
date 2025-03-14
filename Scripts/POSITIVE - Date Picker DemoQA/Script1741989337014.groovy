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

WebUI.click(findTestObject('Page_DEMOQA/h5_Elements'))

WebUI.scrollToElement(findTestObject('Page_DEMOQA/div_Widgets'), 0)

WebUI.click(findTestObject('Page_DEMOQA/div_Widgets'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_Date Picker'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Select Date_datePickerMonthYearInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '1998', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '9', true)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_15'))

WebUI.scrollToElement(findTestObject('Page_DEMOQA/div'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Date And Time_dateAndTimePickerInput'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_March_react-datepicker__year-read-view_281a40'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Page_DEMOQA/a__react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-previous'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_1998'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_March 1998_react-datepicker__month-rea_d49733'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_October'))

WebUI.click(findTestObject('Page_DEMOQA/div_15_1'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_0500'))

