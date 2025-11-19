import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Menu Driven Program");
        int choice;
        do {
            System.out.print("Enetr 1 to input student marks, 0 to stop: ");
            choice=sc.nextInt();
            if (choice==1) {
                System.out.print("Enter student's marks (0-100): ");
                int marks = sc.nextInt();
                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is good as well");
                } else {
                    System.out.println("Invalid marks! Please enter between 0-100.");
                }
            }else if (choice==0) {
                System.out.println("Program stopped.Goodbye!");
            }else {
                System.out.println("Invalid choice! Please enter 1 or 0.");
            }
        }while (choice!=0);
        sc.close();
    }
}
