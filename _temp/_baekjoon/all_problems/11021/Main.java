import java.util.Scanner;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int T = in.nextInt();
		for( int i = 0; i < T; )
		{
			int A = in.nextInt();
			int B = in.nextInt();

			System.out.println( String.format( "Case #%d: %d", ++i, (A + B) ) );
		}
	}
}
