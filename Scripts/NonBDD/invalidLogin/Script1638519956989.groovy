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
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.configuration.RunConfiguration

def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_androidApp, RunConfiguration.getProjectDir())
			
Mobile.startApplication(appPath, true)

Mobile.tap(findTestObject('Login/Lewati Button'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Login/Masukkan Nomor HP Field'), GlobalVariable.G_Timeout)

Mobile.setText(findTestObject('Login/Masukkan Nomor HP Field'), '089836' + '\\n', GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Login/Missedcall Option Button'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Login/Phone number Submit Button'), GlobalVariable.G_Timeout)

Mobile.verifyElementExist(findTestObject('Login/Penulisan nomor HP yang benar 08 Verification'), GlobalVariable.G_Timeout)




