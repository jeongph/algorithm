import java.util.Scanner;

public class Main
{
	static String calcMinMax( int arr[] )
	{
		int max = -1000001, min = 1000001;

		for( int i = 0; i < arr.length; i++ )
		{
			if( arr[i] > max ) max = arr[i];
			if( arr[i] < min ) min = arr[i];
		}

		return min + " " + max;
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int N = in.nextInt();
		int num[] = new int[N];
		for( int i = 0; i < N; i++ )
		{
			num[i] = in.nextInt();
		}

		System.out.println( calcMinMax( num ) );
	}
}
