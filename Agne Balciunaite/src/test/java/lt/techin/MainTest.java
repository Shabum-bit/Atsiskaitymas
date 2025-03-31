package lt.techin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest extends BaseTest{

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testData.csv", numLinesToSkip = 1)
    void shoppingPage(String price, String discount){

        MainPage mainPage = new MainPage(driver);
        ProductPage productPage = new ProductPage(driver);

        mainPage.firstProduct();

        String firstProductRegularPrice = productPage.getFirstProductRegularPrice();
        assertEquals(price, firstProductRegularPrice);

        String firstProductDiscount = productPage.getFirstProductDiscount();
        assertEquals(discount,firstProductDiscount);

        productPage.firstProductSize();

        mainPage.secondProduct();

        String secondProductRegularPrice = productPage.getSecondProductRegularPrice();
        assertEquals(price, secondProductRegularPrice);

        String secondProductDiscount = productPage.getFirstProductDiscount();
        assertEquals(discount,secondProductDiscount);

        productPage.secondProductSize();
    }

    @Test
    void mainPage(){
        MainPage mainPage = new MainPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        mainPage.signInButton();

        createAccountPage.createAccountButton();


    }

}
