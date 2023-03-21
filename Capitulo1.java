import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo1 {
    String nome;
    String texto;
    ArrayList<Escolha> escolhas;
    personagens personagens;
    int alteracaoVida;
    Scanner object;

    //construtor
    Capitulo1(String nome, String texto, personagens personagens, int alteracaoVida,
            Scanner object) {
        this.nome = nome;
        this.texto = texto;
        this.personagens = personagens;
        this.alteracaoVida = alteracaoVida;
        this.object = object;
        this.escolhas = new ArrayList<Escolha>();
    }

    //Metodo mostrar, ao ser chamado a função vai mostrar tudo que estiver dentro dele ou seja, dentro de cada capitulo.
    void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println(this.escolhas);
        
        
    if (this.escolhas != null)
    {
        for (Escolha escolha : escolhas)
        {
            System.out.println(escolha.texto);
        }
    }       
    System.out.println();

    if (escolhas.size() > 0)
    {
        int escolha = escolher();
        this.escolhas.get(escolha).proximo.mostrar();
    }

    }
    
    int escolher() 
    {
        int retorno = -1;
        if (this.escolhas != null) 
        {
            while (retorno == -1)
            {
                System.out.print("Faça a sua escolha: ");
                String escolhasUsuario = this.object.nextLine();
                
                int retornoInicial = 0;
                for (Escolha escolha : this.escolhas) 
                {
                    if (escolha.texto.equals(escolhasUsuario)) 
                    {
                        retorno = retornoInicial;
                    }
                    retornoInicial++;
                }
            }
            System.out.println();
        }
        return retorno;
    }
}
