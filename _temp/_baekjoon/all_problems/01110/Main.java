import java.util.Scanner;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		boolean flag = false;

		int N = in.nextInt();
		int firstN = N;
		int cnt = 0;
		while( !flag )
		{
			cnt++;
			int _10 = N / 10;
			int _1 = N % 10;
			int temp_1 = _1 * 10;

			N = ((_10 + _1) % 10 + temp_1);
			if( N == firstN ) flag = true;
		}
		System.out.println( cnt );
	}
}
