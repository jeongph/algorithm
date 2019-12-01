import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] arrCutNCopy(int[] in_arr, int p_start, int p_end)
    {
        int len = (p_end - p_start)+1;
        ArrayList<Integer> temp_al = new ArrayList<>();

        for(int i = p_start-1; i < p_end; i++ )
        {
            temp_al.add(in_arr[i]);
        }
        Collections.sort(temp_al);

        int[] out_arr = new int[len];
        for(int i = 0; i < len; i++ )
        {
            out_arr[i] = temp_al.get(i);
        }

        return out_arr;
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int p_commands_row = 0; p_commands_row < commands.length; p_commands_row++ )
        {
            int i = commands[p_commands_row][0];
            int j = commands[p_commands_row][1];
            int k = commands[p_commands_row][2];

            int[] temp = arrCutNCopy(array, i, j);
            answer[p_commands_row] = temp[k-1];
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Solution s= new Solution();
        int testcase[] = {1, 5, 2, 6, 3, 7, 4};
        int testijk[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int out[] = s.solution(testcase, testijk);
        for(int i = 0; i < out.length; i++ )
        {
           System.out.print(out[i]);
        }
    }
}
