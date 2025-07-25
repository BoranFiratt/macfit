Feature: MACFit Üyelik Kaydı

  Scenario: Üyenin Ücretsiz bir günlük üyelik kazanması
    Given Kullanıcı MACFit kayıt sayfasına gider
    When Kullanıcı kayıt formuna geçerli bilgileri girer
    And Kullanıcı kaydı tamamlar
    Then Kullanıcı başarılı şekilde ücretsiz deneme kazanır