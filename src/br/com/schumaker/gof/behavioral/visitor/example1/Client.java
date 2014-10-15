package br.com.schumaker.gof.behavioral.visitor.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client {

    public static void main(String[] args) {
        List<Departament> departments = new ArrayList<>();
        
        UpdateEmployee updateEmployee = new UpdateSalary();
        
        Departament depto1 = new Departament("IT");
        Departament depto2 = new Departament("HR");
        departments.add(depto1);
        departments.add(depto2);

        Manager manager1 = new Manager("Hudson Schumaker", 1800.0, "secret");
        Manager manager2 = new Manager("Hugo Schumaker", 1500.0, "boss");
        Manager manager3 = new Manager("Humberto Schumaker", 1900.0, "love");

        Operator op1 = new Operator("Elise Xavier", 1000.0, 33);
        Operator op2 = new Operator("Luiza Prado", 1000.0, 51);

        depto1.getEmployees().add(manager1);
        depto1.getEmployees().add(op1);

        depto2.getEmployees().add(manager2);
        depto2.getEmployees().add(manager3);
        depto2.getEmployees().add(op2);
        
        for(Departament d : departments){
            d.accept(updateEmployee);
        }
        
        for(Departament d : departments){
           for(Employee e :d.getEmployees()){
               System.out.println("Name: "+e.getName()+" - Salary: "+e.getSalary());
           }
        }
    }
}
