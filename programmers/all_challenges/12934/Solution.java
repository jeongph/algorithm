class Solution {
    public long solution(long n) {
        final long MAX = 50000000000000L;
        long answer = -1;

        double sqrt = Math.sqrt(n);
        System.out.println(sqrt);
        if( sqrt <= MAX && sqrt >= 1 && (sqrt - (long)sqrt) == 0)
        {
            long i = (long)sqrt;
            answer = (i+1) * (i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3));
    }
}

//600851475143
//50000000000000