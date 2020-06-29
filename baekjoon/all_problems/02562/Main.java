import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static String sort2ndNum( int arr[] )
	{
		int max = -1;
		int count = 0;

		for( int i = 0; i < arr.length; i++ )
		{
			if( arr[i] > max )
			{
				max = arr[i];
				count = i;
			}
		}

		return max + "\n" + (count + 1);
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		final int N = 9;

		int num[] = new int[N];
		for( int i = 0; i < N; i++ )
		{
			num[i] = in.nextInt();
		}

		System.out.println( sort2ndNum( num ) );
	}
}
