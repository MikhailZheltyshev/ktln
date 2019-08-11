import org.junit.jupiter.api.Test
import pages.MailPage
import pages.SearchResultsPage

class SearchTest : BaseTest() {
    var mailPage: MailPage = MailPage(driver)
    var searchResultsPage: SearchResultsPage = SearchResultsPage(driver)

    @Test
    fun simpleSearchTest() {
        mailPage.open()
        mailPage.searchFor("Some text")
        assert(searchResultsPage.isGoHeaderPresent())
    }

    @Test
    fun simpleSearch2Test() {
        mailPage.open()
        mailPage.searchFor("Some text")
        assert(searchResultsPage.isGoHeaderPresent())
    }

    @Test
    fun simpleSearch3Test() {
        mailPage.open()
        mailPage.searchFor("Some text")
        assert(searchResultsPage.isGoHeaderPresent())
    }
}