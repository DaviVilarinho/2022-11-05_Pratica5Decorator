package pratica5decorator.acoes.atacar;

public class AtacarMedio implements AtacarStrategy {
    @Override
    public void atacar() {
        System.out.println("Atacando Médio");
    }
}
