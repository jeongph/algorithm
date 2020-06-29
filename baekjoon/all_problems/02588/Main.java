import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		String a = null, b = null;
		int aint, bint, a1, a10, a100;

		b = in.nextLine();
		a = in.nextLine();

		aint = Integer.parseInt( a );
		bint = Integer.parseInt( b );

		a1 = aint % 10;
		a10 = (aint % 100 - a1) / 10;
		a100 = aint / 100;

		System.out.println( bint * a1 );
		System.out.println( bint * a10 );
		System.out.println( bint * a100 );
		System.out.println( bint * aint );
	}
}
