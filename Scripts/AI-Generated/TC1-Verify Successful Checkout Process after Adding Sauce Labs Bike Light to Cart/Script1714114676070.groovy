import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.proceedToCheckoutByEnteringPersonalInformation
import katalon.common.enterUsernamePasswordAndLogin
import internal.GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www.saucedemo.com/"

TrueTestScripts.navigate('/')

"Step 2: Login into Application"

WebUI.takeScreenshot()

TrueTestScripts.login()

"Step 3: Enter username, password, and login"

WebUI.takeScreenshot()

enterUsernamePasswordAndLogin.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on button 'add-to-cart-sauce-labs-bike-light'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_add-to-cart-sauce-labs-bike-light'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_add-to-cart-sauce-labs-bike-light'))

"Step 5: Click on link '1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/link_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_1'))

"Step 6: Proceed to checkout by entering personal information"

WebUI.takeScreenshot()

proceedToCheckoutByEnteringPersonalInformation.execute(data_path_1, Integer.valueOf(index_1))

"Step 7: Click on button 'finish' -> Navigate to page 'checkout-complete.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

"Step 8: Click on button 'back-to-products' -> Navigate to page 'inventory.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkout_complete_html/button_back-to-products'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/button_back-to-products'))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Checkout Process after Adding Sauce Labs Bike Light to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
