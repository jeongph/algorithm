class Solution {
    public String solution(String s) {
        String answer = "";

        int isFirst = 0;
        for( int i = 0; i < s.length(); i++ )
        {
            char temp = s.charAt(i);
            if( temp == ' ' )
            {
                answer += Character.toString(temp);
                isFirst = 0;
                continue;
            }

            if( isFirst % 2 == 0 )
            {
                if( 'a' <= temp && temp <= 'z' ) temp -= 32;
                answer += Character.toString(temp);
            }else
            {
                if( 'A' <= temp && 'Z' >= temp ) temp += 32;
                answer += Character.toString(temp);
            }
            isFirst++;
        }

        return answer;
    }
}