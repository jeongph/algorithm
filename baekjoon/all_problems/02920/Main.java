import java.util.Scanner;

public class Main
{
	static String method( int arr[], int N )
	{
		final String[] ans = { "ERR", "ascending", "descending", "mixed" };

		int reverse_n = N;
		int cnt_ans = 0;
		if( arr[0] == 1 ) cnt_ans = 1;
		else if( arr[0] == 8 ) cnt_ans = 2;

		for( int i = 0; i < N; i++ )
		{
			if( (arr[i] == (i + 1)) && (cnt_ans == 1) ) cnt_ans = 1;
			else if( (arr[i] == reverse_n--) && (cnt_ans == 2) ) cnt_ans = 2;
			else cnt_ans = 3;
		}

		return ans[cnt_ans];
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		final int N = 8;

		int[] temp = new int[N];
		boolean flag = false;
		for( int i = 0; i < N; i++ )
		{
			temp[i] = in.nextInt();
		}

		System.out.println( method( temp, N ) );
	}
}
