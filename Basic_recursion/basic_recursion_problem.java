import java.util.Arrays;

class LearningRecursion {

    static int count = 0;

    static void printNTimes() {

        if (count == 3)
            return;

        System.out.println(count);
        count++;
        printNTimes();

    }

    // printing name n times

    static void printNameNTimes(int count, int total) {
        if (count > total) {
            return;
        }

        System.out.println("Arun " + " and count value is : " + count);
        printNameNTimes(count + 1, total);
        System.out.println("printing count value while returnin : " + count);
    }

    // Printing 1 to N
    static void print1ToN(int i, int n) {
        if (i > n)
            return;

        System.out.println(i);
        print1ToN(i + 1, n);
    }

    static void print1ToNUsingBackTracking(int i) {
        if (i <= 0)
            return;

        print1ToNUsingBackTracking(i - 1);
        System.out.println(i);
    }

    static void printNTo1(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printNTo1(n - 1);
    }

    static int sumOfNaturalNumbers(int n) {
        if (n == 0)
            return 0;

        return n + sumOfNaturalNumbers(n - 1);
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    static int[] reverseArrayIterative(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        System.out.println("Array before modification !!! " + Arrays.toString(arr));
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array after modification !!! " + Arrays.toString(arr));

        return arr;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void reverseArrayRecursive(int[] arr, int start, int end) {
        if (start > end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArrayRecursive(arr, start + 1, end - 1);
    }

    // recursive way of looping fibonacci

    static int fibanocciRecursiveWay(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibanocciRecursiveWay(n - 1) + fibanocciRecursiveWay(n - 2);
    }

    static int fibanocciIterativeWay(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int secondLast = 0;
        int last = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = secondLast + last;
            secondLast = last;
            last = current;

        }

        return current;
    }

    // Iterative way of fibonacci

    public static void main(String[] args) {
        // printNTimes();
        // printNameNTimes(0, 4);
        // print1ToN(1, 5);
        // print1ToNUsingBackTracking(5);
        // printNTo1(5);
        // int result = sumOfNaturalNumbers(5);
        // System.out.println("result : " + result);
        // int factOfFive = factorial(5);
        // System.out.println("factOfFive : " + factOfFive);
        // reverseArrayIterative(new int[] { 1, 2, 3, 4, 5 });

        // int[] arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println("Before sorting : " + Arrays.toString(arr));
        // reverseArrayRecursive(arr, 0, arr.length - 1);
        // System.out.println("After sorting : " + Arrays.toString(arr));

        int result = fibanocciRecursiveWay(6);
        System.out.println("fib(6) : " + result);

        int result1 = fibanocciIterativeWay(7);
        System.out.println("fib(7) : " + result1);

    }

}
