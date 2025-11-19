import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.print("Please enter your numbers : ");
        int num = input.nextInt();
        int sum=OddSum(num);
        System.out.println("OddSum till "+num+" is : "+sum);

    }
    public static int OddSum(int num){
        int i = 1;
        int sum=0;
        while(i<=num){
            sum +=i;
            i +=2;
        }
        return sum;
    }

}
