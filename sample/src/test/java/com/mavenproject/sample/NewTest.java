package com.mavenproject.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

    WebDriver driver;
    WebElement element;

    @BeforeTest
    public void testsetup() {
        System.setProperty("webdriver.gecko.driver", "D:\\Madhavi\\Testing\\libs\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();

    }

    @Test
    public void test1() {

        driver.navigate().to("http://demoqa.com/");
        element = driver.findElement(By.cssSelector("#menu-item-64 > a:nth-child(1)"));
        element.click();

    }
    @Test
    public void test2() {

        element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/form/p[1]/span/input"));
        element.sendKeys("kiran gorad");

        element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/form/p[2]/span/input"));
        element.sendKeys("kirangorad@yahoo.in");

        element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/form/p[3]/span/input"));
        element.sendKeys("want to ask somthing about testing");

    }
    
    @Test
    public void test3() {

        element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/form/p[4]/span/textarea"));
        element.sendKeys("please contact as soon as possible ");

        element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/form/p[5]/input"));

    }

    @AfterTest
    public void clearTest() {
        driver.close();
        driver.quit();
    }

}