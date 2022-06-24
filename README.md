## Girdileri anlatalım:

- İlk girdi: Kelimeler dizisi. Örnek: ["ahmet", "ayşe", "mehmet"]

- İkinci girdi: Alfabe sırası Örnek: "defgauğıvijçklümnocöprsyhbştz"



Çıktı da belirttiğim üzere, iletilen kelimeler sıralı mı değil mi diye söylemek. Mesela yukarıdaki kelimelere bakarsak h harfi y harfinden alfabetik olarak sonra geldiği için "ahmet" alfabetik olarak "ayşe"den sonra gelir, o sebeple iletilen kelimeler "iletilen alfabetik sıraya göre"  sıralı değildir.

Method için öneri imza:  boolean siraKontrol(String[] kelimeler, String alfabeSirasi)


## Koşulllar/Kabuller:

- İletilen alfabe sırasında tüm Türkçe karakterler yer alır.  
 <br>
- İletilen alfabe sırasında bir harf ikiden fazla yer almaz.
 <br>
- İletilen alfabe sırasında tüm harfler küçüktür.
 <br>
- İletilen alfabe sırasında harf dışında (boşluk, noktalama işareti vs.) bir karakter yer almaz.
 <br>
- İletilen kelimeler için harf dışında (boşluk, noktalama işareti vs.) bir karakter yer almaz.
 <br>
- İletilen kelimeler içinde büyük yada küçük harf yer alabilir, sıralamada harflerin büyük yada küçük olması önem teşkil etmez.
 <br>
- İletilen kelimeler içinde en az 2 kelime vardır.