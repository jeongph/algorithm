import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        int cnt = 1;

        while( in.hasNextLine() )
        {
            String str = in.nextLine();
            System.out.println( cnt +" "+ str );
            cnt++;
        }
    }
}

