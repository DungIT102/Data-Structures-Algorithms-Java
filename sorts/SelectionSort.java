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
public class SelectionSort {
    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            if(i != minIndex ) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] myArray = {6, 9, 12, 2, 6, 1, 8};
        selectionSort(myArray);
        
        System.out.println(Arrays.toString(myArray));
    }
}
