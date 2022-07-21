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

def verifyLogin, verifyBack

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/button_Ok'))

WebUI.click(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/button_x'))

WebUI.click(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/input_x_header-search-bar'))

WebUI.setText(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/input_concat(id(, , search-bar-input, , ))_query'), 
    'apel')

WebUI.sendKeys(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/input_concat(id(, , search-bar-input, , ))_query'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/img'))

WebUI.click(findTestObject('Object Repository/Web/Page_Jual Stella Naturals Apple Air Freshen_164734/span_Tambah ke troli'))

WebUI.click(findTestObject('Object Repository/Web/Page_Jual Stella Naturals Apple Air Freshen_164734/button_x'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Web/Page_Jual Stella Naturals Apple Air Freshen_164734/button_x2'))

WebUI.click(findTestObject('Object Repository/Web/Page_Jual Stella Naturals Apple Air Freshen_164734/span_Beranda'))

WebUI.click(findTestObject('Object Repository/Web/Page_Jual Stella Naturals Apple Air Freshen_db1cb6/button_x'))

WebUI.click(findTestObject('Object Repository/Web/Page_Jual Stella Naturals Apple Air Freshen_db1cb6/img_Tidak-Halal__2OlBL'))

WebUI.click(findTestObject('Object Repository/Web/Page_Produk Makanan Kering  Kalengan di Ran_e91efc/button_x'))

WebUI.click(findTestObject('Object Repository/Web/Page_Produk Makanan Kering  Kalengan di Ran_e91efc/span_'))

WebUI.click(findTestObject('Object Repository/Web/Page_Produk Makanan Kering  Kalengan di Ran_e91efc/img'))

WebUI.click(findTestObject('Object Repository/Web/Page_Produk Makanan Kering  Kalengan di Ran_7775ad/button_Tambah'))

WebUI.click(findTestObject('Object Repository/Web/Page_Produk Makanan Kering  Kalengan di Ran_7775ad/a_Ranch Market Pondok Indah_navbar-account'))

WebUI.click(findTestObject('Object Repository/Web/Page_Account  HappyFresh/a_Login'))

verifyLogin = WebUI.verifyElementPresent(findTestObject('Object Repository/Web/Page_Account  HappyFresh/input_Email_input-email'), 
    3,FailureHandling.OPTIONAL)

if (verifyLogin) {
    WebUI.setText(findTestObject('Object Repository/Web/Page_Account  HappyFresh/input_Email_input-email'), GlobalVariable.username)

    WebUI.setEncryptedText(findTestObject('Object Repository/Web/Page_Account  HappyFresh/input_Sandi_input-password'), 
        GlobalVariable.password)

    WebUI.click(findTestObject('Object Repository/Web/Page_Account  HappyFresh/button_Login'))
} else {
    WebUI.setText(findTestObject('Object Repository/Web/Page_Account  HappyFresh/input_email'), GlobalVariable.username)

    WebUI.setEncryptedText(findTestObject('Object Repository/Web/Page_Account  HappyFresh/input_password'), GlobalVariable.password)

    WebUI.click(findTestObject('Object Repository/Web/Page_Account  HappyFresh/button_login2'))
}

verifyBack = WebUI.verifyElementPresent(findTestObject('Object Repository/Web/Page_Account  HappyFresh/img'), 3, FailureHandling.OPTIONAL)

if(verifyBack) {
	WebUI.click(findTestObject('Object Repository/Web/Page_Account  HappyFresh/img'))
}else {
	WebUI.click(findTestObject('Object Repository/Web/Page_Account  HappyFresh/img2'))
}

WebUI.click(findTestObject('Object Repository/Web/Page_Account  Medan1  HappyFresh/a_3'))

WebUI.click(findTestObject('Object Repository/Web/Page_Cart  HappyFresh/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/button_alamatPengantar'))

WebUI.setText(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/input_Alamat Pengantaran_input-delivery-address'), 
    'jakarta')

WebUI.click(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/strong_Jakarta'))

WebUI.setText(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh/input'), '12')

WebUI.setText(findTestObject('Object Repository/Web/Page_HappyFresh Belanja Bulanan  Sayur Onli_65de43/textArea_catatanPengantar'), 
    'didekat portal')

WebUI.click(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh/div_Jadwalkan untuk nanti'))

WebUI.click(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh (1)/div_Saturday'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh/button_Pilih waktu pengantaran'))

WebUI.click(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh/div_Pilih Metode Pembayaran__lNlk2'))

WebUI.click(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh/button_Bayar dengan Aman'))

WebUI.click(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Web/Page_Checkout  HappyFresh/button_Mengerti'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

