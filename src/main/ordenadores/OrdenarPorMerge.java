package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

   
    public static void merge(int[] array, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;

       
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

       
        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

      
        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n > 1) {
            int mid = n / 2;

           
            int[] left = new int[mid];
            int[] right = new int[n - mid];

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, n - mid);

           
            mergeSort(left);
            mergeSort(right);

            
            merge(array, left, right);
        }
    }


    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
