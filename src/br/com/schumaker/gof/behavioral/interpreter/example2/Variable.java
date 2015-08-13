package br.com.schumaker.gof.behavioral.interpreter.example2;

import java.util.Map;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class Variable implements Expression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if (null == variables.get(name)) {
            return 0; //Either return new Number(0).
        }
        return variables.get(name).interpret(variables);
    }
}
