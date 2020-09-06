package ua.zp.brainacad;

import javax.swing.*;
import java.beans.JavaBean;
import java.util.Arrays;

public class Lab4Test {
    public static void main(String[] args) {
        //1.1
        float[] firstArray = new float[4];
        firstArray[0] = 23.2f;
        firstArray[3] = 12.5f;

        // TODO init it's array by new with size 4.
        // TODO insert some value to start of array and to end of array.

        int[] intArray = {2, 4, 3, 5}; // TODO init and fill it's array with any values. Use {} syntax.

        //1.2
        // TODO copy "intArray". Use copyOf...
        int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length);

        //1.4
        // TODO print "intArrayCopy", use Arrays toString.
//        System.out.println(java.util.Arrays.toString(intArray));
//        System.out.println(java.util.Arrays.toString(intArrayCopy));

        //1.3
        // TODO sort "intArrayCopy", use Arrays sort.
//        Arrays.sort(intArrayCopy);
//        System.out.println(java.util.Arrays.toString(intArrayCopy));

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
//        System.out.println(java.util.Arrays.equals(intArray, intArrayCopy));

        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
//        for (int value: testArray) {
//            System.out.print(value + " ");
//        }

        // 2.1)
        // TODO calc sum of all array elements and print result.
//        int sum = 0;
//        for (int i = 0; i < testArray.length; i++) {
//        sum = sum + testArray[i];}
//        System.out.println(sum);
//        }
        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
//        int sum2 = 0;
//        for (int i = 0; i < testArray.length; i++) {
//            if (testArray[i] % 2 != 0)
//                sum2 += testArray[i];
//            }
//            System.out.println(sum2);
        // 2.3)
        // TODO find max value in array.
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < testArray.length; i++) {
//        max = Math.max(max, testArray[i]);
//        }
//        System.out.println("Максмимальный элемент в массиве testArray: " + max);

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        int[][] array1 = new int[3][4];
//        array1[0][0] = 1;
//        array1[0][1] = 1;
//        array1[0][2] = 1;
//        array1[0][3] = 1;
//        array1[1][0] = 2;
//        array1[1][1] = 2;
//        array1[1][2] = 2;
//        array1[1][3] = 2;
//        array1[2][0] = 3;
//        array1[2][1] = 3;
//        array1[2][2] = 3;
//        array1[2][3] = 3;
        //3.2
        // TODO fill array with any numbers in cycles.
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = i;
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        //3.3
        // TODO calc sum of all array elements and print result.
//        int sum1 = 0;
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                sum1 += array1[i][j];
//            }
//        }
//        System.out.println("Сумма всех чисел двумерного массива: " + sum1);
        // PART 4*
        long[][] matrix = new long[9][9];
//        System.out.println(Arrays.toString(matrix));
//        System.out.println(matrix.length);
        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }
        for (long[] longs : matrix) {
            //System.out.println(longs);
            System.out.println(Arrays.toString(longs));
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (2 < i && i <= 5 && (j + 1) % 3 == 0) {
                    sum += matrix[i][j];
                    System.out.println(j +" = " +matrix[i][j]);
                }
            }
        }
        System.out.println(sum);




    }
}




