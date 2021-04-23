import java.util.*;
import java.util.Collections;

class Solution
{
	public int[] solution( int[] arr, int divisor )
	{
		ArrayList<Integer> answer = new ArrayList<Integer>();

		for( int i = 0; i < arr.length; i++ )
		{
			if( arr[i] % divisor == 0 ) answer.add( arr[i] );
		}

		if( answer.isEmpty() ) answer.add( -1 );
		Collections.sort( answer );

		int temp[] = new int[answer.size()];
		for( int i = 0; i < answer.size(); i++ )
		{
			temp[i] = answer.get( i );
		}

		return temp;
	}
}

public class SolutionTest
{
	public static void main( String[] args )
	{
		Solution s = new Solution();
	}
}