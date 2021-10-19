import java.util.*;

class Solution
{
	public String solution( String s )
	{
		String answer = "";
		int len = s.length();

		char temp_arr_ch[] = new char[len];

		for( int i = 0; i < len; i++ )
		{
			temp_arr_ch[i] = s.charAt(i);
		}

		for(int i = 0; i < len; i++)
		{
			for(int j = 0; j < len; j++)
			{
				if( (int)temp_arr_ch[i] > (int)temp_arr_ch[j] )
				{
					char temp = temp_arr_ch[i];
					temp_arr_ch[i] = temp_arr_ch[j];
					temp_arr_ch[j] = temp;
				}
			}
		}

		answer = arrToString(temp_arr_ch);
		return answer;
	}

	public String arrToString( char arr[] )
	{
		String temp = "";
		for(int i = 0; i < arr.length; i++ )
		{
			temp += arr[i];
		}

		return temp;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		// s = [ 1, 3, 5, 2, 9, 8, 7, 0 4 ]...
	}
}