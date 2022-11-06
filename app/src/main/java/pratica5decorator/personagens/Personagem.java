package pratica5decorator.personagens;

import pratica5decorator.personagens.escudos.Escudo;
import pratica5decorator.personagens.escudos.EscudoProtetor;
import pratica5decorator.personagens.estados.NormalState;
import pratica5decorator.personagens.estados.PersonagemState;

public class Personagem {
    public static Double MAX_HP = 100.0;
    public static Double BASE_HP = 70.0;
    public static Double BASE_ATK = 10.0;
    private Double hp;
    private PersonagemState personagemState;

    public Escudo getEscudo() {
        return escudo;
    }

    private Escudo escudo;

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    private Double ataque;

    public Personagem() {
        this.hp = Personagem.BASE_HP;
        this.personagemState = new NormalState(this);
        this.escudo = new EscudoProtetor(this);
        this.ataque = Personagem.BASE_ATK;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        if (hp > 100) hp = 100.0;
        else if (hp < 0) hp = 0.0;

        this.hp = hp;
    }

    public void pular() {
        this.personagemState.pular();
    };
    public void correr() {
        this.personagemState.correr();
    };
    public void atacar() {
        this.personagemState.atacar();
    };
    public void tomarDano(Double dano) {
        this.personagemState = this.personagemState.tomarDano(dano);
    };
    public void recompensa(Double valor) {
        this.personagemState = this.personagemState.recompensa(valor);
    };

    public void ganhaEscudo(Escudo escudo) {
        this.escudo.addEscudo(escudo);
    }
}
