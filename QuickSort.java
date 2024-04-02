public class QuickSort {
    

    private static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
    private static int particionar(int[] array, int inicio, int fim) {
        int pivot = array[fim];
        int i = inicio - 1;
        
        for (int j = inicio; j < fim; j++) {
            if (array[j] < pivot) {
                i++;
                trocar(array, i, j);
            }
        }
        
        trocar(array, i + 1, fim);
        return i + 1;
    }
    
   
    private static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivot = particionar(array, inicio, fim);
            
            quickSort(array, inicio, indicePivot - 1);
            quickSort(array, indicePivot + 1, fim);
        }
    }
    
 
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = {8, 3, 1, 5, 9, 2, 7, 4, 6};
        System.out.println("Array original:");
        imprimirArray(array);
        
        sort(array);
        
        System.out.println("Array ordenado:");
        imprimirArray(array);
    }
}