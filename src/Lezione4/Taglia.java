package Lezione4;

import java.io.IOException;
import java.util.Objects;
import static java.lang.System.out;

/**
 * Created by Mario on 06/03/2017.
 */
public class Taglia {

    public static void main(String[] args) throws IOException {
        String pdf = "Incolla qui dentro il testo del pdf del cencia";
        toglinum(pdf);
    }

    public static boolean contiene(char a, String b){
        char[] c = b.toCharArray();
        for (int i = 0; i < b.length(); i++){
            if (Objects.equals(a, c[i]))
                return true;
            }
        return false;
    }

    public static String taglia(String a) {
        int j = 0;
        for (int i = 0; i< a.length(); i++){
            if (cominciaconnum(a.substring(i)))
                j++;
            }
        String result = new String(a.substring(j));
        return result;
    }

    public static boolean cominciaconnum(String a){
        char[] numeri = "1234567890".toCharArray();
        boolean result = false;
        for (int i = 0; i< numeri.length; i++){
            char[] s = new char[1];
            s[0] = numeri[i];
            String ss = new String(s);
            if (a.startsWith(ss))
                return true;
        }
        return false;
    }

    public static void toglinum(String a){
        String[] righe = a.split("\n");
        String[] newrighe = new String[righe.length];
        for (int i = 0; i < righe.length; i++)
            newrighe[i] = taglia(righe[i]);
        for (int i = 0; i < newrighe.length; i++)
            out.println(newrighe[i]);
    }

    }
