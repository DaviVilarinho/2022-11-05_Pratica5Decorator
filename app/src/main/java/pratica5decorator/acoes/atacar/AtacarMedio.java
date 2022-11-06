package pratica5decorator.acoes.atacar;

import pratica5decorator.personagens.Personagem;

public class AtacarMedio extends BaseAtacarStrategy implements AtacarStrategy {
    public AtacarMedio(Personagem personagemAtacante) {
        super(personagemAtacante);
    }

    @Override
    public Double atacar() {
        return this.getPersonagemAtacante().getAtaque();
    }
}
