import java.util.ArrayList;

class Solution
{
	public int solution( int n )
	{
		int answer = 0;

		for(int i = 2; i <= n; i++ )
		{
			boolean isPrime = true;

			for(int j = 2; j <= Math.sqrt(i); j++ )
			{
				if( i % j == 0 )
				{
					isPrime = false;
					break;
				}
			}

			if( isPrime ) ++answer;
		}
		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();
		s.solution( 10 );
	}
}