package pages.objects;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class BuyPage {

    private static BuyPage buyPage;


    private SelenideElement priceSetMin;
    private SelenideElement priceSetMax;
    public SelenideElement itemSetButton;
    public SelenideElement categorySetCheckBox;
    public SelenideElement brandSetCheckBox;
    public SelenideElement paginationSet;

    @FindBy(className = "Category")
    private SelenideElement productCategory;

    @FindBy(className = "Brand")
    private SelenideElement productBrand;

    @FindBy(className = "Price")
    private SelenideElement productPrice;

    @FindBy(className = "ItemList")
    private SelenideElement itemList;

    public void setPrice (int min, int max) {
        buyPage.priceSetMin.setValue(String.valueOf(min));
        buyPage.priceSetMin.setValue(String.valueOf(max));
    }

    public static BuyPage getBuyPage() {
        if (Objects.isNull(buyPage)) buyPage = Selenide.page(new BuyPage());
        return buyPage;
    }

    public void setPaginationPage(ClickOptions count) {
        buyPage.paginationSet.click(count);
    }
}
