
public class Main {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Array original:");
        printArray(array);
        
        selectionSort(array);
        
        System.out.println("Array ordenado:");
        printArray(array);
        
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Array original:");
        printArray(array);
        
        insertionSort(array);
        
        System.out.println("Array ordenado:");
        printArray(array);
        
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Array original:");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("Array ordenado:");
        printArray(array);
        
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Array original:");
        printArray(array);
        
        
        bubbleSort(array);
        
        System.out.println("Array ordenado com Bubble Sort:");
        printArray(array);
        
        
    }
}
