import java.util.Scanner;

public class Capitulo1 {
    String nome;
    String texto;
    String[] escolhas;
    personagens personagens;
    int alteracaoVida;
    Scanner object;

    //construtor
    Capitulo1(String nome, String texto, String[] escolhas, personagens personagens, int alteracaoVida,
            Scanner object) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagens = personagens;
        this.alteracaoVida = alteracaoVida;
        this.object = object;
    }

    //Metodo mostrar, ao ser chamado a função vai mostrar tudo que estiver dentro dele ou seja, dentro de cada capitulo.
    void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println(this.escolhas);
        
        
    if (this.escolhas != null){
        for (String escolha : escolhas) {
            System.out.println(escolha);
        }
        System.out.println();
    }

    }
    
    int escolher() {
        int retorno = -1;
        if (this.escolhas != null) 
        {
            while (retorno == -1)
            {
                System.out.print("Faça a sua escolha: ");
                String escolhasUsuario = this.object.nextLine();
                
                int retornoInicial = 0;
                for (String escolha : escolhas)
                {
                    if (escolhas.equals(this.escolhas)) 
                    {
                    retorno = retornoInicial;
                    retornoInicial ++;
                    }
                }

            }
                System.out.println();

        }          
            return retorno;
    }
}
