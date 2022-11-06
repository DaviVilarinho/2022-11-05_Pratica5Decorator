package pratica5decorator.personagens.escudos;

import pratica5decorator.personagens.Personagem;

public class EscudoProtetor extends Escudo {
    private Double hpProtegido;

    public EscudoProtetor(Personagem personagemProtegido) {
        super(personagemProtegido);
        this.hpProtegido = 0.0;
    }
    public EscudoProtetor(Personagem personagemProtegido, Double hpProtegido) {
        super(personagemProtegido);
        this.hpProtegido = hpProtegido;
    }

    public EscudoProtetor(Escudo nextEscudo, Personagem personagemProtegido, Double hpProtegido) {
        super(nextEscudo, personagemProtegido);
        this.hpProtegido = hpProtegido;
    }

    @Override
    public void tomaDano(Double dano) {
        if (dano - hpProtegido <= 0.0) {
            return;
        }
        if (this.getNextEscudo() != null) {
            this.getNextEscudo().tomaDano(dano - hpProtegido);
        } else {
            this.getPersonagemProtegido().setHp(this.getPersonagemProtegido().getHp() + hpProtegido - dano);
        }
    }
}
