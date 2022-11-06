package pratica5decorator.acoes.atacar;

import pratica5decorator.personagens.Personagem;

public abstract class BaseAtacarStrategy implements AtacarStrategy {
    private Personagem personagemAtacante;

    public BaseAtacarStrategy(Personagem personagemAtacante) {
        this.personagemAtacante = personagemAtacante;
    }

    public Personagem getPersonagemAtacante() {
        return personagemAtacante;
    }

    abstract public Double atacar();
}
