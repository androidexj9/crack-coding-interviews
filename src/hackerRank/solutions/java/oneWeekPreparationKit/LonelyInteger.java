package hackerRank.solutions.java.oneWeekPreparationKit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {

    private static int lonelyinteger(List<Integer> arr) {
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

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,3,2,1);
        List<Integer> listOfIntegers2 = Arrays.asList(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1);

        long startTime = System.currentTimeMillis();
        System.out.println("\nResult:" + lonelyinteger(listOfIntegers));
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (endTime-startTime));

        long startTime2 = System.currentTimeMillis();
        System.out.println("\nResult:" + lonelyinteger(listOfIntegers2));
        long endTime2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (endTime2-startTime2));
    }
}
