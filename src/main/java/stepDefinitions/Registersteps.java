package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registersteps {
    WebDriver driver;

    @Given("Kullanıcı MACFit kayıt sayfasına gider")
    public void kulanici_macfit_uyelik_sayfasina_girer(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://portal.macfit.com/tr/dijital-uyelik-formu?utm_source=google&utm_medium=cpc&utm_campaign=gp_search_macfit_purebrand_webform3&gad_source=1&gad_campaignid=22221489024&gclid=EAIaIQobChMIneCm6sbXjgMVLIpQBh2xRzpyEAAYASAAEgKwhPD_BwE");
        driver.manage().window().maximize();
    }
    @When("Kullanıcı kayıt formuna geçerli bilgileri girer")
    public void Kullanıcı_kayıt_formuna_geçerli_bilgileri_girer(){
        driver.findElement(By.id("phone")).sendKeys("5311234567");
        driver.findElement(By.xpath("//*[@id=\"city\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"a54999e92bef-9\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"club\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"a3f453a8c37f-23\"]")).click();
    }
@And("Kullanıcı kaydı tamamlar")
    public void Kullanici_kaydi_tamamlar(){
    driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-modal/div[3]/button")).click();

}
    @Then("Kullanıcı başarılı şekilde ücretsiz deneme kazanır")
    public void Kullanıcı_basarili_sekilde_ucretsiz_deneme_kazanir() {
        String currentUrl = driver.getCurrentUrl();
        assert !driver.getCurrentUrl().equals("https://portal.macfit.com/gunluk-uyelik");
        driver.quit();
    }

}
