
public class personagens {
    public String nome;
    public int vida;

    personagens(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void alteracaoVida(int alteracaoVida) {
        this.vida -= alteracaoVida;
    }
}
