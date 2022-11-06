package pratica5decorator.personagens.estados;

import pratica5decorator.acoes.atacar.AtacarFraco;
import pratica5decorator.acoes.atacar.AtacarStrategy;
import pratica5decorator.acoes.correr.CorrerDevagar;
import pratica5decorator.acoes.correr.CorrerStrategy;
import pratica5decorator.acoes.pular.PularBaixo;
import pratica5decorator.acoes.pular.PularStrategy;
import pratica5decorator.personagens.Personagem;

public class FracoState implements PersonagemState {
    public static Double HP_MAX = 30.0;
    private Personagem personagem;
    PularStrategy pularStrategy;
    AtacarStrategy atacarStrategy;
    CorrerStrategy correrStrategy;

    public FracoState(Personagem personagem) {
        this.personagem = personagem;
        this.atacarStrategy = new AtacarFraco();
        this.correrStrategy = new CorrerDevagar();
        this.pularStrategy = new PularBaixo();
    }

    @Override
    public PersonagemState recompensa(Double hp) {
        Double newLife = this.personagem.getHp() + hp;
        this.personagem.setHp(newLife);
        return this.getProximoEstado();
    }

    @Override
    public PersonagemState tomarDano(Double hp) {
        this.personagem.getEscudo().tomaDano(hp);
        return this.getProximoEstado();
    }

    @Override
    public void correr() {
        correrStrategy.correr();
    }

    @Override
    public void pular() {
        pularStrategy.pular();
    }

    @Override
    public void atacar() {
        atacarStrategy.atacar();
    }

    @Override
    public PersonagemState getProximoEstado() {
        Double newHp = this.personagem.getHp();
        if (newHp <= 0) {
            return new MortoState(this.personagem);
        } else if (newHp < FracoState.HP_MAX) {
            return this;
        } else if (newHp < NormalState.HP_MAX) {
            return new NormalState(this.personagem);
        } else {
            return new ForteState(this.personagem);
        }
    }
}
