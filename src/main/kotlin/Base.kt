import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import java.util.concurrent.TimeUnit

open class Base {
    var driver: WebDriver

    init {
        when (System.getenv("browser")) {
            "firefox" -> {
                WebDriverManager.firefoxdriver().setup()
                this.driver = FirefoxDriver()
            }
            "edge" -> {
                WebDriverManager.edgedriver().setup()
                this.driver = EdgeDriver()
            }
            else -> {
                WebDriverManager.chromedriver().setup()
                this.driver = ChromeDriver()
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
        driver.manage().window().maximize()
    }
}