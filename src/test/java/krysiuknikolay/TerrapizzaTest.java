package krysiuknikolay;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TerrapizzaTest {
    WebDriver driver;

    @BeforeEach
    public void warmUP() {
        driver = new ChromeDriver();
        driver.get(TerrapizzaPage.LINK_BASE_PAGE);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void testTerrapizzaAddMargarita() {
        driver.findElement(TerrapizzaPage.BUTTON_CLOSE_COOKIE).click();
        driver.findElement(TerrapizzaPage.BUTTON_MENU).click();
        driver.findElement(TerrapizzaPage.BUTTON_PIZZA).click();
        driver.findElement(TerrapizzaPage.BUTTON_ADD_MARGARITA_IN_CART).click();
        driver.findElement(TerrapizzaPage.BUTTON_CART).click();
        String actual = driver.findElement(TerrapizzaPage.LABEL_MARGARITA_IN_CART).getText();
        Assertions.assertEquals("Пицца Венеция Классическая 32 см", actual);

    }
    @Test
    public void testTerrapizzaAddMargaritaAndDrink(){
        driver.findElement(TerrapizzaPage.BUTTON_CLOSE_COOKIE).click();
        driver.findElement(TerrapizzaPage.BUTTON_MENU).click();
        driver.findElement(TerrapizzaPage.BUTTON_PIZZA).click();
        driver.findElement(TerrapizzaPage.BUTTON_ADD_MARGARITA_IN_CART).click();
        driver.findElement(TerrapizzaPage.BUTTON_BAR).click();
        driver.findElement(TerrapizzaPage.BUTTON_ADD_MIRINDA_IN_CART).click();
        driver.findElement(TerrapizzaPage.BUTTON_CART).click();
        List<WebElement> Cart = driver.findElements(TerrapizzaPage.LABEL_MARGARITA_IN_CART);
        Assertions.assertEquals("Пицца Венеция Классическая 32 см", Cart.get(0).getText());
        Assertions.assertEquals("Mirinda (Беларусь)", Cart.get(1).getText());

    }

    @AfterEach
    public void out() {
        driver.quit();

    }
}
