public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperan , int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperan  + secondOperand;
            case SUBTRACTION:
                return firstOperan  - secondOperand;
            case MULTIPLICATION:
                return firstOperan  * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperan  / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}