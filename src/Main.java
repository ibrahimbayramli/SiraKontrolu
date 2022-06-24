import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //*? Kelime dizisinin girisi.
        String[] kelimeler = {"ahmet", "ali", "ayşe","mehmet"};

        //*? Alfabe siralamasi.
//        String alfabeSirasi = "defgauğıvijçklümnocöprsyhbştz";
        String alfabeSirasi = "abcçdefgğhıijklmnoöprsştuüvyz";

        if(SiraKontrol.siraKontrol(kelimeler, alfabeSirasi)){
            System.out.println("Girdiginiz kelimeler siralidir.");
        }else{
            System.out.println("Girdiginiz kelimeler sirali degildir.");
        }

        
    }

}