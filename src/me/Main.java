package me;

import me.approximation.SumInterface;
import me.approximation.impl.RiemannSum;
import me.approximation.impl.TrapezoidalSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SumInterface[] approximationMethods = {new RiemannSum(), new TrapezoidalSum()};
        Arrays.asList(approximationMethods).stream().map(a -> a.calculate(0, 1, 2)).forEach(System.out::println);
    }
}
