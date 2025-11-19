import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Enter first number (a) : ");
        double a = sc.nextInt();
        System.out.println("Enter second number (b) : ");
        double  b= sc.nextInt();
        System.out.println("Choose Operation : ");
        System.out.println("1: Addition(+)");
        System.out.println("2: Subtraction(-)");
        System.out.println("3: Multiplication(*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");
        System.out.print("Enter your choice(1-5) : ");

        int choice = sc.nextInt();
        double result;
        switch (choice){
            case 1 :
                result = a+b;
                System.out.println("Result : " +result);
                break;
            case 2 :
                result = a-b;
                System.out.println("Result : "+result);
                break;
            case 3 :
                result = a*b;
                System.out.println("Result : "+result);
                break;
            case 4 :
                if(b != 0){
                    result = a/b;
                    System.out.println("Result : "+result);
                }else {
                    System.out.println("Error : Division by zero !");
                }
                break;
            case 5 :
                result = a%b;
                System.out.println("Result : "+result);
                break;
            default:
                System.out.println("Invalid Operation Choice ");
        }
    }
}
