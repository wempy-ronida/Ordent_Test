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

WebUI.openBrowser('https://bioskoponline.com/')

WebUI.click(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/span_Daftar'))

WebUI.setText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__name'), 'test')

WebUI.setText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__email'), 'wempsky@gmail.com')

WebUI.setText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__phone'), '08292131210')

WebUI.setEncryptedText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__w-1112 border-b bg-transparent focus_7b9b6f'), 
    'vB31XdcLjIZzwN98D9oklg==')

WebUI.click(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/span_Lanjutkan'))

WebUI.getText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/div_Email yang kamu masukkan sudah terdaftar'))

WebUI.getText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/div_Pastikan email yang di masukkan belum t_a22575'))

