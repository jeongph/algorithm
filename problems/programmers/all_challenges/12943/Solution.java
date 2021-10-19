class Solution {

    public static int solution(int num) {
        int answer = 0;
        long longNum = num;
        boolean isEven;

        if( num == 1 ) return 0;

        for(int i = 500; i > 0; i-- ){
            isEven = (longNum % 2 == 0 ? true : false);
            answer++;
            if(isEven) {
                longNum /= 2;
            } else {
                longNum = longNum * 3 + 1;
            }

            if( longNum == 1 )
                return answer;
        }
        return -1;
    }
}