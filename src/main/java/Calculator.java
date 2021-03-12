import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }
    public double sqrt(double a)
    {
        double result=0;
        logger.info("[SQUARE ROOT] - " + a);
        try {
            if (a < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of square root of negative number");
            } else {
                result = Math.sqrt(a);
            }
        }
            catch (ArithmeticException error) {
            System.out.println("Negative number");
            }
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }
    public long factorial(int a)
    {
        long f=1;
        logger.info("[FACTORIAL] - " + a);
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        logger.info("[RESULT - FACTORIAL] - " + f);
        return f;
    }
    public double naturalLog(int a)
    {
        double result=0;
        logger.info("[NATURAL LOG] - " + a);
        try {
            if (a < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of Natural log of negative number");
            } else {
                result = Math.log(a);
            }
        }
        catch (ArithmeticException error) {
            System.out.println("Negative number");
        }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }
    public double power(int a,int b)
    {
        logger.info("[POWER] - " + a + " " + b);
        logger.info("[RESULT - POWER] - " + Math.pow(a,b));
        return Math.pow(a,b);
    }
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        int choice,num1,num2;
        double ans;

        Scanner sc=new Scanner(System.in);

        while(true) {

            System.out.println("Enter 1 for Square Root\n 2 for Factorial\n 3 for Natural Log\n 4 for Power\n 5 to exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number");
                    num1 = sc.nextInt();
                    ans = calculator.sqrt(num1);
                    System.out.println("Square Root: " + ans);
                    break;

                case 2:
                    System.out.println("Enter the number");
                    num1 = sc.nextInt();
                    ans = calculator.factorial(num1);
                    System.out.println("Factorial: " + ans);
                    break;
                case 3:
                    System.out.println("Enter the number");
                    num1 = sc.nextInt();
                    ans = calculator.naturalLog(num1);
                    System.out.println("Natural Log: " + ans);
                    break;
                case 4:
                    System.out.println("Enter the first number");
                    num1 = sc.nextInt();
                    System.out.println("Enter the second number");
                    num2 = sc.nextInt();
                    ans = calculator.power(num1, num2);
                    System.out.println("Power: " + ans);
                    break;
                case 5:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid choice!");
            }

        }

    }
}
