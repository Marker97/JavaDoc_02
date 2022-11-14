/**
 * @author Marcus Marziano
 * This class test ArithmeticOperator's class
 */
public class Main {
    /**
     * This method run the program
     * @param args pass information to the program
     */
    public static void main(String[] args) {
       ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println("Sum operator: " + arithmeticOperators.sum(2,4));
        System.out.println("Subtraction operator: " + arithmeticOperators.sub(4,2));
        System.out.println("Multiplication operator: " + arithmeticOperators.mul(4,5));
        System.out.println("Divisor operator: " + arithmeticOperators.div(6,3));
    }
}