package br.com.schumaker.nogof.structural.mvc.example1.controller;

import br.com.schumaker.nogof.structural.mvc.example1.model.Funcionario;
import br.com.schumaker.nogof.structural.mvc.example1.view.AbstractView;
import br.com.schumaker.nogof.structural.mvc.example1.view.FuncionarioView;
import br.com.schumaker.nogof.structural.mvc.example1.model.AbstractModel;

/**
 *
 * @author Hudson Schumaker
 */
public class FuncionarioController extends AbstractController {

    private Funcionario modelFun;
    private FuncionarioView viewFun;

    @Override
    public void init(AbstractModel model, AbstractView view) {
        this.modelFun = (Funcionario) model;
        this.viewFun = (FuncionarioView) view;
    }

    public Funcionario edit(String nome, double salario) {
        this.modelFun.setNome(nome);
        this.modelFun.setSalario(salario);
        return this.modelFun;
    }

    public void setModel(Funcionario fun) {
        this.modelFun = fun;
    }

    public void setView(FuncionarioView view) {
        this.viewFun = view;
    }

    public void index() {
        this.viewFun.display(this.modelFun);
    }
}
