package br.com.schumaker.gof.behavioral.interpreter.example2;

import java.util.Map;

/**
 *
 * @author hudson.sales
 */
public interface Expression {
    public int interpret(Map<String,Expression> variables);
}