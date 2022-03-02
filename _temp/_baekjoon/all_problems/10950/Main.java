import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int T, a, b;

		T = in.nextInt();
		for( int i = 0; i < T; i++ )
		{
			a = in.nextInt();
			b = in.nextInt();
			System.out.println( a + b );
		}
	}
}
