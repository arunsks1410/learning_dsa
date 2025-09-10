package Hashing;

import java.util.HashMap;
import java.util.Map;

class LearningHashing {

    // Count the freq of given array using loops
    static void countFreqOfGivenArrayUsingLoops(int[] numbers, int n) {

        boolean[] visited = new boolean[n];

        for (int i = 0; i < numbers.length; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("value : " + numbers[i] + " occures : " + count);
        }
    }

    static void countFreqOfGivenArrayUsingMap(int[] numbers, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(numbers[i])) {
                map.put(numbers[i], map.get(numbers[i]) + 1);
            } else {
                map.put(numbers[i], 1);
            }
        }

        System.out.println("printing values inside the map : ");

        map.forEach((key, value) -> System.out.println("key : " + key + " value : " + value));

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // System.out.println(entry.getKey() + " " + entry.getValue());
        // }

    }

    static void findTheHighestAndLowestFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // int lowestElement = Integer.MAX_VALUE;
        // int highestElement = Integer.MIN_VALUE;

        int lowestCount = Integer.MAX_VALUE;
        int highestCount = Integer.MIN_VALUE;
        int lowestElement = -1;
        int highestElement = -1;

        // map.forEach((key, val) -> {
        // if(val > highestElement){
        // highestElement = val;
        // }
        // System.out.println("key : " + key + "value : " + val);
        // // if(val > highestElement){
        // // highestElement = val;
        // // }
        // });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("printing values : " + entry.getValue() + "highest : " + highestCount);
            System.out.println(entry.getValue() > highestCount);

            if (entry.getValue() > highestCount) {

                highestCount = entry.getValue();
                highestElement = entry.getKey();
            }
            System.out.println("after highest count : " + highestCount +
                    "highest key element : " + highestElement);

            if (entry.getValue() < lowestCount) {

                lowestCount = entry.getValue();
                lowestElement = entry.getKey();
            }

            System.out.println("after lowest count : " + lowestCount +
                    "lowest key element : " + lowestElement);

        }

    }

    public static void main(String[] args) {

        System.out.println("inside hash main !!! ");
        int[] numbers = { 10, 5, 10, 15, 10, 5 };
        countFreqOfGivenArrayUsingLoops(numbers, numbers.length);

        countFreqOfGivenArrayUsingMap(numbers, numbers.length);

        findTheHighestAndLowestFreq(numbers);
    }

}
