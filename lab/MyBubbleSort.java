public class MyBubbleSort {

    public void sort(int arr[]) {
        int arrLen = arr.length;

        for (int i = 1; i < arrLen; i++) {
            for (int k = 0; k < arrLen - i; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
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

        MyBubbleSort mbs = new MyBubbleSort();
        mbs.sort(arr);
    }
}
