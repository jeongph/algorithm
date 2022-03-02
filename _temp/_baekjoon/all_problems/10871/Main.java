import java.util.Scanner;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int N = in.nextInt();
		int X = in.nextInt();

		for( int i = 0; i < N; i++ )
		{
			int temp = in.nextInt();
			if( temp < X ) System.out.print( String.format( "%d ", temp ) );
		}
	}
}
