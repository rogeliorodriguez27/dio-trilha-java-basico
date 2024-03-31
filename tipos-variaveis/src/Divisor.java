public class Divisor {
    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 3;
        
        int quotient = divide(dividend, divisor);
        
        System.out.println("Resultado de la división: " + quotient);
    }
    
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor no puede ser cero");
        }
        
        if (dividend == 0 || dividend < divisor) {
            return 0;
        }
        
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        
        return quotient;
    }
}
