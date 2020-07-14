import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static String timeConversion(String s) {
        String out = "";
        String str[] = s.split(":");
        String apm = s.substring(8, 10);

        if (apm.equals("PM")) {
            if (Integer.parseInt(str[0]) == 12) out = "12";
            else
                out = Integer.toString(Integer.parseInt(str[0]) + Integer.parseInt("12"));
            out += s.substring(2, 8);
        } else {
            if (Integer.parseInt(str[0]) == 12) out = "00";
            else out = s.substring(0, 2);
            out += s.substring(2, 8);
        }

        return out;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
