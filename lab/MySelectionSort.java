public class MySelectionSort {

    public void sort(int arr[]) {
        int arrLen = arr.length;

        // 전체 배열을 순회
        for (int i = 0; i < arrLen; i++) {
            int min = i; // 최솟값 위치을 선택해서 맨앞으로 순차정렬

            // 선택된 항을 제외한 뒷쪽의 모든 항을 검색
            for (int k = i + 1; k < arrLen; k++) {
                if (arr[k] < arr[min]) min = k;
            }

            // 찾은 최소값과 i 위치를 변경
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

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

        MySelectionSort mss = new MySelectionSort();
        mss.sort(arr);
    }
}
