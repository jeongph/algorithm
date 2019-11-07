import java.util.Scanner;

public class Main
{
	static final int LEN = 10;

	static void calc_count( int num[] )
	{
		int total = num[0] * num[1] * num[2];
		int numbers[] = new int[LEN];

		String totalToStr = Integer.toString( total );
		for( int i = 0; i < totalToStr.length(); i++ )
		{
			numbers[totalToStr.charAt( i ) - '0']++;
		}

		print_ans( numbers );
	}

	static void print_ans( int arr[] )
	{
		int len = arr.length;

		for( int i = 0; i < len; i++ )
		{
			System.out.println( arr[i] );
		}
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int in_count = 3;
		int temp[] = new int[in_count];

		for( int i = 0; i < in_count; i++ )
		{
			temp[i] = in.nextInt();
		}

		calc_count( temp );
	}
}
