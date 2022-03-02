import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main( String[] args ) throws IOException
	{
		Scanner in = new Scanner(System.in);

		int input[] = new int[2];
		int ans = 0;

		for(int i = 0; i < 2; i++)
		{
			input[i] = in.nextInt();
		}

		if( input[0] > 0 )
			ans = input[1] > 0 ? 1 : 4;
		else
			ans = input[1] > 0 ? 2 : 3;

		System.out.println(ans);
	}
}
