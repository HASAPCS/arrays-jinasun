package com.example;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        // Exercise 1: Initialize and Print an Array
        // TODO: Initialize an array of integers and print its contents
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number: numbers){
            System.out.print(number);
        }
    }

    // Exercise 2: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        // TODO: Implement the logic to find the maximum value in the array.
        int max = array[0];

        for (int i = 1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max; // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value
    public static boolean containsValue(int[] array, int value) {
        for (int aa : array){
            if(aa == value){
                return true;
            }
        }
        return false;
        // TODO: Implement the logic to check if the array contains the specified value.
        // Placeholder return value
    }

    // Exercise 4: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int count = 0;
        int sum = 0;
        for (int aa: array){
            sum += aa;
            count = count + 1;
            
        }
        double avg = sum / count;
        // TODO: Implement the logic to calculate the average of the array elements.
        return avg; // Placeholder return value
    }

    // Exercise 5: Reverse an Array
    public static int[] reverseArray(int[] array) {
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        return array;
    }
        // TODO: Implement the logic to reverse the array.
        // Placeholder return value


    // Exercise 6: Sort an Array
    public static void sortArray(int[] array) {
        Arrays.sort(array);
        // TODO: Implement a sorting algorithm to sort the array.
    }
}
