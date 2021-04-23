import java.lang.reflect.Array;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;

        if (arr.length <= 1) {
            answer = new int[arr.length];
            answer[0] = -1;
        }
        else {
            answer = new int[arr.length-1];
            int temp = arr[0];
            for (int arr_index : arr) {
                if (temp > arr_index) temp = arr_index;
            }

            int i = 0;
            for (int arr_index : arr) {
                if (arr_index != temp) {
                    answer[i] = arr_index;
                    i++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {4, 3, 2, 1};
        System.out.println(s.solution(arr));
    }
}

//600851475143
//50000000000000