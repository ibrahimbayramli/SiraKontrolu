import javax.xml.crypto.Data;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class SiraKontrol {
    public static boolean siraKontrol(String[] kelimeler, String alfabeSirasi) {
        int len = kelimeler.length;
        boolean result = true;
        for (int i = 0; i < len - 1; i++) {
            int min = Math.min(kelimeler[i].length(), kelimeler[i + 1].length());


            for (int j = 0; j < min; j++) {

                if (alfabeSirasi.indexOf(kelimeler[i].charAt(j)) < alfabeSirasi.indexOf(kelimeler[i + 1].charAt(j))) {
                    break;
                } else if (alfabeSirasi.indexOf(kelimeler[i].charAt(j)) == alfabeSirasi.indexOf(kelimeler[i + 1].charAt(j))) {
                    continue;
                } else {
                    return false;
                }
            }


        }

        return true;
    }
}
