package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//div[@class='products row']//img[@alt='Hummingbird printed t-shirt']")
    private WebElement firstProduct;

    @FindBy (xpath = "//span[normalize-space()='$23.90']")
    private WebElement firstProductRegularPrice;

    @FindBy (xpath = "//span[@class='discount discount-percentage']")
    private WebElement firstProductDiscount;

    @FindBy (xpath = "#group_1 option[title='XL']")
    private WebElement firstProductSize;

    @FindBy(xpath = "//div[@class='products row']//img[@alt='Brown bear printed sweater']")
    private WebElement secondProduct;

    @FindBy (xpath = "//span[normalize-space()='$35.90']")
    private WebElement secondProductRegularPrice;

    @FindBy (xpath = "//span[@class='discount discount-percentage']")
    private WebElement secondProductDiscount;

    @FindBy (xpath = "#group_1 option[title='M']")
    private WebElement secondProductSize;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    void firstProduct(){
        firstProduct.click();
    }
    public String getFirstProductRegularPrice(){
        return firstProductRegularPrice.getText();
    }
    public String getFirstProductDiscount(){
        return firstProductDiscount.getText();
    }
    void firstProductSize(){
        firstProductSize.click();
    }
    void secondProduct(){
        firstProduct.click();
    }
    public String getSecondProductRegularPrice(){
        return secondProductRegularPrice.getText();
    }
    public String getSecondProductDiscount(){
        return secondProductDiscount.getText();
    }
    void secondProductSize(){
        firstProductSize.click();
    }

}
