package pratica5decorator.personagens.estados;

import pratica5decorator.acoes.atacar.AtacarStrategy;
import pratica5decorator.acoes.atacar.poderes.AtacarDecorator;

public abstract class VivoState implements PersonagemState {
    private AtacarStrategy atacarStrategy;

    public VivoState(AtacarStrategy atacarStrategy) {
        this.atacarStrategy = atacarStrategy;
    }

    public AtacarStrategy getAtacarStrategy() {
        return atacarStrategy;
    }

    public void setAtacarStrategy(AtacarStrategy atacarStrategy) {
        this.atacarStrategy = atacarStrategy;
    }

    public void addPoder(Class<? extends AtacarDecorator> tipoPoder) {
        try {
            this.setAtacarStrategy(tipoPoder.getConstructor(AtacarStrategy.class).newInstance(atacarStrategy));
        } catch (Exception e) {
            System.out.println("Não é possível usar " + tipoPoder.getName() + " para decorar o ataque");
        }
    }
}
