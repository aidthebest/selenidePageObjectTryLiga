package pages.step;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import pages.objects.BuyPage;

public class Steps {

    private BuyPage buyPage;

    public Steps() {
        buyPage = BuyPage.getBuyPage();
    }

    public void setCategory (ClickOptions category) {
        buyPage.categorySetCheckBox.click(category);
    }

    public void setBrand (ClickOptions brand) {
        buyPage.brandSetCheckBox.click(brand);
    }

    public void setItemInList (ClickOptions item) {buyPage.itemSetButton.click(item);}
}
