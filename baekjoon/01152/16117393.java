import java.util.Scanner;

public class Main
{
	static int wordCounter( String str )
	{
		int len = str.length();
		boolean is_word = false;   // 플래그 형식으로 수정
		int words_cnt = 0;

		if(len == 0 ) return 0;
		for( int i = 0; i < len; i++ )
		{
			// 앞에서부터 차근차근 char면 취하고 아니면 버리면서 단어로 인식
			if( str.charAt( i ) != ' ' && str.charAt( i ) != '\n' )    // 공백이 아니고 문자가 나오면
			{
				is_word = true; // 단어가 나왔다고 플래그 면경
			}
			else if( str.charAt( i ) == ' ' || str.charAt( i ) == '\n' )
			{
				if (is_word)
				{
					is_word = false;
					words_cnt++;
				}
			}
		}

		if( str.charAt( len - 1 ) != ' ' && str.charAt( len - 1 ) != '\n' ) words_cnt++;
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
//		String test_case = "The C\n"; // 정상 문장
//		String test_case = "The Curious Case of Benjamin Button\n"; // 정상 문장
//		String test_case = "  Mazatneunde Wae Teullyeoyo"; // 비정상 스페이스바 위치
//		String test_case = "Mazatneunde Wae Teullyeoyo  "; // 비정상 스페이스바 위치
//		String test_case = "  a  b  c  "; // 비정상 스페이스바 위치
//		System.out.println( wordCounter( test_case ) );
	}
}