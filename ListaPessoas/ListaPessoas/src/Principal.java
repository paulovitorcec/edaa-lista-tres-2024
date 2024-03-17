import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Principal implements Comparable<Principal> {
    private String nome;
    private int idade;

    public Principal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Principal outraPessoa) {
        return this.nome.compareTo(outraPessoa.getNome());
    }

    public static void main(String[] args) {
        ArrayList<Principal> listaPessoas = new ArrayList<>();
        String[] nomes = {"Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
                "Breno Vinicius", "Vinícius Raphael", "César Augusto", "Daniela Teixeira",
                "Eduardo Jose", "Emerson Vinicios", "Felipe dos Santos", "Gabriel Felipe",
                "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva", "Henrique Cezar",
                "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
                "Marcus Paulo", "Maria Clara", "André Luiz", "Diogo Freitas",
                "Matheus Felipe", "Nátali Saltino", "Paulo Vítor", "Rogério Lopes",
                "Thiago Luis", "Víctor Henrique", "Vinicius Garcia", "Vinícius Paiva",
                "Wesley Carvalho", "Weslley Ferreira", "Caio Alves", "Lucas Marques",
                "Marcela Maria"};

        Random random = new Random();

        for (String nome : nomes) {
            int idade = random.nextInt(50) + 10;
            Principal pessoa = new Principal(nome, idade);
            listaPessoas.add(pessoa);
        }

        Collections.sort(listaPessoas);
        for (Principal p : listaPessoas) {
            System.out.println(p.getNome() + " - " + p.getIdade());
        }
    }
}