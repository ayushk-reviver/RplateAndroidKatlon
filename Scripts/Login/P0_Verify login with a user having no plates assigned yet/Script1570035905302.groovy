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

Mobile.setText(findTestObject('LoginPage/android.widget.EditText0 - Enter email'), findTestData(GlobalVariable.DataFile).getValue(
        1, 2), 0)

Mobile.setText(findTestObject('LoginPage/android.widget.EditText0 - Enter password'), findTestData(GlobalVariable.DataFile).getValue(
        2, 2), 0)

Mobile.tap(findTestObject('LoginPage/android.widget.Button0 - SIGN IN'), 0)

Mobile.waitForElementPresent(findTestObject('Homepage/Burger Icon'), 10)

Mobile.verifyElementVisible(findTestObject('Homepage/No plate image'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Homepage/no plate text 3'), 'text', 'Note: This may take 1–3 business days from when your order is processed.', 
    0)

Mobile.verifyElementAttributeValue(findTestObject('Homepage/no plate text1'), 'text', 'It looks like your plates haven’t been added to your account.', 
    0)

Mobile.verifyElementAttributeValue(findTestObject('Homepage/no plate text2'), 'text', 'You will be notified when your plate has been added to your account.', 
    0)

Mobile.verifyElementVisible(findTestObject('Homepage/No Plates Found text'), 0)

Mobile.tap(findTestObject('Homepage/Burger Icon'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Burger Menu/Notifications'), 'checkable', 'true', 0)


Mobile.closeApplication()

