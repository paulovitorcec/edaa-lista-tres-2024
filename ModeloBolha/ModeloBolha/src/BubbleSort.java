import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        //Convertendo a string para um array de caracteres
        char[] chars = input.toCharArray();

        //Aplicando o algoritmo de ordenação da bolha
        bubbleSort(chars);

        //Construindo a string ordenada
        String ordemString = new String(chars);
        
        System.out.println("String ordenada: " + ordemString);

        scanner.close();
    }

    //Implementando o algoritmo de ordenação da bolha para ordenar um array de caracteres
    private static void bubbleSort(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}