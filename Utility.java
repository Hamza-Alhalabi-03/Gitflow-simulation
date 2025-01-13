public class Utility {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        // Test isEven method
        System.out.println("Is 10 even? " + isEven(10));

        System.out.println("Reverse of 'hello': " + reverseString("hello"));
    }
}
