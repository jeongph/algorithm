import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int N;

		N = in.nextInt();

		for( int i = 1; i <= 9; i++ )
		{
			System.out.println( String.format( "%d * %d = %d", N, i, N * i ) );
		}
	}
}
