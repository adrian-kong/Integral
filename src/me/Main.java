package me;

public class Main {

    public static void main(String[] args) {
        /**
         * [0,1] bounds of the function
         */

        /**
         * amount of partitions
         * hence the more the partition, the greater the accuracy
         */


        /**
         * dX of the partition. ie length of partition
         */


        /**
         * total amount of partition in the given bounds
         */


        /**
         * integral approximation
         */


        /**
         * iteration count
         */


        /**
         * while current count is less than total partition count between the two bounds
         * add partition area by calculating the y value from the x value of the partition
         * multiplied by the length given by dx.
         */


        /**
         * print result
         */
        System.out.println(new RiemannSum().calculate(0,1,5));
    }
}
