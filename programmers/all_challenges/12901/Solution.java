import java.util.ArrayList;
import java.util.Arrays;

class Solution
{
	public static String week[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	public static int month[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public String solution(int a, int b) {
		String answer = "";

		int c_day = 0;
		for(int i = 0; i < a; i++ )
		{
			c_day += month[i];
		}
		c_day += b;

		answer = week[(c_day % week.length)];

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
		s.solution( unit[0], unit[1]);
	}
}