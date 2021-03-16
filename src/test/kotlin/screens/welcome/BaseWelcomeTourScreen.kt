package screens.welcome

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import screens.BaseScreen

abstract class BaseWelcomeTourScreen(appiumDriver: AppiumDriver<*>) : BaseScreen(appiumDriver) {
    init {
        this.appiumDriver = appiumDriver
        PageFactory.initElements(appiumDriver, this)
    }

    @FindBy(id = "cz.csas.georgego:id/skip_tour_btn")
    lateinit var skipTourButton : WebElement
}