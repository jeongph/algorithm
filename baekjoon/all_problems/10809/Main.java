import java.util.Scanner;

public class Main
{
	static int[] findAlpa( String str )
	{
		int len = str.length();
		int char_count[] = new int[26];

		for( int i = 0; i < 26; i++ )
		{
			char_count[i] = -1;
		}

		for( int i = 0; i < len; i++ )
		{
			if( char_count[( int ) str.charAt( i ) - 97] != -1 ) continue;
			char_count[( int ) str.charAt( i ) - 97] = i;
		}

		return char_count;
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		String S = in.next();
		//		String S = "baekjoon";   // test acse

		int ret[] = findAlpa( S );
		for( int i = 0; i < ret.length; i++ )
		{
			int temp = ret[i];
			System.out.print( temp + " " );
		}

		//		 알파벳 'a'의 ascii 값이 97
		//		System.out.println((int)'a');
	}
}