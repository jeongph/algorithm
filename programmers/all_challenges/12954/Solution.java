class Solution
{
	public long[] solution( int x, int n )
	{
		long[] answer = new long[n];

		long added = x;
		int adder = x;
		for( int i = 0; i < n; i++ )
		{
			answer[i] = added;
			added += adder;
		}

		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();
		for( int i = 0; i < 5; i++ )
			System.out.println( s.solution( 2, 5 )[i] );
	}
}