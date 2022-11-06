package pratica5decorator.personagens.escudos;

import pratica5decorator.personagens.Personagem;

public abstract class Escudo {
    private Escudo nextEscudo;

    public Personagem getPersonagemProtegido() {
        return personagemProtegido;
    }

    public void setPersonagemProtegido(Personagem personagemProtegido) {
        this.personagemProtegido = personagemProtegido;
    }

    private Personagem personagemProtegido;

    public Escudo(Personagem personagemProtegido) {
        this.personagemProtegido = personagemProtegido;
        this.nextEscudo = null;
    }

    public Escudo(Escudo nextEscudo, Personagem personagemProtegido) {
        this.nextEscudo = nextEscudo;
        this.personagemProtegido = personagemProtegido;
    }

    public Escudo getNextEscudo() {
        return nextEscudo;
    }

    public void setNextEscudo(Escudo nextEscudo) {
        this.nextEscudo = nextEscudo;
    }

    abstract public void tomaDano(Double dano);

    public void addEscudo(Escudo escudo) {
        if (this.getNextEscudo() != null) {
            this.getNextEscudo().addEscudo(escudo);
        } else {
            this.setNextEscudo(escudo);
        }
    }
}
