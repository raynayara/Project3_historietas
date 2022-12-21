import java.util.Scanner;

public class Capitulo1 {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    personagens personagens;
    int alteracaoVida;
    Scanner object;

    Capitulo1(String nome, String texto, String escolha1, String escolha2, personagens personagens, int alteracaoVida,
            Scanner object) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagens = personagens;
        this.alteracaoVida = alteracaoVida;
        this.object = object;
    }

    void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);
    }

    int escolher() {
        int escolha = -1;
        if (this.escolha1 != null && this.escolha2 != null) {
            String escolhas = this.object.nextLine();
            if (escolhas.equals(this.escolha1)) {
                escolha = 1;
            } else if (escolhas.equals(this.escolha2)) {
                escolha = 2;
            }
        }

        return escolha;
    }
}
