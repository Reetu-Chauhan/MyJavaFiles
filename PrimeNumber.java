import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            if (num==1){
                System.out.println("This is neither prime or not composite");
            }else {
                System.out.println("This is a prime number");
            }
        }else {
            System.out.println("This is not a prime number");
        }
    }
}
