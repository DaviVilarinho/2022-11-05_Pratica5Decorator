package pratica5decorator.acoes.atacar;

import pratica5decorator.personagens.Personagem;

public class AtacarForte extends BaseAtacarStrategy implements AtacarStrategy {
    public AtacarForte(Personagem personagemAtacante) {
        super(personagemAtacante);
    }

    @Override
    public Double atacar() {
        return this.getPersonagemAtacante().getAtaque() * 2;
    }
}
