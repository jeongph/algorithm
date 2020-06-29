import java.util.Scanner;

public class Main
{
	static String cycleStr( int to_cycle, String str )
	{
		int len = str.length();
		//		int to_cycle = Integer.parseInt( cycle );

		String temp = "";
		for( int i = 0; i < len; i++ )
		{
			for( int j = 0; j < to_cycle; j++ )
			{
				temp += str.charAt( i );
			}
		}

		return temp;
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int num = in.nextInt();
		for( int i = 0; i < num; i++ )
		{
			System.out.println( cycleStr( in.nextInt(), in.next() ) );
		}
	}
}