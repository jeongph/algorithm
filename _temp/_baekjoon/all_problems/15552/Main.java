import java.io.*;

public class Main
{
	public static void main( String[] args ) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter wr = new BufferedWriter( new OutputStreamWriter( System.out ) );
		int T = Integer.parseInt( br.readLine() );
		int a, b;

		for( int i = 0; i < T; i++ )
		{
			String str = br.readLine();
			a = Integer.parseInt( str.split( " " )[0] );
			b = Integer.parseInt( str.split( " " )[1] );
			wr.write( Integer.toString( a + b ) + "\n" );
		}
		wr.flush();
		wr.close();
		br.close();
	}
}
