import java.util.Scanner;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int N = in.nextInt();
		for( int i = 0; i < N; i++ )    // 행
		{
			for( int j = 0; j <= i; j++ )  // 열
			{
				System.out.print( "*" );
			}
			System.out.println();
		}
	}
}
