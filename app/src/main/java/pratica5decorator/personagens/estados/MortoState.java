package pratica5decorator.personagens.estados;

import pratica5decorator.acoes.atacar.poderes.AtacarDecorator;
import pratica5decorator.personagens.Personagem;

public class MortoState implements PersonagemState {
    private Personagem personagem;

    public MortoState(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public PersonagemState recompensa(Double hp) {
        System.out.println("Não é possível ganhar mais nada porque o personagem está morto");
        return this;
    }

    @Override
    public PersonagemState tomarDano(Double hp) {
        System.out.println("Não é possível tomar dano porque o personagem está morto");
        return this;
    }

    @Override
    public void correr() {
        System.out.println("Não é possível correr porque o personagem está morto");
    }

    @Override
    public void pular() {
        System.out.println("Não é possível pular porque o personagem está morto");
    }

    @Override
    public Double atacar() {
        System.out.println("Não é possível atacar porque o personagem está morto");
        return 0.0;
    }

    @Override
    public void addPoder(Class<? extends AtacarDecorator> tipoPoder) {
        System.out.println("Não é possível adicionar poder ao personagem morto");
    }

    @Override
    public PersonagemState getProximoEstado() {
        return this;
    }
}
