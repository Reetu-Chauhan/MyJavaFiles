import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Print All Even Number Till n");
        System.out.print("Please Enter the Number : ");
        int num = input.nextInt();
        for (int i = 1; i <num ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
