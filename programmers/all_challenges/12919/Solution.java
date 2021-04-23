
class Solution
{
	static final String KIM = "kim";
	public String solution( String[] seoul )
	{
		String answer = "";

		for(int i = 0; i < seoul.length; i++ )
		{
			if( seoul[i].equalsIgnoreCase( KIM ) )
				answer = String.format( "김서방은 %d에 있다", i );
			else continue;
		}

		return answer;
	}

	public static void main( String[] args ) // Test code here
	{
		Solution s = new Solution();

		String unit_str[] = {"TEST", "test", "KIM"};

		s.solution( unit_str );
	}
}