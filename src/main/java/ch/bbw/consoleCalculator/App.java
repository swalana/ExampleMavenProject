package ch.bbw.consoleCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculator\n------------------" );
        Calculator calculator = new Calculator();
           
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("erste Zahl: ");
//        double nr1 = scanner.nextDouble();
//        System.out.println("zweite Zahl: ");
//        double nr2 = scanner.nextDouble();
        
        double nr1 = 1;
        double nr2 = 5.3;
        double result1 = calculator.calculateSum(nr1, nr2);
        System.out.println(nr1 + " + " + nr2 + " = " + result1);
        double nr3 = 6;
        double nr4 = 3.1;
        double result2 = calculator.calculateSubtraction(nr3, nr4);
        System.out.println(nr3 + " - " + nr4 + " = " + result2);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE);
        
    
    }
}
