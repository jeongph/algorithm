public class Main {
    public static void main(String[] args)
    {
        Solution s= new Solution();
        int[][] a1 = {{1,2},{2,3}};
        int[][] a2 = {{3,4},{5,6}};
        System.out.println(s.solution(a1, a2));
    }
}

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++ ){
            for(int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}