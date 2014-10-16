package br.com.schumaker.gof.creational.decorator.example4;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Turma turma = new TurmaBasica();

        turma.setIdturma(1);
        turma.setNome("Turma temporária");

        TurmaTemporaria tempTurma = new TurmaTemporaria(turma);
        tempTurma.save();
        Contrato contato = tempTurma.getContrato();
    }
}
