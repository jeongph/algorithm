import java.util.*;

class Solution {
    public long solution(long n) { // 118372 -> 873211
        long answer = 0;
        int counter = 0;
        ArrayList<Long> al = new ArrayList<Long>();

        while (n >= 1) {
            al.add(n % 10);
            ++counter;
            n /= 10;
        }

        Collections.sort(al);
/*        for(long temp: al)
            System.out.println(temp);*/

        for (int i = 0; i < al.size(); i++) {
            answer += (long) al.get(i) * Math.pow(10, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(118372));
    }
}