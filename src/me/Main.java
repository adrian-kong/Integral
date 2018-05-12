package me;

import me.derivative.Derivative;
import me.integral.approximation.SumInterface;
import me.integral.approximation.impl.RiemannSum;
import me.integral.approximation.impl.TrapezoidalSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SumInterface[] approximationMethods = {new RiemannSum(), new TrapezoidalSum()};
//        Arrays.asList(approximationMethods).stream().map(a -> a.calculate(0, 1, 2)).forEach(System.out::println);

        System.out.println(Derivative.calculate(5f));

    }
}
