Feature: alerts

  @alert
  Scenario: TC01 alert
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=javascript-alerts" adresine gider
    And alert prompt butonuna tiklar
    And kullanici alert'e "Hello" metnini yazarve OK e tiklar
    And 3 saniye bekler
    Then kullanici sonucun "Hello" icerdigini dogrular
    And 3 saniye bekler
