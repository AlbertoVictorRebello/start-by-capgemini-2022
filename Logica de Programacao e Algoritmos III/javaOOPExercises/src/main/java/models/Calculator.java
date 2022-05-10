package models;

public class Calculator {
    public double sumOperation(Double... numbers) {
        double result = 0d;

        for (double number : numbers
             ) {
            result += number;
        }
        return result;
    }

    public double subtractionOperation(Double... numbers) {
        double result = numbers[0];

        for (int i = 1 ; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public double multiplicationOperation(Double... numbers) {
        double result = 1.0;

        for (double number : numbers
        ) {
            result *= number;
        }
        return result;
    }

    public double divisionOperation(Double... numbers) {
        double result = numbers[0];

        for (int i = 1 ; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("Error: division by zero on argument index " + i);
            } else {
                result /= numbers[i];
            }

        }
        return result;
    }

}
