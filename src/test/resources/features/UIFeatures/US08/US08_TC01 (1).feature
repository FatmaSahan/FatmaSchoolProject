@us08tc01
Feature: tum_alanlarin_dogru_girilmesi

  Scenario:tum_alanlarin_dogru_girilmesi
  Given kullanici Login butonuna tiklar
  Then kullanici User Name alanina "George" bir deger girer
  And kullanici Password alanina "Washington" bir deger girer
  And kullanici Login2 butonuna tiklar
  And kullanici Lessons butonuna tiklar
  And kullanici Lesson Management alanini gorur
  And kullanici Lesson Name alanina valid bir deger girer
  And kullanici Compulsory kutusunu isaretler
  And kullanici Credit Score alanina "4" bir deger girer
  And kullanici Submit butonuna tiklar
  And kullanici Lesson Created mesajini goruntuler