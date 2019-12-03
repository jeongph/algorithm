import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		Map<Character, Integer> map = new HashMap<>();

		String in_str = in.next();
		in_str = in_str.toLowerCase();
		for( int i = 0; i < in_str.length(); i++ )
		{
			char temp_ch = in_str.charAt( i );
			if( map.containsKey( temp_ch ) ) map.put( temp_ch, (map.get( temp_ch ) + 1) );
			else map.put( temp_ch, 1 );
		}

		int max = 0;
		int isOver = 0;
		char save_key = ' ';
		for(char key: map.keySet())
		{
			if( map.get(key) >= max )
			{
				save_key = key;
				isOver = max;
				max = map.get(key);

			}
		}

		if( max == isOver ) System.out.println( '?' );
		else System.out.println(Character.toUpperCase( save_key ));
	}
}
