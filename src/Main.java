public class Main {
    public static void main(String[] args) {
        //*? Kelime dizisinin girisi.
        String[] kelimeler = {"ahmet", "ayşe", "mehmet"};

        //*? Alfabe siralamasi.
        String alfabeSirasi = "defgauğıvijçklümnocöprsyhbştz";
        
        System.out.println(SiraKontrol.siraKontrol(kelimeler, alfabeSirasi));
    }

}