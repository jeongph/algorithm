import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
	public boolean solution(int x) {
		int origin_x = x;
		boolean answer = true;

		int temp = 0;
		while( x / 10 != 0 || x % 10 != 0 )
		{
			temp += x % 10;

			x /= 10;
		}

		answer = (origin_x % temp == 0)? true:false;
		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();
		s.solution(10);
	}
}