package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{


    @FindBy(xpath = "//span[normalize-space()='$23.90']")
    private WebElement firstProductRegularPrice;

    @FindBy (xpath = "//span[@class='discount discount-percentage']")
    private WebElement firstProductDiscount;

    @FindBy (xpath = "#group_1 option[title='XL']")
    private WebElement firstProductSize;

    @FindBy (xpath = "//span[normalize-space()='$35.90']")
    private WebElement secondProductRegularPrice;

    @FindBy (xpath = "//span[@class='discount discount-percentage']")
    private WebElement secondProductDiscount;

    @FindBy (xpath = "#group_1 option[title='M']")
    private WebElement secondProductSize;

    public ProductPage(WebDriver driver) {
        super(driver);
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
    public String getSecondProductRegularPrice(){
        return secondProductRegularPrice.getText();
    }
    public String getSecondProductDiscount(){
        return secondProductDiscount.getText();
    }
    void secondProductSize(){
        secondProductSize.click();
    }
}
