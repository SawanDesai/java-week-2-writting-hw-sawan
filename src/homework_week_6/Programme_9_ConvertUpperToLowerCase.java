package homework_week_6;

import java.util.Scanner;

/** Write a programme to convert the upper case to lower case
 *
 */
public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string :  ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercasetoLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }
    public void convertUppercasetoLowerCase(String text){
        System.out.println("The lowercase value is = " +text.toLowerCase());
    }
}
