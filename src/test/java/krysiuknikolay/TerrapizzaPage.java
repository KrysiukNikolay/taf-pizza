package krysiuknikolay;

import org.openqa.selenium.By;

public class TerrapizzaPage {
    public static final String LINK_BASE_PAGE = "https://terrapizza.by/";

    public static final By BUTTON_MENU = By.xpath("//a[@href='https://terrapizza.by/menu']");
    public static final By BUTTON_PIZZA = By.xpath("/html/body/div[3]/div[1]/div/div/div/div[3]/div/div[1]/div/div/div[9]/a");
    public static final By BUTTON_CART = By.xpath("//div[@class='basket__btn-top basket__top basket__btn-top--sm']");
    public static final By BUTTON_BAR = By.xpath("//li[@class='menu-navigation__item']/a[@href='/catalog/bar']");
    public static final By BUTTON_CLOSE_COOKIE = By.xpath("//button[@class='close-icon']");
    public static final By BUTTON_CLOSE_CART = By.xpath("//div[@class='basket__content-close']");
    public static final By BUTTON_ADD_MARGARITA_IN_CART = By.xpath("//div[@class='cart-button']//button[@data-id='356']");
    public static final By BUTTON_ADD_MIRINDA_IN_CART = By.xpath("//button[@data-hrf='/cart/add-basket?id=1734']");

    public static final By LABEL_MARGARITA_IN_CART = By.xpath("//div[@class='basket__products-item-name']");
    //public static final String LABEL_MIRINDA_IN_CART  = "//div[@class='basket__products-item-name']";


}
