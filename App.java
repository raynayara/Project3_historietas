import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        new personagens("Pepe", 100);
        personagens player2 = new personagens("Marilu", 100);
        personagens criatura = new personagens("Morte", 100);

        //Sinopse da história, executado apenas uma vez.
        System.out.println("Pepe é um garoto malcriado e preguiçoso de onze anos,"+
        "\nque mora com sua avó, uma velha bruxa, e trabalha como entregador para ela"+
        "\ncujo trabalho é vender artefatos e poções mágicas pela internet. "+
        "\nOs produtos criados por ela, levam Pepe, seu cão Ramirez, e marilu sua amiga."+
        "\na enfrentarem monstros, espíritos e toda espécie de criatura sobrenatural.\n");
        
        
        Capitulo1 capitulo01 = new Capitulo1
        ("Capitulo 1: A entrega",
                "\nEm uma noite fria e sombria, Pepe embarca em uma jornada"+ 
                "\npara fazer a entrega de algumas porções para sua avó. Mas no caminho,"+
                "\nele encontra uma criatura monstruosa que está tentando roubar suas porções."+
                "\nPara escapar, ele precisa usar algumas de suas porções extras e tentar fugir."+
                "\nUma de suas porçoes pode matar a criatura em alguns segundos.",
                "\n(porção 1) Ataque calice de fogo", 
                "(porção 2) Ataque garras do inferno", 
                criatura, 
                0, 
                object);

        capitulo01.mostrar();
        int ataque = capitulo01.escolher();
        if (ataque == 1) {
            System.out.println(criatura.nome + " leva 50 de dano");
            criatura.vida -= 50 ;
            System.out.println(criatura.nome + " está debilitada após o feitiço lhe tirar 50% de vida");
            System.out.println(criatura.vida);

        
        } else if (ataque == 2) {
            System.out.println(criatura.nome + " leva 100 de dano.");
            criatura.vida -= 100;
            System.out.println("Você acertou a porção de maior dano e matou a " + criatura.nome + ".");
            System.out.println(criatura.vida);

        }
        System.out.println("Pepe consegue enganar a morte e logo consegue realizar sua entrega.\n\n");
        
        Capitulo1 capitulo02 = new Capitulo1("Capitulo 2: O caminho perdido",
                "Para chegar até a casa de seu amigo Pepe, Marilu terá de passar pelo caminho perdido."+
                "\nEsté caminho é rodeado de armadilhas e criaturas monstruosas, ajude-a a atravessar e chegar até a casa de Pepe."+
                "\nPor qual caminho você aconselha Marilu a ir?",
                "caminho 1?", 
                "caminho 2?", 
                player2, 
                0, 
                object);

        capitulo02.mostrar();
        int res = capitulo02.escolher();
        if (res == 1) {
            System.out.println(
                    "Ufa, boa escolha! O caminho 1 estava livre e Marilu conseguiu atravessar em segurança.\n");
        
        } else if (res == 2) {
            System.out.println(
                    "O caminho 2 estva repleto de morcegos vampiros e Marilu foi atacada por eles.  Perdendo 30% de sua vida.");
            player2.vida -= 30;
            System.out.println(player2.nome + " está com " + player2.vida + "% de vida restante.\n");
        }


        Capitulo1 capitulo03 = new Capitulo1("Capitulo 3: o encontro",
                "Após passar pelo caminho perdido Marilu está quase chegando na casa de Pepe, mas "+
                "\ndurante sua caminhada ela encontra uma feiticeira que lhe oferece duas porções mágicas."+ 
                "\nA primeira porção lhe dará o poder de voar e a segunda porção lhe dará o poder da cura."+
                "\nQual delas Marilu deve escolher?",
                "porção 1?", 
                "porção 2?", 
                player2, 
                0, 
                object);

        capitulo03.mostrar();
        int poder = capitulo03.escolher();
        if (poder == 1) {
            player2.vida -= 30;
            System.out.println("Marilu continuará com " + player2.vida
                    + "%  de vida, mas agora ela pode voar, logo ela levantou voo e chegou até Pepe.");
        
        } else if (poder == 2) {
            player2.vida += 30;
            System.out.println("Marilu recuperou sua vida " + player2.vida
                    + "% e agora pode chegar até a casa de Pepe em segurança.");
        }

        object.close();
    }
}