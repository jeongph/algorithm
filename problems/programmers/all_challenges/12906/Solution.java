import java.util.ArrayList;
import java.util.Arrays;

class Solution
{
	public int[] solution( int[] arr )
	{
		int[] answer;
		int len = arr.length;

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(arr[0]);

		for( int i = 1; i < len; i++ )
		{
			int temp = arr[i - 1];

			if( temp == arr[i] ) continue;
			else al.add( arr[i] );
		}

		answer = new int[al.size()];
		for( int i = 0; i < al.size(); i++ )
		{
			answer[i] = al.get( i );
		}

		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();

		int unit[] = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println( s.solution( unit ) );
	}
}