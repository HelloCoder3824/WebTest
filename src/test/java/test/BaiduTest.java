package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * @class: BaiduTest
 * @description:
 * @author: Jindong
 * @create: 2020-06-01 14:10
 **/
public class BaiduTest {


    public WebDriver driver;

    /**
     *
     */

    @BeforeMethod
    public void BeforeLogin(){

        System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
        driver=new ChromeDriver();


    }



    @Parameters({"url"})
    @Test()
    public void LoginStript(String url ) throws Exception {
        driver.get(url);
        driver.manage().window().maximize();


    }


    @AfterMethod
    public void AfterLogin(){

        driver.close();
    }



}
