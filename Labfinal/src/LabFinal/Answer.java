package LabFinal;

import helppackage.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Answer
{
    public static WebDriver webDriver;
    public static void loadWeb()
    {
        webDriver=Base.getDriver();
        webDriver.get("https://www.saucedemo.com/");
    }
    public static void login()
    {
        try {

            WebElement element = webDriver.findElement(By.id("user-name"));
            element.sendKeys("performance_glitch_user");
            WebElement element2=webDriver.findElement(By.id("password"));
            element2.sendKeys("secret_sauce");
            WebElement element3=webDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
            element3.click();
            Thread.sleep(3000);

        }
        catch (Exception e)

        {

        }

    }
    public static void navigateSourceLab()
    {
        try {
            WebElement element=webDriver.findElement(By.className("inventory_item_name"));
            element.click();
            Thread.sleep(3000);

        }
        catch (Exception e)
        {

        }

    }
    public static void backToProduct()
    {
        try {
            WebElement element=webDriver.findElement(By.id("back-to-products"));
            element.click();
            Thread.sleep(3000);


        }
        catch (Exception e)
        {

        }

    }
    public static void checkoutTheIcon()
    {
        try {
            WebElement element=webDriver.findElement(By.id("react-burger-menu-btn"));
            element.click();
            WebElement element2=webDriver.findElement(By.className("shopping_cart_link"));
            element2.click();
            Thread.sleep(3000);


        }
        catch (Exception e)
        {

        }

    }
    public static void checkout()
    {
        try {
            WebElement element=webDriver.findElement(By.id("checkout"));
            element.click();
            Thread.sleep(3000);


        }
        catch (Exception e)
        {

        }

    }
    public static void fillTheForm()
    {
        try {
            WebElement element=webDriver.findElement(By.id("first-name"));
            element.sendKeys("First Name");
            WebElement element2=webDriver.findElement(By.id("last-name"));
            element2.sendKeys("Last Name");
            WebElement elemen3=webDriver.findElement(By.id("postal-code"));
            elemen3.sendKeys("Zip/Postal Code");
            Thread.sleep(3000);


        }
        catch (Exception e)
        {


        }

    }
    public static void Continue()
    {
        try {
            WebElement element=webDriver.findElement(By.id("continue"));
            element.click();
            Thread.sleep(3000);


        }
        catch (Exception e)
        {

        }

    }
    public static void  quit()
    {
        try {
            Thread.sleep(3000);

            webDriver.quit();


        }
        catch (Exception e)
        {

        }
    }
    public static void main(String[] args) {
         loadWeb();
         login();
         navigateSourceLab();
         backToProduct();
         checkoutTheIcon();
         checkout();
         fillTheForm();
         Continue();
         quit();

    }
}
