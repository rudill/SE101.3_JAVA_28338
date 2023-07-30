import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
       
        Scanner scan = new Scanner(System.in);

        int num1,num2;
        float res;

        System.out.println("Enter first number --> ");
        num1 = scan.nextInt();
        System.out.println("Enter second number --> ");
        num2 = scan.nextInt();
        scan.close();
        try{

            res = num1/num2;
            System.out.println("Result is ->> "+res);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error "+e);
        }
    }
}
