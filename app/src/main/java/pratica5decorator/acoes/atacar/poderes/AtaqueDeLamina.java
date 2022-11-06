package pratica5decorator.acoes.atacar.poderes;

import pratica5decorator.acoes.atacar.AtacarStrategy;

public class AtaqueDeLamina extends AtacarDecorator {
    public static Double BASE_ATAQUE_DE_LAMINA_HP = 0.5;

    public AtaqueDeLamina(AtacarStrategy ataque) {
        super(ataque);
    }

    @Override
    public Double atacar() {
        System.out.println("Lancei lâmina");
        return this.getAtaque().atacar() + AtaqueDeLamina.BASE_ATAQUE_DE_LAMINA_HP;
    }
}
