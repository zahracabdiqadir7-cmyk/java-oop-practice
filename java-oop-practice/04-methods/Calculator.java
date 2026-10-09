public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    // Method-yada dhiman ee error-ka ii kenay:
    int subtract(int a, int b) {
        return a - b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum = " + calc.add(7, 3));
        System.out.println("Product = " + calc.multiply(7, 3));
        System.out.println("difference = " + calc.subtract(7, 3));
        System.out.println("quotient = " + calc.divide(7, 3));
    }
}