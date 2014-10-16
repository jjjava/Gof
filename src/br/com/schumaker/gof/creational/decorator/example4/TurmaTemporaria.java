package br.com.schumaker.gof.creational.decorator.example4;

/**
 *
 * @author Hudson Schumaker
 */
public class TurmaTemporaria extends DecoradorTurma {

    Contrato contrato;

    public TurmaTemporaria(Turma turma) {
        super(turma);
    }

    @Override
    public void save() {
        // regras diferentes de salvar a turma
        this.getTurma().save();
    }

    @Override
    public void alterar() {
        // regras diferentes para alterar a turma
        this.getTurma().alterar();
    }

    @Override
    public void excluir() {
        // regras diferentes para alterar a turma
        this.getTurma().excluir();
    }

    public Contrato getContrato() {
        //Montar contrato
        return contrato;
    }
}
