import java.util.ArrayList;

public class Funcao {
    
    public void imprimirLista(ArrayList<Pessoa> listaPessoas) {

        for(Object itemDaLista : listaPessoas){
            System.out.println(itemDaLista);
        }
    }
    
}
