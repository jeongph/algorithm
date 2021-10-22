public class MyMergeSort {

    public void sort(int[] arr, int left, int right) {
        if (left == right) return;

        int center = (left + right) / 2;
        this.sort(arr, left, center);
        this.sort(arr, center + 1, right);
        this.merge(arr, left, center, right);
        System.out.println(this.toString(arr));
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] mergeArr = new int[10];
        int l = left;
        int r = mid + 1;
        int pointer = left;


        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                mergeArr[pointer] = arr[l];
                pointer++;
                l++;
            } else {
                mergeArr[pointer] = arr[r];
                pointer++;
                r++;
            }
        }

        if (l > mid) {
            while (r <= right) {
                mergeArr[pointer] = arr[r];
                pointer++;
                r++;
            }
        } else {
            while (l <= mid) {
                mergeArr[pointer] = arr[l];
                pointer++;
                l++;
            }
        }

        // copy
        if (right + 1 - left >= 0) System.arraycopy(mergeArr, left, arr, left, right + 1 - left);
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
        int arr[] = {1, 7, 6, 5, 8, 3, 4, 2};

        MyMergeSort mms = new MyMergeSort();
        mms.sort(arr, 0, arr.length - 1);
    }
}
