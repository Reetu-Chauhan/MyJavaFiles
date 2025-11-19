import java.util.Scanner;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter the number up to you want to print the pattern: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
