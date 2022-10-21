package homework_week_6;

import java.util.Scanner;

/** Write a java program that take s number as input and print its multiple table up to 10
 *  *
 */
public class Programme_10_MultiplicationTable {
    public static void main(String[] args) {
        // scanner declaration for reading input from console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter the number :  ");
        int number = scanner.nextInt();
        multiplicationTableof(number);
        //closing the scanner object
        scanner.close();

    }
    public static void multiplicationTableof(int number){
        System.out.println(number + " x " + 1 + " = " + (number));
        System.out.println(number + " x " + 2 + " = " + (number * 2 ));
        System.out.println(number + " x " + 3 + " = " + (number * 3 ));
        System.out.println(number + " x " + 4 + " = " + (number * 4 ));
        System.out.println(number + " x " + 5 + " = " + (number * 5 ));
        System.out.println(number + " x " + 6 + " = " + (number * 6 ));
        System.out.println(number + " x " + 7 + " = " + (number * 7 ));
        System.out.println(number + " x " + 8 + " = " + (number * 8 ));
        System.out.println(number + " x " + 9 + " = " + (number * 9 ));
        System.out.println(number + " x " + 10 + " = " + (number * 10 ));


    }



}
