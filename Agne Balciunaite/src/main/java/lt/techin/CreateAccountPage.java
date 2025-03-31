package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='No account? Create one here']")
    private WebElement createAccountButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);

        void createAccountButton() {
            createAccountButton.click();
        }

    }
}
