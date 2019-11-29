import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
	public static int moveTop( int a, int b, int v )
	{
		int move_point = 0;
		int count = 0;

		while(true)
		{
			++count;
			if((move_point += a) >= v) break;
			else move_point -= b;
		}

		return count;
	}

	public static void main( String[] args ) throws IOException
	{
//		Scanner in = new Scanner( System.in );
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );

		System.out.println( moveTop( Integer.parseInt( st.nextToken() ), Integer.parseInt( st.nextToken() ), Integer.parseInt( st.nextToken() ) ) );
	}
}
