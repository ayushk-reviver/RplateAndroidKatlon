package com.reviver.utils
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class CommonUtils {

	
	@Keyword
	def selectEnv_Mobile(String env, int timeout){
		
		System.out.println(env)
		
		switch(env)
		{
			case "QA":
			
			Mobile.waitForElementPresent(findTestObject('StartPage/android.widget.TextView0 - QA'), timeout)
			
			Mobile.tap(findTestObject('StartPage/android.widget.TextView0 - QA'), 0)
			break
			case "PRODUCTION":
			Mobile.waitForElementPresent(findTestObject('StartPage/android.widget.TextView0 - Production'), timeout)
			
			Mobile.tap(findTestObject('StartPage/android.widget.TextView0 - Production'), 0)
			break
			
			case "FW":
			Mobile.waitForElementPresent(findTestObject('StartPage/android.widget.TextView0 - Firmware testing'), timeout)
			
			Mobile.tap(findTestObject('StartPage/android.widget.TextView0 - Firmware testing'), 0)
			break
		}
	}
}
