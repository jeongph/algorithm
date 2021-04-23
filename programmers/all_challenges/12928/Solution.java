import java.util.ArrayList;

class Solution
{
	public int solution( int n )
	{
		int answer = 0;

		for(int i = 1; i <= n; i++ )
		{
			if( n % i == 0 ) answer += i;
		}
		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();

	}
}