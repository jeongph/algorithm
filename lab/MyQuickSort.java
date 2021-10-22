public class MyQuickSort {

    public void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = this.division(arr, low, high);
        this.sort(arr, low, pivot - 1);
        this.sort(arr, pivot + 1, high);
    }

    public int division(int arr[], int left, int right) {
        int lTarget = left;
        int rTarget = right;
        int pivot = arr[left];

        while (lTarget < rTarget) {
            while (arr[rTarget] > pivot && lTarget < rTarget) {
                --rTarget;
            }

            while (arr[lTarget] <= pivot && lTarget < rTarget) {
                ++lTarget;
            }

            int temp = arr[lTarget];
            arr[lTarget] = arr[rTarget];
            arr[rTarget] = temp;
        }

        int temp = arr[left];
        arr[left] = arr[lTarget];
        arr[lTarget] = temp;

        System.out.println(this.toString(arr));
        return left;
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
        int[] arr = {1, 9, 7, 5, 6, 8, 3, 4, 2};

        MyQuickSort mqs = new MyQuickSort();
        mqs.sort(arr, 0, arr.length - 1);
    }
}
