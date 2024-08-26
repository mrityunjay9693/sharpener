package BasicCoding.src.local.tilde.sharpener.BasicCoding;

import java.util.Scanner;

public class SwapTwoVariables {

    public static void swap(int num1, int num2) {
        // Main Logic
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Numbers after swap");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Numbers before swap:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        swap(num1, num2);
    }
}
