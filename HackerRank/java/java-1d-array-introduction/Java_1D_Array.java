import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++ )
        {
            int temp = scan.nextInt();
            a[i] = temp;
        }
/*
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(n);

        if( temp.size() == temp.get(0) )
        {
            a = new int[temp.get(0)];
            for(int i = 0; i < temp.size(); i++ )
            {
                if( i == 0 ) continue;
                a[i] = temp.get(i);
            }
        }
*/
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}