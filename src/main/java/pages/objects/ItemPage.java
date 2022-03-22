package pages.objects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ItemPage {
    private SelenideElement itemLabel;
    private SelenideElement priceLabel;
    private SelenideElement addToCartButton;
    private SelenideElement addToFavoritesButton;
    private SelenideElement addToComparisonButton;



    private ItemPage(String itemName) {
        itemLabel = Selenide.$x("path to label include itemName" );
        priceLabel = Selenide.$x("path tot product include itemName");
        addToCartButton = Selenide.$x("path to cart button include itemName");
        addToFavoritesButton = Selenide.$x("path to favorites button include itemName");
        addToComparisonButton = Selenide.$x("path to comp button include itemName");
    }

    static ItemPage getProductCard(String productName) {
        return new ItemPage(productName);
    }

}
