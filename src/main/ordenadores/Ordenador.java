package ordenadores;
public interface Ordenador {
    
    public static void bubbleSort(int[] array) {
        
    }

    public static void insertionSort(int[] array) {
        
    }

    public static void selectionSort(int[] array) {
        
    }

    public static void mergeSort(int[] array) {
       
    }

    

    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
