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

    public static int square(int number) {
        return number * number;
    }

    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot accept negative numbers");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {

        System.out.println("Is 10 even? " + isEven(10));

        System.out.println("Reverse of 'hello': " + reverseString("hello"));
        
        System.out.println("Square of 5: " + square(5));

        System.out.println("Factorial of 4: " + factorial(4));

        System.out.println("Is 'radar' a palindrome? " + isPalindrome("radar"));

        System.out.println("Maximum of 3, 7, and 5: " + maxOfThree(3, 7, 5));
    }
}
