import java.util.Scanner;

public class Main
{
	static int[] calcOCount( String arr[] )
	{
		int len = arr.length;
		int return_arr[] = new int[len];

		for( int i = 0; i < len; i++ )
		{
			int total = 0;
			int point = 0;
			int temp_len = arr[i].length();
			for( int j = 0; j < temp_len; j++ )
			{
				char tempChar = arr[i].charAt( j );

				if( tempChar == 'O' )
				{
					point++;
					total += point;
				}
				else if( tempChar == 'X' )
				{
					point = 0;
				}
			}
			return_arr[i] = total;
		}

		return return_arr;
	}

	static void printOCount( int arr[] )
	{
		for( int i = 0; i < arr.length; i++ )
		{
			System.out.println( arr[i] );
		}
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int N = in.nextInt();
		String temp_in[] = new String[N];
		for( int i = 0; i < N; i++ ) // input String 값을 나중에 어디다가 쓴다고 가정하면 사실 배열에 넣긴 해야함(refactoring)
		{
			temp_in[i] = in.next();
		}
		printOCount( calcOCount( temp_in ) );
	}
}
