package pratica5decorator.acoes.correr;

public class CorrerMedio implements CorrerStrategy {
    @Override
    public void correr() {
        System.out.println("Correndo Médio");
    }
}
