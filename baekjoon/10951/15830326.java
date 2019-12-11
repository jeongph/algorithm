import java.util.Scanner;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int A, B;

		do
		{
			A = in.nextInt();
			B = in.nextInt();

			System.out.println( A + B );
		} while( in.hasNext() );
	}
}
