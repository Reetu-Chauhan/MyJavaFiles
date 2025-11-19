import java.util.Scanner;

class TernaryOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Ternary Operator\n");
        System.out.println("Please enter your fist number");
        int num1= input.nextInt();
        System.out.println("please enter your second number");
        int num2= input.nextInt();

//        if(num1>num2){
//            System.out.println(num1+" is the greatest number");
//        }else{
//            System.out.println(num2+" is the greatest number");
//        }
        int greaterNumber=num1>num2 ? num1 : num2;
        System.out.println(greaterNumber+" is the greatest number");
    }
}
