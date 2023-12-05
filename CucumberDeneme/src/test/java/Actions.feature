Feature: Site içerisnde Gir ve Tüm Etkinlikleri Yap

  Scenario: Kayıt Olustur.

    Given Arm oyu Siteye Git
    And üye Girisi yap
    And Sol usteki armaya tikla
    And Kapak resmi Ekle
    And Profil Foto Değiştir


  Scenario: AyarlarSol

    Given Ayarlara Tikla
    And Ayarladaki Tüm Sosyol Medya Yaz
    When Güncelle Bastınğında
    Then Assertions Kontrol

  Scenario: Ayarlar SagPlace
    Given Meslek Sec
    And Mail Girme
    And Telefon Gir
    And Dogum Yil Gir
    And ulkeSec
    When Güncelle Tik
    Then Assertions Kontrol
    And Cikis Yap

  Scenario: Çekilis Yap
    Given Çekilis Sayfasına Git
    And Cekilis yap Tikla
    And Cekilis Bilgilerini Gir
    And Alert Mesajı Degismesi Lazım Tıklanmıyor

  Scenario:Form
    Given Form Sayfasına Git
    And Yeni Konu Ac
    And Formu bilgisini gir
    When Olustur Tik
    Then Form Assertion

  Scenario: MagzaUrunler
    Given Magzaya Git
    And Urun Ekle
    And Urun Bilgileri
    When Olustur
    Then UrunEkleme Assert

  Scenario: Proje
    Given Proje Git
    And Proje Ekle
    And Proje Bilgileri
    When Kaydet
    Then Proje Assert

  Scenario: Gonderi Yayınla
    Given Armaya Tikla
    And Gönderi Yaz
    When Gönderiyi Paylas
    Then Gonderiyi Assert Et




