package pratica5decorator.acoes.atacar.poderes;

import pratica5decorator.acoes.atacar.AtacarStrategy;

public class AtaqueDeFogo extends AtacarDecorator {
    public static Double ATAQUE_DE_FOGO_HP = 2.0;

    public AtaqueDeFogo(AtacarStrategy ataque) {
        super(ataque);
    }

    @Override
    public Double atacar() {
        System.out.println("Lancei fogo");
        return this.getAtaque().atacar() + AtaqueDeFogo.ATAQUE_DE_FOGO_HP;
    }
}
