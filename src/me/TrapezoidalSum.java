package me;

/**
 * @author Adrian on 09/05
 */
public class TrapezoidalSum implements ApproximationMethod {

    @Override
    public float calculate(float leftBound, float rightBound, int partitionAmount) {
        float approximation = 0;
        float difference = rightBound - leftBound;
        float dX = difference / (float) partitionAmount;
        int partition = (int) (difference / dX);
        int count = 0;
        float prevX = leftBound;
        while (count < partition) {
            float x = dX * (count + 1);
            float y = dX * ((float) Math.sin(x) + (float) Math.sin(prevX)) / 2; // (b - a)[f(a) + f(b)] / 2
            approximation += y;
            prevX = x;
            count++;
        }
        return approximation;
    }
}
