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

Mobile.startApplication(GlobalVariable.ApkLocation, true)

CustomKeywords.'com.reviver.utils.CommonUtils.selectEnv_Mobile'(GlobalVariable.selectENV, 5)

Mobile.waitForElementPresent(findTestObject('StartPage/android.widget.TextView0 - SIGN IN'), 5)

Mobile.tap(findTestObject('StartPage/android.widget.TextView0 - SIGN IN'), 0)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('LoginPage/FORGOT PASSWORD link'), 0)

Mobile.tap(findTestObject('LoginPage/FORGOT PASSWORD link'), 0)

Mobile.waitForElementPresent(findTestObject('Forgot password Page/Enter email texxtbox'), 5)

Mobile.setText(findTestObject('Forgot password Page/Enter email texxtbox'), 'ayush', 0)

Mobile.verifyElementAttributeValue(findTestObject('Forgot password Page/field error'), 'text', 'Please enter a valid email.', 
    0)

Mobile.setText(findTestObject('Forgot password Page/Enter email texxtbox'), 'ayush.kumar+qa99@revivertest.com', 0)

Mobile.tap(findTestObject('Forgot password Page/SEND button'), 0)

Mobile.waitForElementPresent(findTestObject('Forgot password Page/Alert title - Email Sent Successfully'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Forgot password Page/ALert text'), 'text', 'Check your Inbox and click on the password reset link.', 
    0)

Mobile.tap(findTestObject('Forgot password Page/Alert button - OK'), 0)

Mobile.waitForElementPresent(findTestObject('StartPage/android.widget.TextView0 - SIGN IN'), 10)

Mobile.tap(findTestObject('StartPage/android.widget.TextView0 - SIGN IN'), 0)

Mobile.verifyElementVisible(findTestObject('LoginPage/android.widget.TextView0 - Sign In'), 0)
Mobile.closeApplication()

