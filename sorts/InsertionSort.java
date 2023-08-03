/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorts;

import java.util.Arrays;

/**
 *
 * @author levan
 */
public class InsertionSort {
    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] myArray = {4, 2, 5, 1, 3, 6};
        insertionSort(myArray);
        
        System.out.println(Arrays.toString(myArray));
    }
}
