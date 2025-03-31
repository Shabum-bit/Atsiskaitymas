package lt.techin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest extends BaseTest{

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testData.csv", numLinesToSkip = 1)
    void shoppingPage(String price, String discount){

        MainPage mainPage = new MainPage(driver);

        mainPage.firstProduct();

        String firstProductRegularPrice = mainPage.getFirstProductRegularPrice();
        assertEquals(price, firstProductRegularPrice);

        String firstProductDiscount = mainPage.getFirstProductDiscount();
        assertEquals(discount,firstProductDiscount);

        mainPage.firstProductSize();

        mainPage.secondProduct();

        String secondProductRegularPrice = mainPage.getSecondProductRegularPrice();
        assertEquals(price, secondProductRegularPrice);

        String secondProductDiscount = mainPage.getFirstProductDiscount();
        assertEquals(discount,secondProductDiscount);

        mainPage.secondProductSize();
    }
}
