import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page thank-youf3a00-9dd9-410d-93c8-b258087d0814'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/thank-you/740f3a00-9dd9-410d-93c8-b258087d0814')

'step 2: Add visual checkpoint at Page thank-youf3a00-9dd9-410d-93c8-b258087d0814'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify successful navigation to Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
