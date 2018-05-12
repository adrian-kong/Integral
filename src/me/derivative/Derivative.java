package me.derivative;

/**
 * @author Adrian on 12/05
 */
public class Derivative {

    public static float calculate(float x) {
        float h = 0.000001f;
        return ((float) Math.sin(x + h) - (float) Math.sin(x)) / h;
    }
}
