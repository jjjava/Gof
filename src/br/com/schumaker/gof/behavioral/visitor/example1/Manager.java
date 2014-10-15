package br.com.schumaker.gof.behavioral.visitor.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Manager extends Employee {

    private String password;

    public Manager(String name, double salary, String password) {
        super(name, salary);
        this.password = password;
    }

    @Override
    public void accept(UpdateEmployee updateEmployee) {
       updateEmployee.update(this);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
