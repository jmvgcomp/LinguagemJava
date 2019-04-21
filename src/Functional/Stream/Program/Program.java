package Functional.Stream.Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));

        //ex2:
        Stream<String> st2 = Stream.of("Maria", "Bob", "Alex");
        System.out.println(Arrays.toString(st2.toArray()));

        //ex3
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //ex4 sequencia de fibonacci
        Stream<Long> st4 = Stream.iterate(
                new Long[]{0L, 1L},
                p -> new Long[]{p[1], p[0]+p[1]}).
                map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }
}
