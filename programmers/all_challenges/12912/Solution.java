import java.util.*;
import java.util.Collections;

class Solution
{
	public long solution( int a, int b )
	{
		long answer = 0;

		if( a == b )
			answer = a;
		else if( a > b )
			answer = calcSum(b, a);
		else
			answer = calcSum(a, b);

		return answer;
	}

	public long calcSum(int a, int b )
	{
		long temp = 0;

		while( a <= b )
		{
			temp += a++;
		}

		return temp;
	}

	public static void main( String[] args )
	{
		Solution s = new Solution();
		System.out.println(s.solution( 3, 5 ));
	}
}