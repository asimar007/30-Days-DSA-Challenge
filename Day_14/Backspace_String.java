import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Backspace_String {
    public static boolean Backspace(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // for S
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (sb1.length() > 0) {
                    sb1.deleteCharAt(sb1.length() - 1);
                }
            } else {
                sb1.append(s.charAt(i));
            }
        }
        // for T
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
            } else {
                sb2.append(t.charAt(i));
            }
        }

        s = sb1.toString();
        t = sb2.toString(); 

        System.out.println(s);
        System.out.println(t);

        // Check
        return s.equals(t);
    }

    public static void main(String[] args) {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        boolean ans = Backspace(s, t);
        System.out.println(ans);
    }
}
