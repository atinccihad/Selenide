package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.*;

import java.util.Date;

import static com.codeborne.selenide.Selenide.*;

public class CommonStepDefinitions {

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        open(string);
    }

    @Then("{int} saniye bekler")
    public void saniye_bekler(Integer int1) {
        // selenide default olarak 4 sn bekler,
        // 4 sn den fazla beklemek icin sleep methodu kullanilir
        sleep(int1 * 1000); // ms olarak kabul ettigi icin, sn verisini 1000 ile carpiyoruz
    }

    @Then("onceki sayfaya gider")
    public void onceki_sayfaya_gider() {
        back(); // back() -> onceki sayfaya gider
    }

    @Then("sonraki sayfaya gider")
    public void sonraki_sayfaya_gider() {
         forward(); // forward() -> sonraki sayfaya gider
    }

    @Then("sayfayi yeniler")
    public void sayfayi_yeniler() {
        refresh(); // refresh() -> sayfayi yeniler
    }

    @Then("sayfayi acik tutar")
    public void sayfayi_acik_tutar() {
        // varsayilan Selenide ayarlarinda browser automatic kapanir
        Configuration.holdBrowserOpen = true; // browser kapanmasini onler, sayfayi acik tutar
    }

    @And("tum ekran goruntusunu alir")
    public void tumEkranGoruntusunuAlir() {
        // screenshot(new Date().toString()); // ekran goruntusune dynamic isim verildi
        screenshot("image");
    }

    @Given("kullanici browser tipini {string} olarak secer")
    public void kullaniciBrowserTipiniOlarakSecer(String browserTipi) {
        switch (browserTipi) {
            case "headless":
                Configuration.headless = true;
                break;

            case "firefox":
                Configuration.browser = "firefox";
                break;

            case "safari":
                Configuration.browser = "safari";
                break;

            case "opera":
                Configuration.browser = "opera";
                break;

            case "edge":
                Configuration.browser = "edge";
                break;

            default:
                Configuration.browser = "chrome";
                break;
        }

    }
}
