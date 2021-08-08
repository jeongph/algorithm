class Solution
{
	public int solution( String s )
	{
		int answer = 0;
		int len = s.length();

		boolean sign = true;
		char firstChar = s.charAt(0);
		if( !Character.isDigit( firstChar ) )
		{
			if(firstChar == '-') sign = false;
			else if(firstChar == '+') sign = true;

			answer = Integer.parseInt(s.substring( 1, len ));
		}
		else
			answer = Integer.parseInt(s);

		return sign ? answer : answer * (-1);
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();
		System.out.println(s.solution( "1234" ));
	}
}