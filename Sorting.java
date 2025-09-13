// Selection sort

import java.util.Arrays;

class Sorting {

    static int[] doSelectionSort(int[] arr) {

        System.out.println("selectionSort Arr :  " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }

        return arr;

    }

    static int[] doBubbleSort(int[] arr) {

        System.out.println("bubbleSort Arr :  " + Arrays.toString(arr));

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = false;
                }
            }
            if (!isSwapped)
                break;
        }

        return arr;
    }

    static int[] doInsertionSort(int[] arr) {
        System.out.println("insertSort Arr :  " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        return arr;
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void main(String[] args) {

        int[] ssArr = { 76, 54, 3, 2, 20, 11, 32 };

        int[] res_SS_Arr = doSelectionSort(ssArr);
        System.out.println("arr : " + Arrays.toString(res_SS_Arr));
        System.out.println(" ");

        int[] bsArr = { 76, 54, 391, 200, 201, 111, 321 };
        int[] res_bs_Arr = doBubbleSort(bsArr);
        System.out.println("BS Arr : " + Arrays.toString(res_bs_Arr));
        System.out.println(" ");

        int[] insertArr = { 23, 43, 71, 99, 10, 32, 64 };
        int[] res_insert_Arr = doInsertionSort(insertArr);
        System.out.println("Insertion Arr : " + Arrays.toString(res_insert_Arr));

        int[] mergeArr = { 5, 4, 3, 2, 1 };
        System.out.println("\n mergeArr : " + Arrays.toString(mergeArr));
        int[] resultMergeArr = mergeSort(mergeArr);
        System.out.println("resultMergeArr : " + Arrays.toString(resultMergeArr));

    }
}
