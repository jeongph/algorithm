import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static final int DIV = 42;

	static int[] calc_rems( int arr[] )
	{
		int len = arr.length;

		int arr_rems[] = new int[len];
		for( int i = 0; i < len; i++ )
		{
			arr_rems[i] = arr[i] % DIV;
		}

		return arr_rems;
	}

	static int diff_arr( int arr[] )
	{
		int count = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();

		for( int i = 0; i < arr.length; i++ )
		{
			if( !al.contains( arr[i] ) )
				al.add( arr[i] );
		}

		return al.size();
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int arr_temps[] = new int[10];
		for( int i = 0; i < 10; i++ )
		{
			arr_temps[i] = in.nextInt();
		}

		System.out.println( diff_arr( calc_rems( arr_temps ) ) );
	}
}
