import java.util.Scanner;

public class Main
{
	static double calc_avg( int arr[] )
	{
		int len = arr.length;

		int sum = 0;
		double avg = 0;
		for( int i = 0; i < len; i++ )
		{
			sum += arr[i];
		}

		avg = sum / len;
		return avg;
	}

	static String print_winner_pst( int arr[], double avg )
	{
		int len = arr.length;
		double cnt = 0;
		double pst = 0;

		for( int i = 0; i < len; i++ )
		{
			if( arr[i] > avg ) cnt++;
		}

		pst = ( double ) (cnt / len) * 100;
		return String.format( "%.3f%%", pst );
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int temp[];

		int C = in.nextInt(); // mean test case
		for( int i = 0; i < C; i++ )
		{
			int N = in.nextInt(); // mean student count
			temp = new int[N];
			for( int j = 0; j < N; j++ )
			{
				temp[j] = in.nextInt();
			}

			System.out.println( print_winner_pst( temp, calc_avg( temp ) ) );
		}
	}
}
