Feature: Amazon task

  @task1
  Scenario:
    Then  "https://www.amazon.com" sitesine gider ve anasayfanın açıldığı onaylanır,
    Then  Login ekranı açılır ve bir kullanıcı ile login olunur.(Var olan bir kullanıcı ile giriş yapılabilir.)
    Then  Ekranın üstündeki Search alanına "samsung" yazılır Ara butonuna tıklanır,
    Then  Gelen sayfada Samsung Galaxy A52 5G(Eğer ürün listenmezse başka bir samsung telefon seçilebilir.) ürünün var olduğu kontrol edilir ve fiyatı loglanır,
    Then  Ürünün içine gidilip Add to List(Eğer kullanıcı önceden liste oluşturmadıysa gelen popuptan Create List butonu tıklanır.) butonu tıklanır,
    Then  Shopping list açılır ve ürünün eklendiği kontrol edilir,
    Then  Delete butonu tıklanır,
    Then  Ürünün listede olmadığı kontrol edilir.
