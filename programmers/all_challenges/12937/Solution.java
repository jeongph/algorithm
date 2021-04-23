class Solution
{
	public String solution(int num) {
		String str[] = {"Even", "Odd"};
		String answer = str[Math.abs(num % 2)];

		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();

		for(int i = -2147483647; i < 2147483647; i++ )
		{
			s.solution( i );
		}
	}
}