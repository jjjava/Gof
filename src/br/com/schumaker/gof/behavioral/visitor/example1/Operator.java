package br.com.schumaker.gof.behavioral.visitor.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Operator extends Employee {

    private int extension;

    public Operator(String name, double salary, int extension) {
        super(name, salary);
        this.extension = extension;
    }

    @Override
    public void accept(UpdateEmployee updateEmployee) {
        updateEmployee.update(this);
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
