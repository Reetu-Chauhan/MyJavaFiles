import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to which you want to print the sum of the first natural number :");
        int num = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("The sum of the first "+num+" natural number is :"+ sum);
    }
}
