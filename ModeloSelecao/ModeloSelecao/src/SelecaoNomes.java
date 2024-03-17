import java.util.Scanner;

public class SelecaoNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de nomes a serem inseridos: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[n];

        //Solicitando a inserção dos nomes
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        //Ordenando os nomes pelo tamanho usando o algoritmo de seleção
        selectionSort(nomes);

        //Nomes ordenados
        System.out.println("Nomes ordenados pelo tamanho:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }

    //Implementando algoritmo de seleção para ordenar os nomes pelo tamanho
    private static void selectionSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].length() < array[menor].length()) {
                    menor = j;
                }
            }
            //Trocando o elemento atual com o menor encontrado
            String temp = array[menor];
            array[menor] = array[i];
            array[i] = temp;
        }
    }
}