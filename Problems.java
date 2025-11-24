class Problems {
    static int calculator(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;

            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    String evenOdd(int num) {
        if (num % 2 == 0) {
            return "Even number";
        } else {
            return "Odd number";
        }
    }

    int fibonacci(int num) {
        int a = 0, b = 1;
        for (int i = 2; i <= num; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    int reverseNumber(int num) {
        int result = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num = num / 10;
        }
        return result;
    }

}
