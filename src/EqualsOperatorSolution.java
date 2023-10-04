public class EqualsOperatorSolution {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = "helloO";

        // This will print true, because str1 and str2 refer to the same object in memory
        System.out.println(str1 == str2);

        // This will print false, because str1 and str4 refer to different objects in memory
        System.out.println(str1 == str4);

        // This will print false, because str1 and str3 refer to different objects in memory
        System.out.println(str1 == str3);

        // This will print true, because the values of str1 and str2 are equal
        System.out.println(str1.equals(str2));

        // This will also print true, because the values of str1 and str3 are equal
        System.out.println(str1.equals(str3));
    }
}
