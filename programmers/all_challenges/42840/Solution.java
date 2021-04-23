import java.util.ArrayList;
import java.util.Collections;

class Solution
{
	public int[] solution( int[] answers )
	{
		int[] answer = { 0, 0, 0 };
		int ans[][] = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		int pointer[] = { 0, 0, 0 };

		int c_answers = answers.length;
		int c_ans = pointer.length; // 수포자 3명
		for( int i = 0; i < c_answers; i++ ) // 일단 모든 문제를 돌아
		{
			for( int k = 0; k < c_ans; k++ ) // 각각의 문제를 수포자 배열 3개와 비교해야함
			{
				if( answers[i] == ans[k][pointer[k]] ) answer[k]++;
				pointer[k] = movePointer( pointer[k], ans[k].length );
			}
		}

		return calcRank( answer );
	}

	public int movePointer( int point, int max )
	{
		int re_point = point;
		if( re_point + 1 >= max ) return 0;
		else return re_point + 1;
	}

	public int[] calcRank( int arr[] )
	{
		int len = arr.length;
		int max = 0;
		ArrayList<Integer> re_arr = new ArrayList<>();

		for( int i = 0; i < len; i++ )
		{
			if( arr[i] > max )
			{
				re_arr.clear();
				max = arr[i];
				re_arr.add( i );
			}
			else if( arr[i] == max ) re_arr.add( i );
		}

		Collections.sort( re_arr );
		int temp[] = new int[re_arr.size()];
		for( int i = 0; i < re_arr.size(); i++ )
		{
			temp[i] = re_arr.get( i ) + 1;
		}

		return temp;
	}

	public static void main( String[] args ) // Test code here
	{
		Solution s = new Solution();

//		int arr[] = { 1, 2, 3, 4, 5 };
		int arr[] = { 1, 3, 2, 4, 2, 1, 3, 2, 4, 2 };
		for( int i = 0; i < s.solution( arr ).length; i++ )
		{
			System.out.print( s.solution( arr )[i] + ", " );
		}
	}
}