package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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
        sleep(int1 * 1000); // ms olarak aldigi icin sn cevirmek icin 1000 ile carpiyoruz
    }

    @Then("onceki sayfaya gider")
    public void onceki_sayfaya_gider() {
        back();
    }

    @Then("sonraki sayfaya gider")
    public void sonraki_sayfaya_gider() {
        forward();
    }

    @Then("sayfayi yeniler")
    public void sayfayi_yeniler() {
        refresh();
    }

    @Then("sayfayi acik tutar")
    public void sayfayi_acik_tutar() {
        // varsayilan Selenide ayarlarinda browser otomatic kapanir
        Configuration.holdBrowserOpen = true; // browser kapanmasini onler
    }

}
