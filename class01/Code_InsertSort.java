package class01;

import static class01.Code_CommonFunc.swap;

public class Code_InsertSort {
    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = n-1; i >= 0; --i) {
            for (int j = i + 1; j < n && arr[j - 1] < arr[j]; ++j) {
                swap(arr, j ,j - 1 );
            }
        }
    }
}
