package ch.bbw.consoleCalculator;

import java.util.Scanner;

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
        double result = calculator.calculateSum(nr1, nr2);
        System.out.println(result);
    }
}
