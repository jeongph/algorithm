import java.util.ArrayList;

class Solution
{
	public int solution( String s )
	{
		int len = s.length();
		int answer = len;

		int splitter = 1;
		while( splitter < len )
		{
			ArrayList<String> al = new ArrayList<String>();
			String ans_str = "";

			for( int i = 0; i < len; i += splitter )
			{
				String temp;
				if( i + splitter > len ) temp = s.substring( i, len );
				else temp = s.substring( i, i + splitter );
				al.add( temp ); // add subStrings
			}

			int same_counter = 0;
			int splitter_size = al.size() - 1;
			boolean isSame = false;
			for( int i = 0 + 1; i <= splitter_size; i++ )
			{
				String pre_temp = al.get( i - 1 );
				String temp = al.get( i );

				if( pre_temp.equals( temp ) )
				{
					++same_counter;
					isSame = true;
				}
				else if( !pre_temp.equals( temp ) )
				{
					ans_str += same_counter != 0 ? "" + (same_counter + 1) + pre_temp : "" + pre_temp;
					isSame = false;
					same_counter = 0;
				}

				if( i == splitter_size )
				{
					ans_str += isSame ? "" + (same_counter + 1) + pre_temp : "" + temp;
				}
			}

			int new_len = ans_str.length();
			if( new_len < answer ) answer = new_len;

			splitter++;
		}

		return answer;
	}

	public String s( String s )
	{
		int len = s.length();
		String answer = s;

		int splitter = 1;
		while( splitter < len )
		{
			ArrayList<String> al = new ArrayList<String>();
			String ans_str = "";

			for( int i = 0; i < len; i += splitter )
			{
				String temp;
				if( i + splitter > len ) temp = s.substring( i, len );
				else temp = s.substring( i, i + splitter );
				al.add( temp ); // add subStrings
			}

			int same_counter = 0;
			int splitter_size = al.size() - 1;
			boolean isSame = false;
			for( int i = 0 + 1; i <= splitter_size; i++ )
			{
				String pre_temp = al.get( i - 1 );
				String temp = al.get( i );

				if( pre_temp.equals( temp ) )
				{
					++same_counter;
					isSame = true;
				}
				else if( !pre_temp.equals( temp ) )
				{
					ans_str += same_counter != 0 ? "" + (same_counter + 1) + pre_temp : "" + pre_temp;
					isSame = false;
					same_counter = 0;
				}

				if( i == splitter_size )
				{
					ans_str += isSame ? "" + (same_counter + 1) + pre_temp : "" + temp;
				}
			}

			int new_len = ans_str.length();
			if( new_len < answer.length() ) answer = ans_str;

			splitter++;
		}

		return answer;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();

		String unit[] = {
				"aaa",
				"aab",
				"abbb",
				"aabbb",
				"aaaabbcc",
				"ab",
				"aba",
				"abac",
		};

		for( int i = 0; i < unit.length; i++ )
		{
			System.out.println( unit[i] + " -> " + s.s( unit[i] ) );
		}
	}
}