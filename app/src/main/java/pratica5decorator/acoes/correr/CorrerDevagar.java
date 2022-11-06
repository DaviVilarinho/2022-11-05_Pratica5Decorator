package pratica5decorator.acoes.correr;

public class CorrerDevagar implements CorrerStrategy {
    @Override
    public void correr() {
        System.out.println("Correndo Devagar");
    }
}
