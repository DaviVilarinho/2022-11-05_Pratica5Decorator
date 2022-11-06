package pratica5decorator.personagens.estados;

public interface PersonagemState {
    PersonagemState recompensa(Double hp);
    PersonagemState tomarDano(Double hp);
    void correr();
    void pular();
    void atacar();
    PersonagemState getProximoEstado();
}
