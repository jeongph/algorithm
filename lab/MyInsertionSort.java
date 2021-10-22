public class MyInsertionSort {

    public void sort(int arr[]) {
        int arrLen = arr.length;

        // 전체 배열을 순회
        for (int i = 0; i < arrLen; i++) { // pick
            if (i == 0) continue;
            int pick = i;

            for (int k = i - 1; k >= 0; k--) {
                if (arr[k] > arr[pick]) {
                    int temp = arr[k];
                    arr[k] = arr[pick];
                    arr[pick] = temp;
                    --pick;
                }
            }

            System.out.println(this.toString(arr));
        }
    }

    public String toString(int arr[]) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += String.format("[%d] ", arr[i]);
        }

        return str;
    }

    /**
     * Main
     */
    public static void main(String[] args) {
        int arr[] = {1, 9, 7, 5, 6, 8, 3, 4, 2};

        MyInsertionSort mis = new MyInsertionSort();
        mis.sort(arr);
    }
}
