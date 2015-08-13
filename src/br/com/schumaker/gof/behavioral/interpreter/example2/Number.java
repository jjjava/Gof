package br.com.schumaker.gof.behavioral.interpreter.example2;

import java.util.Map;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class Number implements Expression {
    private int number;
    
    public Number(int number)       
    { this.number = number; 
    }
    
    @Override
    public int interpret(Map<String,Expression> variables)  { 
        return number; 
    }
}
