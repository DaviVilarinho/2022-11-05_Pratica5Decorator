package pratica5decorator.acoes.atacar;

public class AtacarForte implements AtacarStrategy {
    @Override
    public void atacar() {
        System.out.println("Atacando Forte");
    }
}
