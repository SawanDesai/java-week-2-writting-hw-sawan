package homework_week_6;

import java.util.Scanner;

/**
 * write a java program to convert a decimal number to binary number.
 * input a Decimal number : 5
 * expected output
 * Binary number is :101
 */
public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        //Scanner declaration for reading input from cnsole
        System.out.println("Welcome to java program to convert decimal to binary numbers :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter decimal number ");
    int number = scanner.nextInt();
    convertDecimalToBinary(number);
            // closing the scanner object
        scanner.close();
    }
    //converting the decimal to binary
    public static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : "+ binary);
    }

}
