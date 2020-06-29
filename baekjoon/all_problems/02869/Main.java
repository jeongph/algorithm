import java.io.*;
import java.util.*;

public class Main
{
	public static void main( String[] args ) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );

		int A = Integer.parseInt( st.nextToken() );
		int B = Integer.parseInt( st.nextToken() );
		int V = Integer.parseInt( st.nextToken() );
		double temp = (( double ) (V - B) / ( double ) (A - B));

		if( V == B ) System.out.println( 1 );
		else System.out.println( ( int ) Math.ceil( temp ) );
	}
}
