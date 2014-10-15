package br.com.schumaker.gof.behavioral.visitor.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class UpdateSalary implements UpdateEmployee {
    
    @Override
    public void update(Manager m) {
        m.setSalary(m.getSalary() * 1.48);
    }
    
    @Override
    public void update(Operator p) {
        p.setSalary(p.getSalary() * 1.13);
    }
}
