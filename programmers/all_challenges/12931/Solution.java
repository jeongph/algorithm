import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        do {
            answer += n%10;
            n /= 10;
        } while( n >= 1 );

        return answer;
    }
}