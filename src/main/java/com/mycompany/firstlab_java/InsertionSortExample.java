/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstlab_java;

/**
 *
 * @author hnaji
 */
public class InsertionSortExample {
    
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            
            // Move elements that are greater than key to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        
        System.out.println("Unsorted array:");
        printArray(array);
        
        insertionSort(array);
        
        System.out.println("Sorted array:");
        printArray(array);
    }
}


