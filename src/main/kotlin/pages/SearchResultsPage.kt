package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class SearchResultsPage(driver: WebDriver) : BasePage(driver) {
    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(id = "go-header")
    lateinit var goHeader: WebElement

    fun isGoHeaderPresent(): Boolean = goHeader.isDisplayed
}