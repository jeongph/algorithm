import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		final int min = 60;
		final int rule = 45;

		int h, m;
		h = in.nextInt();
		m = in.nextInt();

		if( m >= rule ) m -= rule;
		else
		{
			m += (min - rule);
			if( h > 0 ) h--;
			else h = 23;
		}
		System.out.println( h + " " + m );
	}
}
