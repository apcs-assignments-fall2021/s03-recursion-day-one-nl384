public class MyMain {
    // This is the example problem that we did in class
    // This uses recursion to calculate the factorial method
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    public static int factorial(int x) {
        // Base case
        if (x == 1) {
            return 1;
        }
        // Recursive call
        else {
            int subproblem = factorial(x-1);
            int answer = x * subproblem;
            return answer;
        }
    }

    // Write a method that uses recursion to calculate the n-th term
    // of the following arithmetic sequence: 3, 5, 7, 9, ...
    // An arithmetic sequence is a sequence where the next number is
    // some set amount larger than the previous number
    // Examples:
    // arithmeticSequence(4) => 9
    // arithmeticSequence(1) => 3
    public static int arithmeticSequence(int n) {
//        // YOUR CODE HERE
//        return -1;
        if (n == 1) {
            return 3;
        }
        else {
            return arithmeticSequence(n-1) + 2;
        }
    }

    // Write a method that uses recursion to count the number
    // of times lowercase 'x' shows up in a String
    // Examples:
    // countX("hix") => 1
    // countX("xoxo") => 2

    // Hint: to make the subproblem smaller, make the String shorter!
    // Hint 2: multiple recursive cases might be helpful!
    public static int countX(String str) {
//        // YOUR CODE HERE
//        return -1;
        if (str.length() == 0) {
            return 0;
        }
        else if (str.charAt(0) == 'x') {
            return 1 + (countX(str.substring(1)));
        }
        else {
            return countX(str.substring(1));
        }
    }





    // Methods for homework:
    // Write a method that calculate the exponents, given a base
    // and a power
    // Examples:
    // exponent(2, 5) = 2 * 2 * 2 * 2 * 2 = 32
    // exponent(5, 2) = 5 * 5 = 25
    // exponent(4, 0) = 1
    public static int exponent(int base, int power) {
//        // YOUR CODE HERE
//        return -1;
        if (power == 0) {
            return 1;
        }
        else {
            return base * exponent(base, power - 1);
        }
    }

    // Write a method that uses recursion to count the number
    // of times "hi" shows up in a String
    // Examples:
    // countHi("hix") => 1
    // countHi("hellohihi") => 2
    public static int countHi(String str) {
//        // YOUR CODE HERE
//        return -1;
        if (str.length() < 2) {
            return 0;
        }
        else if (str.substring(0, 2).equals("hi")) {
            return 1 + (countHi(str.substring(2)));
        }
        else {
            return countHi(str.substring(1));
        }
    }


    public static void main(String[] args) {
        // Optional: Write some code here to test your methods!
        System.out.println(factorial(5));
    }
}
