import java.util.Scanner;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int N = in.nextInt();
		for( int i = N; i > 0; i-- )    // 행
		{
			for( int j = 1; j <= N; j++ )  // 열
			{
				System.out.print( (j < i) ? " " : "*" );
			}
			System.out.println();
		}
	}
}
