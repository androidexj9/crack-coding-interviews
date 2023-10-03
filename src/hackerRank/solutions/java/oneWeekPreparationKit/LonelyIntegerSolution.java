package hackerRank.solutions.java.oneWeekPreparationKit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.youtube.com/watch?v=k1i6eIpeXak&ab_channel=JAVAAID-CodingInterviewPreparation

public class LonelyIntegerSolution {

    private static int lonelyInteger(List<Integer> arr) {
        List<Integer> aux = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            //System.out.println(arr.get(i));
            if (aux.contains(arr.get(i))) {
                aux.remove(arr.get(i));
            } else {
                aux.add(arr.get(i));
            }
        }
        return aux.get(0);
    }

    // int array [] =  {1, 2, 3, 4, 3, 2, 1}
    // =   1   ^   2   ^   3   ^  4 ^ 3 ^ 2 ^ 1
    // = (1^1) ^ (2^2) ^ (3^3) ^ (4)
    // =   0   ^   0   ^   0   ^ 4
    // = (0^0) ^ (0^4)
    // =   0   ^   4
    // = 4
    private static int lonelyInteger_XOR(int[] a) {
        int tmp = a[0];
        for (int i = 1; i < a.length; i++) {
            tmp ^= a[i];
            //System.out.println("tmp:" + tmp + " element: " + a[i]);
        }
        return tmp;
    }

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,3,2,1);
        List<Integer> listOfIntegers2 = Arrays.asList(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1);
        List<Integer> listOfIntegers3 = Arrays.asList(0, 0, 1, 2, 1);

        long startTime = System.currentTimeMillis();
        System.out.println("\nResult:" + lonelyInteger(listOfIntegers2));
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (endTime-startTime));

        // XOR witch conversion
        long startTime2 = System.currentTimeMillis();
        System.out.println("\nResult:" + lonelyInteger_XOR(listOfIntegers2.stream().mapToInt(i->i).toArray()));
        long endTime2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (endTime2-startTime2));

        // XOR
        long startTime3 = System.currentTimeMillis();
        System.out.println("\nResult:" + lonelyInteger_XOR(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
        long endTime3 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (endTime3-startTime3));
    }
}
