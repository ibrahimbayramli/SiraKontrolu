import javax.xml.crypto.Data;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class SiraKontrol {
    public static boolean siraKontrol(String[] kelimeler, String alfabeSirasi) {
        int len = kelimeler.length;
        boolean result = true;
        for (int i = 0; i < len - 1; i++) {
            int min = Math.min(kelimeler[i].length(), kelimeler[i + 1].length());
            if(kelimeler[i].length()>kelimeler[i+1].length()){
                if(kelimeler[i+1].equals(kelimeler[i].substring(0,kelimeler[i+1].length()))){
                    return false;
                }
            }
            if(kelimeler[i+1].length()>kelimeler[i].length()){
                if(kelimeler[i].equals(kelimeler[i+1].substring(0,kelimeler[i].length()))){
                    return true;
                }
            }

            for (int j = 0; j < min; j++) {

                if (alfabeSirasi.indexOf(kelimeler[i].toLowerCase().charAt(j)) < alfabeSirasi.indexOf(kelimeler[i + 1].toLowerCase().charAt(j))) {
                    break;
                } else if (alfabeSirasi.indexOf(kelimeler[i].toLowerCase().charAt(j)) == alfabeSirasi.indexOf(kelimeler[i + 1].toLowerCase().charAt(j))) {
                    continue;
                } else {
                    return false;
                }
            }


        }

        return true;
    }
}
