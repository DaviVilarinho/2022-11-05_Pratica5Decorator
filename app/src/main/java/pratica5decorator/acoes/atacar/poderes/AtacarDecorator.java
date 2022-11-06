package pratica5decorator.acoes.atacar.poderes;

import pratica5decorator.acoes.atacar.AtacarStrategy;

public abstract class AtacarDecorator implements AtacarStrategy {
    public AtacarDecorator(AtacarStrategy ataque) {
        this.ataque = ataque;
    }

    public AtacarStrategy getAtaque() {
        return ataque;
    }

    private AtacarStrategy ataque;
}
