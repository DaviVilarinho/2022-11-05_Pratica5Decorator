package pratica5decorator.personagens.estados;

import pratica5decorator.acoes.atacar.poderes.AtacarDecorator;

public interface PersonagemState {
    PersonagemState recompensa(Double hp);
    PersonagemState tomarDano(Double hp);
    void correr();
    void pular();
    Double atacar();
    PersonagemState getProximoEstado();

    void addPoder(Class<? extends AtacarDecorator> tipoPoder);
}
