import java.util.*;

// 시험 점수를 입력받아 90 ~ 100점은 A,
// 80 ~ 89점은 B,
// 70 ~ 79점은 C,
// 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int a = in.nextInt();
		char out = '0';

		if( a >= 90 && a <= 100 )
			out = 'A';
		else if( a >= 80 && a < 90 )
			out = 'B';
		else if( a >= 70 && a < 80 )
			out = 'C';
		else if( a >= 60 && a < 70 )
			out = 'D';
		else out = 'F';

		System.out.println( out );
	}
}