import java.util.ArrayList;
import java.util.Scanner;

public class ModeloDeInsercao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos nomes serão utilizados? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<String> nomes = new ArrayList<>();
        
        //Entrada de nomes
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            inserirOrdenado(nomes, nome);
        }
        
        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
    
    //Método para inserir um nome em ordem na lista
    private static void inserirOrdenado(ArrayList<String> lista, String nome) {
        int i = 0;
        while (i < lista.size() && nome.compareTo(lista.get(i)) > 0) {
            i++;
        }
        lista.add(i, nome);
    }
}