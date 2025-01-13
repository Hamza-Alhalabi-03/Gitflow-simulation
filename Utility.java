public class Utility {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Square of 5: " + square(5));
    }
}
