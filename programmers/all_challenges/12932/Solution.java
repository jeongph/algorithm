import java.math.*;

class Solution
{
	public int[] solution( long n )
	{
		int[] answer;

		int arr_len = 0;
		long temp_div_n = n;
		do  // 10으로 얼마나 나뉘냐가 배열의 크기
		{
			arr_len++;
			temp_div_n /= 10;
		} while( temp_div_n / 10 >= 1 );
		if( temp_div_n > 0 ) ++arr_len;
		answer = new int[arr_len];

		for( int i = 0; i < arr_len; i++ )
		{
			int temp_sub = (int)(n % 10);
			n /= 10;
			answer[i] = temp_sub;
		}

		return answer;
	}

	public String print( int[] temp )
	{
		String out = "";
		for( int i = 0; i < temp.length; i++ )
		{
			out += Integer.toString( temp[i] ) + ", ";
		}

		return out;
	}

	/**
	 * main for unit test
	 */
	public static void main( String[] args )
	{
		Solution s = new Solution();
		//		long input = 9987654321L;
		long input = 3234567891L;

		System.out.print( s.print( s.solution( input ) ) );
	}
}