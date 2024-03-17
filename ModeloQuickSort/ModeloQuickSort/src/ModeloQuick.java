public class ModeloQuick {
    public static void main(String[] args) {
        String input = "paulo vitor";

        char[] charArray = input.toCharArray();

        quickSort(charArray, 0, charArray.length - 1);

        String sortedString = new String(charArray);
        System.out.println("String ordenada: " + sortedString);
    }

    public static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = pivo(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int pivo(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                trocapivo(arr, i, j);
                i++;
            }
        }
        trocapivo(arr, i, high);
        return i;
    }

    public static void trocapivo(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}