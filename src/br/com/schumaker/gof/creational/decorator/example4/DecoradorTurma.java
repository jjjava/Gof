package br.com.schumaker.gof.creational.decorator.example4;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class DecoradorTurma extends Turma {

    private Turma turma;

    public DecoradorTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public abstract void save();

    @Override
    public abstract void alterar();

    @Override
    public abstract void excluir();

    public Turma getTurma() {
        return this.turma;
    }
}
