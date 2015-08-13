package br.com.schumaker.gof.behavioral.interpreter.example2;

import java.util.Map;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;
    public Plus(Expression left, Expression right) { 
        leftOperand = left; 
        rightOperand = right;
    }
		
    @Override
    public int interpret(Map<String,Expression> variables)  { 
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
