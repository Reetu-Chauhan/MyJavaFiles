import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator ");
        System.out.println("please enter your base in cms ");
        double base=input.nextDouble();
        System.out.println("Please enter your perpendicular height in cms ");
        double height=input.nextDouble();

        double area=0.5*base*height;

        System.out.println("The area of your Triangle is : "+area);
    }

}
