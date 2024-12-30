package class01;
import static class01.Code_CommonFunc.swap;

public class Code_SelectSort {
    public static void selectSort(int[] arr) {
        // 边界判断
        int n = arr.length;
        if (arr == null || n < 2) return;
        for (int i = 0; i < n; ++i) {
            int maxValuePst = i;
            for (int j = i; j < n; ++j) {
                maxValuePst = (arr[j] <= arr[maxValuePst]) ? j : maxValuePst;
            }
            swap(arr, i, maxValuePst);
        }
    }
}
