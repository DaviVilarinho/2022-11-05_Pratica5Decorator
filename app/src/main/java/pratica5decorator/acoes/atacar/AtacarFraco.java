package pratica5decorator.acoes.atacar;

public class AtacarFraco implements AtacarStrategy {
    @Override
    public void atacar() {
        System.out.println("Atacando Fraco");
    }
}
