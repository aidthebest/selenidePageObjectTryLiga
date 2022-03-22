package pages.objects;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.ClassOrderer;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class BuyPage {

    private static BuyPage buyPage;

    private SelenideElement categorySetCheckBox;
    private SelenideElement brandSetCheckBox;
    private SelenideElement priceSetMin;
    private SelenideElement priceSetMax;
    private SelenideElement itemSetButton;

    @FindBy(className = "Category")
    private SelenideElement productCategory;

    @FindBy(className = "Brand")
    private SelenideElement productBrand;

    @FindBy(className = "Price")
    private SelenideElement productPrice;

    @FindBy(className = "ItemList")
    private SelenideElement itemList;


    public void setCategory (ClickOptions category) {
        buyPage.categorySetCheckBox.click(category);
    }

    public void setBrand (ClickOptions brand) {
        buyPage.brandSetCheckBox.click(brand);
    }

    public void setPrice (int min, int max) {
        buyPage.priceSetMin.setValue(String.valueOf(min));
        buyPage.priceSetMin.setValue(String.valueOf(max));
    }

    public void setItem (ClickOptions item) {
        buyPage.itemSetButton.click(item);
    }
}
