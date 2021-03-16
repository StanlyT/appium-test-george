package screens

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class FirstLoginToGeorgeScreen(appiumDriver: AppiumDriver<*>) : BaseScreen(appiumDriver) {
    init {
        this.appiumDriver = appiumDriver
        PageFactory.initElements(appiumDriver, this)
    }

    @FindBy(id = "cz.csas.georgego:id/kyc_tour_title_txt")
    lateinit var kycTourTitle : WebElement

    @FindBy(id = "cz.csas.georgego:id/kyc_tour_login_btn")
    lateinit var tourLoginBtn : WebElement

    @FindBy(id = "cz.csas.georgego:id/kyc_tour_kyc_btn")
    lateinit var getGeorgeBtn : WebElement

    override fun isScreenDisplayed() {
        waitForElementToBeVisible(kycTourTitle)
        tourLoginBtn.isDisplayed
        getGeorgeBtn.isDisplayed
    }
}