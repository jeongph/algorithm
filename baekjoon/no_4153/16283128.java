import java.util.Scanner;

public class Main
{
	public static String isRight(int a, int b, int c)
	{
		String re_str = "";

		int db_a = a * a;
		int db_b = b * b;
		int db_c = c * c;
		int max = 0;
		int else_two = 0;

		if( db_a >= db_b && db_a >= db_c)
		{
			max = db_a;
			else_two = db_b + db_c;
		}

		if( db_b >= db_a && db_b >= db_c )
		{
			max = db_b;
			else_two = db_a + db_c;
		}

		if( db_c >= db_a && db_c >= db_b )
		{
			max = db_c;
			else_two = db_a + db_b;
		}

		if( else_two == max ) re_str = "right";
		else re_str = "wrong";

		return re_str;
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		while(true)
		{
			int ausar = in.nextInt();
			int auset = in.nextInt();
			int heru = in.nextInt();

			if( ausar == 0 && auset == 0 && heru == 0 ) break;
			else System.out.println(isRight( ausar, auset, heru ));
		}
	}
}
