import java.util.Scanner;

public class Main
{
	static int calc_point( String arr )
	{
		int total = 0;
		int point = 0;

		for( int i = 0; i < arr.length(); i++ )
		{
			char tempChar = arr.charAt(i);

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

		return total;
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int N = in.nextInt();
		for(int i = 0; i < N; i++ )
		{
			System.out.println( calc_point( in.next() ) );
		}
	}
}
