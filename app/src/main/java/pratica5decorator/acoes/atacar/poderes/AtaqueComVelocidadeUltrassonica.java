package pratica5decorator.acoes.atacar.poderes;

import pratica5decorator.acoes.atacar.AtacarStrategy;

public class AtaqueComVelocidadeUltrassonica extends AtacarDecorator {
    public static Double ATAQUE_COM_VELOCIDADE_ULTRASSONICA_HP = 4.0;
    public AtaqueComVelocidadeUltrassonica(AtacarStrategy ataque) {
        super(ataque);
    }

    @Override
    public Double atacar() {
        return this.getAtaque().atacar() + AtaqueComVelocidadeUltrassonica.ATAQUE_COM_VELOCIDADE_ULTRASSONICA_HP;
    }
}
