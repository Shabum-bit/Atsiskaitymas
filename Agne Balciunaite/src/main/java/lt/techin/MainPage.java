package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//div[@class='products row']//img[@alt='Hummingbird printed t-shirt']")
    private WebElement firstProduct;



    @FindBy(xpath = "//div[@class='products row']//img[@alt='Brown bear printed sweater']")
    private WebElement secondProduct;



    @FindBy (xpath = "//span[normalize-space()='Sign in']")
    private WebElement signInButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    void firstProduct(){
        firstProduct.click();
    }

    void secondProduct(){
        firstProduct.click();
    }

    void signInButton(){
        signInButton.click();
    }

}
