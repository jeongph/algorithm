import java.util.Arrays;

class Solution
{
	public String solution( String[] participant, String[] completion )
	{
		String answer = "";

		Arrays.sort( participant );
		Arrays.sort( completion );

		for( int i = 0; i < participant.length; i++ )
		{
			if( i == (participant.length - 1) || !participant[i].equalsIgnoreCase( completion[i] ))
			{
				answer = participant[i];
				break;
			}
		}

		return answer;
	}

	/* main for unit test */
	public static void main( String[] args )
	{
		Solution s = new Solution();

		String arr1[] = { "mislav", "stanko", "mislav", "ana" };
		String arr2[] = { "stanko", "ana", "mislav" };

		s.solution( arr1, arr2 );
	}
}