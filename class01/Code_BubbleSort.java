package class01;
import static class01.Code_CommonFunc.swap;

public class Code_BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        if (arr == null || n < 2) {
            return;
        }
        for (int i = n - 1; i > 0; --i) {
            for (int j = i; j < n; ++j) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
//        for (int i = n - 1; i >= 0; --i) {
//            for (int j = 1; j <= i; ++j) {
//                if (arr[j - 1] > arr[j]) {
//                    swap(arr, j ,j - 1 );
//                }
//            }
//        }
//        for (int i = 1; i < n; ++i) {
//            for (int j = 0; j < n - i; ++j) {
//                if (arr[j] > arr[j + 1]) {
//                    swap(arr, j ,j + 1);
//                }
//            }
//        }
    }
}