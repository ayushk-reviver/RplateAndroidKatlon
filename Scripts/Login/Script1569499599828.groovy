import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/Users/ayush/Desktop/APKs/Rplate26sept120.apk', true)

Mobile.waitForElementPresent(findTestObject('StartPage/android.widget.TextView0 - QA'), 5)

Mobile.tap(findTestObject('StartPage/android.widget.TextView0 - QA'), 0)

Mobile.waitForElementPresent(findTestObject('StartPage/android.widget.TextView0 - SIGN IN'), 5)

Mobile.tap(findTestObject('StartPage/android.widget.TextView0 - SIGN IN'), 0)

Mobile.setText(findTestObject('LoginPage/android.widget.EditText0 - Enter email'), 'ayush.kumar+qa7@revivertest.com', 0)

Mobile.setText(findTestObject('LoginPage/android.widget.EditText0 - Enter password'), 'Tester@123', 0)

Mobile.tap(findTestObject('LoginPage/android.widget.Button0 - SIGN IN'), 0)

Mobile.waitForElementPresent(findTestObject('Homepage/Burger Icon'), 10)

Mobile.closeApplication()

