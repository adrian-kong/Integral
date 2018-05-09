package me;

/**
 * @author Adrian
 */
public class RiemannSum {

    public float calculate(float leftBound, float rightBound, int partitionAmount) {
        float difference = rightBound - leftBound;
        float dX = difference / (float) partitionAmount;
        int partition = (int) (difference / dX);
        float approximation = 0;
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
