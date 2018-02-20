package br.com.schumaker.gof.creational.builder.example1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hudson.schumaker
 */
public class Run {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 2, 1, 5);
        List<String> letras = Arrays.asList("b", "a","c", "d", "e");

        numbers.forEach(System.out::println);

        letras.stream().map(String::toUpperCase).sorted()
                .forEach(System.out::println);

    }
}
