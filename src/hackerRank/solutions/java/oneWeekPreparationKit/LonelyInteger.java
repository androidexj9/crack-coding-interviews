package hackerRank.solutions.java.oneWeekPreparationKit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {

    private static int lonelyinteger(List<Integer> arr) {
        List<Integer> aux = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
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
        System.out.println("Result:" + lonelyinteger(listOfIntegers));
    }
}
