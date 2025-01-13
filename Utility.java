public class Utility {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Test isEven method
        System.out.println("Is 10 even? " + isEven(10));
    }
}
