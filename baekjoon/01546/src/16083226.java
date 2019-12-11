import java.util.Scanner;

public class Main
{
	static int findMax( int arr[] )
	{
		int M = 0;
		int len = arr.length;

		for( int i = 0; i < len; i++ )
		{
			if( arr[i] >= M ) M = arr[i];
		}

		return M;
	}

	static double newRem( int arr[], int M )
	{
		int len = arr.length;
		double new_rem = 0.0;
		double sum = 0.0;

		double new_arr[] = new double[len];
		for( int i = 0; i < len; i++ )
		{
			new_arr[i] = ( double ) (( double ) arr[i] / ( double ) M * 100);
			sum += new_arr[i];
		}

		new_rem = sum / len;
		return new_rem;
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int N = 0;

		N = in.nextInt();
		int temp[] = new int[N];
		for( int i = 0; i < N; i++ )
		{
			temp[i] = in.nextInt();
		}

		System.out.println( newRem( temp, findMax( temp ) ) );
	}
}