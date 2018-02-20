package br.com.schumaker.gof.creational.builder.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hudson.schumaker
 */
public class Run {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 2, 1, 5);
        List<String> letras = Arrays.asList("b", "a", "c", "d", "e");
        List<String> n = Arrays.asList("3", "4", "2", "1", "5");
        numbers.forEach(System.out::println);

        letras.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

        List<String> conv = new ArrayList<>();

        n.stream().map(Integer::parseInt).sorted().forEach(System.out::println);

        Arrays.asList("3", "4", "2", "1", "5").stream().map(Integer::parseInt)
                .sorted().forEach(FazNada::imprimi);
    }
}