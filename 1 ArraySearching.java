import java.util.Scanner;

class ArraySearching {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={3,6,8,87,65,25,48,98,69,51,};
        System.out.println("Welcome to array searching\n");
        System.out.println("Enter the number you want to search");
        int num= input.nextInt();
        boolean isFound=isFound(arr,num);
        if(isFound){
            System.out.println("Your number is found in the array");
        }else{
            System.out.println("Your number is not found in the array");
        }

    }
    public static boolean isFound(int[]arr,int num){
        int index=0;
        while (index< arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;


    }
}
