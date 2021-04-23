import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = new String[len];

        for(int i = 0; i < len; i++ )
        {
            String temp = strings[i].charAt(n) + strings[i];
            strings[i] = temp;
        }
        Arrays.sort(strings);

        for(int i = 0; i < len; i++ )
        {
            answer[i] = strings[i].substring(1, strings[i].length());
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Solution s = new Solution();

        String unit[] =  {"abce", "abcd", "cdx"};
        int unit_n = 2;
//        String unit[] = {"sun", "bed", "car"};
//        int unit_n = 1;

        System.out.println(s.solution(unit, unit_n).toString());
    }
}