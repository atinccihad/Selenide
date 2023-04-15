@locators
Feature: locators

  Scenario: TC01 locators
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication" adresine gider
    And kullanici adini gir
    And kullanici sifresini gir
    And 3 saniye bekler
    When submit buttonuna tikla
    And 3 saniye bekler
    Then giris yapildigini test et

  # 1.feature file olustur
  # 2. test case'leri yaz
  # 3. yeni test adimlari icin yeni bir Stepdefinition(Class) olusturalim ve stepdefinitions(java methots) olustur
  # 4. Page class olustur(pages package altinda)
  # 5. kullaniciAdi, sifresi ve submit butonunu o sayfada bul
  # 6. testleri uygula

      #    In Selenide framework, we can find web elements with both Selenide OR Selenium locators.
      #  $ character => used to find single element
      #  $ character => return SelenideElement
      #       1st way=> public SelenideElement inputField = $(cssSelector:"[name='q']");
      #       2nd way=> public SelenideElement inputField = $(By.name=("q"));  => $(By) -> 8 locators
      #  $$ character => used to find multiple element
      #  $$ character => returns List<SelenideElement>
      #  $$ character => returns also ElementsCollection
