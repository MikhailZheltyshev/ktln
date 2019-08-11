import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.openqa.selenium.WebDriver

open class BaseTest {

    companion object {
        lateinit var driver: WebDriver

        @BeforeAll
        @JvmStatic
        fun setup() {
            driver = Base().driver
        }

        @AfterAll
        @JvmStatic
        fun tearDown() {
            driver.quit()
        }
    }
}