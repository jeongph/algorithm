import java.util.ArrayList;
import java.util.Arrays;

class Solution
{
	public boolean solution(String s) {
		boolean answer = true;
		int len = s.length();

		if( !(len == 4 || len == 6) ) return false;

		for(int i = 0 ; i < s.length(); i++ )
		{
			if( s.charAt(i) >= '0' && s.charAt(i) <= '9' ) answer = true;
			else
			{
				return false;
			}
		}

		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();

//		int unit[] = { 1, 1, 3, 3, 0, 1, 1 };
		int unit[] = {5, 24};
//		s.solution( unit[0], unit[1]);
	}
}