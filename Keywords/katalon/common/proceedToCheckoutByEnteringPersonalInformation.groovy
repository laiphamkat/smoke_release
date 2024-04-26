package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.model.FailureHandling

public class proceedToCheckoutByEnteringPersonalInformation {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button 'checkout' -> Navigate to page 'checkout-step-one.html'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_cart_html/button_checkout'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))
        "Step 2: Click on input field 'firstName'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstname'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstname'))
        "Step 3: Enter input value in input field 'firstName'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstname'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstname'), data['input_firstname'])
        "Step 4: Click on input field 'lastName'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastname'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastname'))
        "Step 5: Enter input value in input field 'lastName'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastname'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastname'), data['input_lastname'])
        "Step 6: Click on input field 'postalCode'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalcode'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalcode'))
        "Step 7: Enter input value in input field 'postalCode'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalcode'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalcode'), data['input_postalcode'])
        "Step 8: Click on input field 'continue'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_one_html/input_continue'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_continue'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_firstname'] = testData.getValue('input_firstname', rowIndex)
        data['input_lastname'] = testData.getValue('input_lastname', rowIndex)
        data['input_postalcode'] = testData.getValue('input_postalcode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_firstname'] = 'default_data'
        data['input_lastname'] = 'default_data'
        data['input_postalcode'] = 'default_data'
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

