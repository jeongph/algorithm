class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int fi, se;
        if( n > m )
        {
            fi = n;
            se = m;
        }
        else
        {
            fi = m;
            se = n;
        }

        while( se > 0 ) {
            int temp = fi;
            fi = se;
            se = temp % se;
        }

        answer[0] = fi;
        answer[1] = n*m/fi;
        return answer;
    }
}