package lastterm.year2223.de4.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestVectors {
    public static void main(String[] args) {
        /* TODO */
        double[] arr1 = {12.5, 14.9, 87.4, 55.8};
        ArrayVector vec1 = new ArrayVector(arr1);

        double[] arr2 = {2.0, 4.0, 5.0, 6.0};
        ArrayVector vec2 = new ArrayVector(arr2);

        System.out.println("TEST ARRAY VECTOR:");
        System.out.println("\nVector1: " + vec1);
        System.out.println("\nVector2: " + vec2);
        System.out.println("\nLength of vector1: " + vec1.length());
        System.out.println("\nLength of vector2: " + vec2.length());
        System.out.println("\nVector1 append 5.6:");
        vec1.append(5.6);
        System.out.println(vec1);
        System.out.println("\nVector2 append 7.8");
        vec2.append(7.8);
        System.out.println(vec2);
        System.out.println("\nVector1 insert 2.0 at index 1:");
        vec1.insert(2.0, 1);
        System.out.println(vec1);
        System.out.println("\nVector1 remove index 4:");
        vec1.remove(4);
        System.out.println("\nVector2 insert 4.5 at index 0:");
        vec2.insert(4.5, 0);
        System.out.println(vec2);
        System.out.println("\nVector2 remove index 4:");
        vec2.remove(4);
        System.out.println(vec2);
        System.out.println("\nMagnitude of vector1: " + vec1.magnitude());
        System.out.println("\nDistance from vector1 to vector2: " + vec1.distanceTo(vec2));
        System.out.println("Minus vector1 with vector2: ");
        System.out.println(vec1.minus(vec2));
        System.out.println("\nPlus vector1 with vector2: ");
        System.out.println(vec1.plus(vec2));
        System.out.println("\nScale vector1 by 3: ");
        System.out.println(vec1);
        System.out.println("\nDot vector1 with vector2: " + vec1.dot(vec2));

        System.out.println();

        List<Double> l1 = new ArrayList<>();
        List<Double> l2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){
            l1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++){
            l2.add(arr2[i]);
        }

        ListVector v1 = new ListVector(l1);
        ListVector v2 = new ListVector(l2);

        System.out.println("\nTEST LIST VECTOR:");
        System.out.println("\nVector1: " + v1);
        System.out.println("\nVector2: " + v2);
        System.out.println("\nLength of vector1: " + v1.length());
        System.out.println("\nLength of vector2: " + v2.length());
        System.out.println("\nVector1 append 5.6:");
        v1.append(5.6);
        System.out.println(v1);
        System.out.println("\nVector2 append 7.8");
        v2.append(7.8);
        System.out.println(v2);
        System.out.println("\nVector1 insert 2.0 at index 1:");
        v1.insert(2.0, 1);
        System.out.println(v1);
        System.out.println("\nVector1 remove index 4:");
        v1.remove(4);
        System.out.println("\nVector2 insert 4.5 at index 0:");
        v2.insert(4.5, 0);
        System.out.println(v2);
        System.out.println("\nVector2 remove index 4:");
        v2.remove(4);
        System.out.println(v2);
        System.out.println("\nMagnitude of vector1: " + v1.magnitude());
        System.out.println("\nDistance from vector1 to vector2: " + v1.distanceTo(v2));
        System.out.println("Minus vector1 with vector2: ");
        System.out.println(v1.minus(v2));
        System.out.println("\nPlus vector1 with vector2: ");
        System.out.println(v1.plus(v2));
        System.out.println("\nScale vector1 by 3: ");
        System.out.println(v1);
        System.out.println("\nDot vector1 with vector2: " + v1.dot(v2));


    }
}
