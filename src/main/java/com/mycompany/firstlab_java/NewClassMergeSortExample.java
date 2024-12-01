/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstlab_java;

/**
 *
 * @author hnaji
 */
public class NewClassMergeSortExample {
    
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            // Sort the first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            
            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }
    
    public static void merge(int[] array, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }
        
        // Merge the temporary arrays
        
        // Initial indexes of the first and second subarrays
        int i = 0, j = 0;
        
        // Initial index of the merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy the remaining elements of L[]
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        
        // Copy the remaining elements of R[]
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Unsorted array:");
        printArray(array);
        
        mergeSort(array, 0, array.length - 1);
        
        System.out.println("Sorted array:");
        printArray(array);
    }
}

