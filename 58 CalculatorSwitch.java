import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Calculator Switch");
        System.out.println("please enter your first number");
        int num1= input.nextInt();
        System.out.println("Please enter your second number");
        int num2= input.nextInt();
        System.out.println("Now , enter your operation : ");
        String operation= input.next();

        int result = switch (operation){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            default -> -1;
        };
        System.out.println("Your answer is "+result);
    }
}
