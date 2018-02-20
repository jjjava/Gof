
package br.com.schumaker.gof.creational.builder.example1;

import java.util.function.BiFunction;

/**
 *
 * @author hudson.schumaker
 * @param <T>
 */
public class Builder<T> {

    private final BiFunction<Integer, String, T> builder;

    private int wheelsOrZero;
    private String colorOrNull;

    Builder(final BiFunction<Integer, String, T> builder) {
        this.builder = builder;
    }

    public T build() {
        return builder.apply(wheelsOrZero, colorOrNull);
    }

    public Builder<T> setWheels(final int wheels) {
        wheelsOrZero = wheels;
        return this;
    }

    public Builder<T> setColor(final String color) {
        colorOrNull = color;
        return this;
    }
}
