package pratica5decorator;


import pratica5decorator.acoes.atacar.poderes.AtacarDecorator;
import pratica5decorator.acoes.atacar.poderes.AtaqueComVelocidadeUltrassonica;
import pratica5decorator.acoes.atacar.poderes.AtaqueDeFogo;
import pratica5decorator.acoes.atacar.poderes.AtaqueDeLamina;
import pratica5decorator.personagens.Personagem;
import pratica5decorator.personagens.escudos.EscudoProtetor;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        System.out.printf("Personagem atacou com %f de dano\n", personagem.atacar());
        System.out.println("Personagem ganhou velocidade ultrassonica");
        personagem.ganhaPoder(AtaqueComVelocidadeUltrassonica.class);
        System.out.printf("Personagem atacou com %f de dano\n", personagem.atacar());
        System.out.println("Personagem ganhou ataque de fogo");
        personagem.ganhaPoder(AtaqueDeFogo.class);
        System.out.printf("Personagem atacou com %f de dano\n", personagem.atacar());
        System.out.println("Personagem ganhou ataque de +1 lamina");
        personagem.ganhaPoder(AtaqueDeLamina.class);
        System.out.printf("Personagem atacou com %f de dano\n", personagem.atacar());
        System.out.println("Personagem ganhou ataque de +1 lamina");
        personagem.ganhaPoder(AtaqueDeLamina.class);
        System.out.printf("Personagem atacou com %f de dano\n", personagem.atacar());
        System.out.println("Personagem ganhou nessa ordem: ataque de fogo e ataque de lâmina");
        personagem.ganhaPoder(AtaqueDeFogo.class);
        personagem.ganhaPoder(AtaqueDeLamina.class);
        System.out.printf("Personagem atacou com %f de dano\n", personagem.atacar());
        System.out.println("Personagem vai evoluir, então perde os poderes");
        personagem.recompensa(10.0);
        System.out.printf("Personagem atacou com %f de dano\n", personagem.atacar());
    }
}