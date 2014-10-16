package br.com.schumaker.nogof.structural.mvc.example1;

import br.com.schumaker.nogof.structural.mvc.example1.controller.FuncionarioController;
import br.com.schumaker.nogof.structural.mvc.example1.model.Funcionario;
import br.com.schumaker.nogof.structural.mvc.example1.view.FuncionarioView;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        FuncionarioController fc = new FuncionarioController();

        // Criando modelo
        Funcionario fun = new Funcionario(fc);
        fun.setNome("Carlos Silva");
        fun.setSalario(5600);

        // Criando a view
        FuncionarioView funView = new FuncionarioView(fc);

        // exibindo
        fc.index();
    }
}
