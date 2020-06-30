import java.util.Scanner;

public class Main
{
	static int STR_LEN = 3;

	static int reverseNum( int num )
	{
		int rev_num = 0;

		String str = Integer.toString( num );
		StringBuilder str_setter = new StringBuilder( str );
		char temp = str.charAt( 0 );
		str_setter.setCharAt( 0, str.charAt( 2 ) );
		str_setter.setCharAt( 2, temp );

		return Integer.parseInt( str_setter.toString() );
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int A = in.nextInt();
		int B = in.nextInt();

		if( reverseNum( A ) >= reverseNum( B ) ) System.out.println( reverseNum( A ) );
		else System.out.println( reverseNum( B ) );
	}
}