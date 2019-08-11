package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class MailPage(driver: WebDriver) : BasePage(driver) {
    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(id = "q")
    lateinit var searchBar: WebElement

    @FindBy(id = "search:submit")
    lateinit var searchBtn: WebElement

    fun open() {
        open("https://www.mail.ru")
    }

    fun searchFor(text: String): WebDriver {
        searchBar.click()
        searchBar.sendKeys(text)
        searchBtn.click()
        return driver
    }
}