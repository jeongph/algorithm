import java.util.Arrays;

class Solution
{
	public String solution( String s )
	{
		String answer = "";
		int len = s.length();

		int reader = 0;
		boolean isEven = true;
		for( int i = 0; i < len; i++ )
		{
			if( s.charAt( i ) == ' ' )
			{
				reader = 0;
				answer += ' ';
				continue;
			}

			if( reader % 2 == 0 ) isEven = true;
			else isEven = false;

			answer += isEven ? Character.toUpperCase( s.charAt( i ) ) : Character.toLowerCase( s.charAt( i ) );
			reader++;
		}

		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();
		System.out.println( s.solution( "try hello world" ) );
	}
}