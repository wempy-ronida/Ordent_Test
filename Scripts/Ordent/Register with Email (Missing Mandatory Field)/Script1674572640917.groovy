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

WebUI.setText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__name'), 't')

WebUI.sendKeys(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__name'), Keys.chord(Keys.BACK_SPACE))

WebUI.getText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/div_Nama lengkap harus diisi'))

WebUI.setText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__email'), 't')

WebUI.sendKeys(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__email'), Keys.chord(Keys.BACK_SPACE))

WebUI.getText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/div_Email harus diisi'))

WebUI.setText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__phone'), '0')

WebUI.sendKeys(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__phone'), Keys.chord(Keys.BACK_SPACE))

WebUI.getText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/div_Nomor ponsel harus diisi'))

WebUI.setEncryptedText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__w-1112 border-b bg-transparent focus_7b9b6f'), 
    'J7R4ejOak4Y=')

WebUI.sendKeys(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/input__w-1112 border-b bg-transparent focus_7b9b6f'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.getText(findTestObject('Object Repository/Ordent/Register/Page_Bioskop Online/div_Kata sandi harus diisi'))

WebUI.closeBrowser()
