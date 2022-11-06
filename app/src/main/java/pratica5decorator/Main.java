package pratica5decorator;


import pratica5decorator.personagens.Personagem;
import pratica5decorator.personagens.escudos.EscudoProtetor;

public class Main {
    private static void fazTudo(Personagem personagem) {
        personagem.correr();
        personagem.pular();
        personagem.atacar();
    }
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        fazTudo(personagem);
        System.out.println("O personagem conseguiu 10 de vida");
        personagem.recompensa(10.0);
        fazTudo(personagem);
        System.out.println("O personagem ganhou um escudo de 10 de hp e tomou 10 de dano 5 vezes");
        personagem.ganhaEscudo(new EscudoProtetor(personagem, 10.0));
        personagem.tomarDano(10.0);
        personagem.tomarDano(10.0);
        personagem.tomarDano(10.0);
        personagem.tomarDano(10.0);
        personagem.tomarDano(10.0);
        fazTudo(personagem);
        System.out.println("O personagem perdeu 40 de vida");
        personagem.tomarDano(30.0);
        fazTudo(personagem);
        System.out.println("O personagem perdeu 50 de vida");
        personagem.tomarDano(40.0);
        fazTudo(personagem);
        System.out.println("O personagem perdeu mais 50 de vida num hit");
        personagem.tomarDano(40.0);
        fazTudo(personagem);
    }
}