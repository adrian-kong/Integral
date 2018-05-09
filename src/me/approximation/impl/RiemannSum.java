package me.approximation.impl;

import me.approximation.SumInterface;

/**
 * @author Adrian on 09/05/18
 */
public class RiemannSum implements SumInterface {

    @Override
    public float calculate(float leftBound, float rightBound, int partitionAmount) {
        float approximation = 0;
        float difference = rightBound - leftBound;
        float dX = difference / (float) partitionAmount;
        int partition = (int) (difference / dX);
        int count = 0;
        while (count < partition) {
            float x = count * dX;
            float y = (float) Math.sin(x); // y value of function which is currently sin x
            approximation += y * dX;
            count++;
        }
        return approximation;
    }
}
