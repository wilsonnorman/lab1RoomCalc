import java.util.Scanner;


/**
 * Created by wilsonnorman on 1/30/2017.
 * This code in to calculates the area of a room
 */
public class roomCal {
    public static void main (String [] args) {

        // Set up coding
        Scanner scan = new Scanner (System.in);
        // Tell user what to expect
        System.out.println("Come one, come all and calculate your room with a push of a button");

        System.out.println("Perimeter");

        String answer = "y";

        while (answer.equals("y")) {

            // ask the user or input
            System.out.print("Please enter length of classroom: ");
            double length = scan.nextDouble();

            System.out.print("Please enter width of classroom: ");
            double width = scan.nextDouble();

            double perimeter = 2 * length + 2 * width;

            //calculations
            double area = length * width;

            //results
            System.out.println("The area is " + area);


            System.out.println("length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area: " + area);
            System.out.println("perimeter " + perimeter);

            //6. close coding out
            System.out.println("Continue?" + " (y/n)");
            answer = scan.next();
        }


              scan.close();

             System.out.println("Thank you, and have a wonderful day");





















    }
}
