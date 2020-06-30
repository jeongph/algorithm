import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int a, b, c, output = 0;

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		// 이게 골때린게 두번째로 큰 정수가 딱 2번째에 위치하는 정수 말하는거임
		if( a > b )
		{
			if( c >= a ) output = a;
				// 아니라면 c도 a보다 작고, b도 a보다 작아
			else if( b >= c ) output = b;
			else output = c;
		}
		else if( a == b )
		{
			output = a;
		}
		else    // b > a
		{
			if( c >= b ) output = b;
				// 아니라면 c도 b보다 작고, a도 b보다 작아
			else if( a >= c ) output = a;
			else output = c;
		}
		System.out.println( output );
	}
}
