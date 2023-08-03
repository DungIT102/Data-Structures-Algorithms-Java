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
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for(int i = array.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] myArray = {4, 2, 7, 9, 1, 2, 56, 88};
        bubbleSort(myArray);
        
        System.out.println(Arrays.toString(myArray));
    }
}
