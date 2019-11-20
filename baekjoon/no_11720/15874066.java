import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String str = in.next();
        int sum = 0;

        for( int i = 0; i < N; i++ )
        {
            sum += (int)(str.charAt(i) - '0');
//            System.out.println(str.charAt(i));
        }

        System.out.println(sum);
    }
}