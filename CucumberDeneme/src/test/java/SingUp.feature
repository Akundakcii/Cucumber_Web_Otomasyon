Feature: Be SingUp

  Scenario Outline: new Normal User for SingUp


    Given SingUp Armoyu
    And write Ad "<ad>"
    And write Soyad "<soyad>"
    And write kullanici adi "<kadi>"
    And select DGun
    And select DAy
    And select DYil
    And write parola "<parola>"
    And write confirm "<confirm>"
    And write eposta "<eposta>"
    And select il
    And select Gender Man
    When click KayitOl
    Then Pop get Popup Message
    Examples:
      | ad    | soyad     | kadi         | parola  | confirm | eposta                        |  |
      | test1 | kundakci  | testkundakci | asdfdsa | asdfdsa | ahmetkgunfdakci@gmaidl.com    |  |
      | test2 | kundakc2  | testkundakc2 | 1234561 | 1234561 | ahmetkuffdndakci11@gmsail.com |  |
      | a     | kundakcs2 | testkundakci | 123456  | 123456  | ahmetkfundaksci@sgmail.com    |  |


