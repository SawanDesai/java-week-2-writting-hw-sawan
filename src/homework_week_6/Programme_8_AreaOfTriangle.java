package homework_week_6;

import java.util.Scanner;

/** write a programme to calculate the area of a triangle.
 *
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of a triangle:  ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of a tringle :  ");
        int height = scanner.nextInt();
        areaOfTrinagle(height,length);
        // closing the scanner object
        scanner.close();


    }

    public static void areaOfTrinagle (int length, int height){
        int area = (length*height)/2;
        System.out.println("The area of a triangle is  :"+ area);
    }
}
