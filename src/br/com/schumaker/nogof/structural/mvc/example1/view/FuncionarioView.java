package br.com.schumaker.nogof.structural.mvc.example1.view;

import br.com.schumaker.nogof.structural.mvc.example1.model.Funcionario;
import br.com.schumaker.nogof.structural.mvc.example1.controller.FuncionarioController;
import br.com.schumaker.nogof.structural.mvc.example1.model.AbstractModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hudson Schumaker
 */
public class FuncionarioView extends AbstractView {

    private FuncionarioController controller;

    public FuncionarioView(FuncionarioController controller) {
        this.controller = controller;
        this.controller.setView(this);
    }

    @Override
    public void display(AbstractModel model) {
        Funcionario fun = (Funcionario) model;
        System.out.println("Nome do funcionário: " + fun.getNome());
        System.out.println("Salário do funcionário: " + fun.getSalario());
        System.out.println("======================");
    }

    public void edit() {
        System.out.println("Entre com um novo nome....");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nome = br.readLine();
            System.out.println("Entre com um novo salário ....");
            String number = br.readLine();
            double salario = Double.parseDouble(number);
            Funcionario newfun = controller.edit(nome, salario);
            display(newfun);
        } catch (IOException | NumberFormatException e) {
            System.err.println(e);
        }
    }
}
