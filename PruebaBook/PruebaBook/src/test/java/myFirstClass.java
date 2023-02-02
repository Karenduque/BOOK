import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class myFirstClass {

    public static void main(String[] args) throws InterruptedException {
        String book = "Bajo la misma estrella";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.goodreads.com/");
        driver.findElement(By.id("sitesearch_field")).sendKeys(book);
        driver.findElement(By.cssSelector("img[alt='search']")).click();
        driver.findElement(By.cssSelector("img[src='//s.gr-assets.com/assets/gr/icons/icon_close-63734f04e7baaa77fbad796225e5724c.svg']")).click();
        WebElement title= driver.findElement(By.cssSelector(".tableList > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1) > span:nth-child(1)"));
        //assertThat(title.getText(), equalTo(LOGIN_TITLE));
        Assert.assertEquals(title.getText(), book);

        //driver.findElements(By.className("button.gr-iconButton")).get(3).click();
        //System.out.println(driver.findElements(By.className("gr-iconButton")).get(3));


        //driver.findElement(By.linkText("https://s.gr-assets.com/assets/gr/icons/icon_close-63734f04e7baaa77fbad796225e5724c.svg")).click();
        //driver.findElement(By.className("radius")).click();
        //driver.findElement(By.id("bookTitle")).click();



        //String googleSource = driver.getPageSource();
        //String googleHandle = driver.getWindowHandle();
        //System.out.println(googleHandle);

/*      driver.navigate().to("https://www.udemy.com");
        String udemyTitle = driver.getTitle();
        System.out.println("Udemy title is: " + udemyTitle);
        String udemyurl = driver.getCurrentUrl();
        System.out.println("Udemy url is: " + udemyurl);
        driver.navigate().back();
        driver.getCurrentUrl();
        String googleurl = driver.getCurrentUrl();
        System.out.println("Google url is: " + googleurl);

        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        googleurl = driver.getCurrentUrl();
        System.out.println("Google url is: " + googleurl);
        driver.navigate().forward();
        udemyurl = driver.getCurrentUrl();
        System.out.println("Udemy url is: " + udemyurl);
        //Thread.sleep(1000);

 */
        Thread.sleep(1000);
        driver.quit();
    }
}
