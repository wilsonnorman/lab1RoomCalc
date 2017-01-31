import java.util.Scanner;


/**
 * Created by wilsonnorman on 1/30/2017.
 */
public class roomCal {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Perimeter");


        //3. ask for input
        System.out.print("Please enter length of classroom: ");
        double length = scan.nextDouble();

        System.out.print("Please enter width of classroom: ");
        double width = scan.nextDouble();

        double perimeter = 2 * length + 2 * width;

        //4. perform calculations
        double area = length * width;

        //5. output results
        System.out.println("The area is " + area);

        //6. close out resources
        scan.close();

        System.out.println("length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println ("perimeter" + perimeter );
        System.out.println("Continue?" +  " (y/n)" );




    }
}
