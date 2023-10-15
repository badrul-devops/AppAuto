package Test;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestApp {

    public static AppiumDriver<MobileElement> driver;

    public static void testion() throws Exception{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","Badrul-phone");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","12");
        cap.setCapability("appPackage","com.reddit.frontpage");
        cap.setCapability("appActivity","com.reddit.frontpage.StartActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public static void main(String[] args) throws Exception {

        try {
            testion();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getStackTrace());
            System.out.println("Device not found");

        }




    }
    By Home = By.xpath("//android.widget.TextView[@content-desc=\"Home feed\"]");


    By navBar = By.xpath("(/android.view.ViewGroup/android.widget.TextView)[1]");

    By homeIcon = By.xpath("/android.view.View[1]/android.view.View/android.view.View");

    By homeText = By.xpath("(//android.widget.TextView[@content-desc=\"Home feed\"])[1]");










    public WebElement home(){
        return driver.findElement(Home);
    }


    public WebElement Navbar(){

        return driver.findElement(navBar);


    }

    public WebElement homeIcon(){
        return driver.findElement(homeIcon);

    }
    public WebElement Hometaxt(){
        return driver.findElement(homeText);

    }
//    public WebElement homeIcon(){
//        return driver.findElement(homeIcon);
//
//    }



}
