package class01;

import Code_util.comparator;
import static class01.Code_SelectSort.*;
import static class01.Code_BubbleSort.*;
import static class01.Code_InsertSort.*;
import static class01.Code_CommonFunc.*;

public class Code_test {
    public static void main(String[] args) {
        int maxLen = 500;
        int maxValue = 100000;
        int testTimes = 50000;
        int testCount = 0;
        for (int i = 0; i < testTimes; ++i) {
            int[] arr = comparator.genArr(maxLen, maxValue);
            int[] arr2 = comparator.copyArr(arr);
            selectSort(arr);
            bubbleSort(arr2);
            testCount++;
            if (!comparator.isArrSorted(arr, arr2)) {
                System.out.println("test fail at " + testCount);
                printArr(arr);
                printArr(arr2);
            }
        }
        System.out.println("test finish");
    }
}
