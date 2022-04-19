package models;

public class ScientificCalculator extends Calculator{
    public double squareRootOperation(double number) {
        double result = 1.0;

        if (number < 0) {
            throw new ArithmeticException("Error: invalid operation for a negative number.");
        } else {
            return result = Math.sqrt(number);
        }
    }

    public double powOperation(double... numbers) {
        double result = numbers[0];

        for (int i = 1 ; i < numbers.length; i++) {
            result = Math.pow(result, numbers[i]);
        }
        return result;
    }
}
