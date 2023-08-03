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
public class QuickSort {
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        if(firstIndex == secondIndex) return;
        
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
    
    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for(int i = pivotIndex + 1; i <= endIndex; i++) {
            if(array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        
        swap(array, pivotIndex, swapIndex);
        
        return swapIndex;
    }
    
    private static void quickSortHelper(int[]array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
        
    }
    
    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }
    
    
    public static void main(String[] args) {
        int[] myArray = {4, 6, 5, 1, 3, 8};
        quickSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
