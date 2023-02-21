package krysiuknikolay;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

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
        public void testTerrapizza() {
        driver.findElement(By.xpath(TerrapizzaPage.BUTTON_CLOSE_COOKIE)).click();
        driver.findElement(By.xpath(TerrapizzaPage.BUTTON_MENU)).click();
        driver.findElement(By.xpath(TerrapizzaPage.BUTTON_PIZZA)).click();
        driver.findElement(By.xpath(TerrapizzaPage.BUTTON_ADD_MARGARITA_IN_CART)).click();
        driver.findElement(By.xpath(TerrapizzaPage.BUTTON_CART)).click();
        String actual = driver.findElement(By.xpath(TerrapizzaPage.LABEL_MARGARITA_IN_CART)).getText();
        Assertions.assertEquals("Пицца Венеция Классическая 32 см", actual);


    }

    @AfterEach
    public void out() {
        driver.quit();

    }
}
