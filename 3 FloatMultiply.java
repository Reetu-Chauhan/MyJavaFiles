import java.util.Scanner;

class FloatMultiply {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("we are doing Float Multiplication\n");
        System.out.println("Please enter first decimal number : ");
        double first= input.nextDouble();
        System.out.println("Please enter second decimal number : ");
        double second=input.nextDouble();

        double mul=first*second;
        System.out.println("\n Result is: "+mul);
    }
}
