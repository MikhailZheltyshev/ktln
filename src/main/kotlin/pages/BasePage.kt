package pages

import org.openqa.selenium.WebDriver

open class BasePage(var driver: WebDriver) {

    fun open(url: String) = driver.get(url)

    fun close() = driver.quit()
}