package br.com.schumaker.gof.behavioral.visitor.example1;

import java.util.ArrayList;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Departament implements Upgradeable{

    private String name;
    private ArrayList<Employee> employees;

    public Departament(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }
    
    @Override
    public void accept(UpdateEmployee updateEmployee) {
        for(Employee employee: employees){
            employee.accept(updateEmployee);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
