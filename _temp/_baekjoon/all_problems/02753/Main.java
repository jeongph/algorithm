import java.util.*;

class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int a = in.nextInt();
		boolean flag = false;

		if( a % 4 == 0 )
		{
			flag = true;
			if( a % 100 == 0 )
			{
				flag = false;
				if( a % 400 == 0 ) flag = true;
			}
		}
		else flag = false;

		if( flag ) System.out.println( "1" );
		else System.out.println( "0" );
	}
}