import java.util.Scanner;

public class Main
{
	static int wordCounter( String str )
	{
		int len = str.length();
		int words_cnt = 0;

		if( len == 0 ) return 0;
		for( int i = 0; i < len; i++ )
		{
			if( str.charAt( i ) == ' ' )
			{
				if( i == 0 ) continue;
				else if( i == len - 1 ) continue;

				if( str.charAt( i - 1 ) != ' ' ) words_cnt++;
			}
		}

		if( words_cnt > 0 || str.charAt(len-1) != ' ') words_cnt++;
		return words_cnt;
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		String inner_str = in.nextLine();
		System.out.println( wordCounter(inner_str) );

//		String test_case = "    "; // 공백만 있는경우
//		String test_case = "   a"; // 맨 마지막에 한 단어가 들어간 경우
//		String test_case = "aa"; // 한 문자만 들어간 경우
//		String test_case = "The Curious Case of Benjamin Button\n"; // 정상 문장
//		String test_case = " Mazatneunde Wae Teullyeoyo"; // 비정상 스페이스바 위치
//		System.out.println( wordCounter( test_case ) );
	}
}