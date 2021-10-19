import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!ar.contains(sum)) ar.add(sum);
            }
        }

        Collections.sort(ar);
        answer = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            answer[i] = ar.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] i = {2,1,3,4,1};
        System.out.println(s.solution(i));
    }
}