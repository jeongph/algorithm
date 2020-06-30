import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int total = 0;
		int n = in.nextInt();

		for( int i = 0; i <= n; i++ )
		{
			total += i;
		}
		System.out.println( total );
	}
}
