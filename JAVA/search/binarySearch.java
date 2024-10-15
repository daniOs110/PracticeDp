public class BinarySearch {

    // Método de búsqueda binaria que retorna el índice del valor buscado o -1 si no se encuentra
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            // Encuentra el índice medio
            int mid = low + (high - low) / 2;
            
            // Si el valor medio es el objetivo, retorna el índice
            if (arr[mid] == target) {
                return mid;
            }
            // Si el valor objetivo es mayor, ignora la mitad izquierda
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            // Si el valor objetivo es menor, ignora la mitad derecha
            else {
                high = mid - 1;
            }
        }
        
        // Si el valor no está presente en el array
        return -1;
    }