package pratica5decorator.acoes.atacar;

import pratica5decorator.personagens.Personagem;

public class AtacarFraco extends BaseAtacarStrategy implements AtacarStrategy {
    public AtacarFraco(Personagem personagemAtacante) {
        super(personagemAtacante);
    }

    @Override
    public Double atacar() {
        return this.getPersonagemAtacante().getAtaque() / 2;
    }
}
