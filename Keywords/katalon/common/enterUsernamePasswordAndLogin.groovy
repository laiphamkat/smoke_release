package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.model.FailureHandling

public class enterUsernamePasswordAndLogin {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on input field 'user-name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/input_user-name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_user-name'))
        "Step 2: Enter input value in input field 'user-name'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/input_user-name'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_user-name'), data['input_user-name'])
        "Step 3: Click on input field 'password'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/input_password'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_password'))
        "Step 4: Enter input value in input field 'password'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/input_password'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_home/input_password'), data['input_password'])
        "Step 5: Click on input field 'login-button'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/input_login-button'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_login-button'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_user-name'] = testData.getValue('input_user-name', rowIndex)
        data['input_password'] = testData.getValue('input_password', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_user-name'] = 'default_data'
        data['input_password'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

