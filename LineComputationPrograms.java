import java.util.Scanner;

public class LineComputationPrograms {
    public static void main(String[] args) {

        System.out.println("Line Computation: UC1: Compute length of Line");

        int x1;     // X co-ordinate of first point
        int x2;     // X co-ordinate of second point
        int y1;     // Y co-ordinate of first point
        int y2;     // Y co-ordinate of second point

        // TAKING CO-ORDINATES FOR POINT 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Co-ordinates x1 and y1: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        //TAKING CO-ORDINATES FOR POINT 2
        System.out.print("Enter Co-ordinates x2 and y2: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        // CALCULATIONS FOR GETTING THE LENGTH OF THE LINE WITH THE GIVEN TWO CO-ORDINATES
        double ValOfx = Math.pow((x2 - x1), 2);
        double ValOfy = Math.pow((y2 - y1), 2);

        double LengthOfLine = Math.sqrt((ValOfx + ValOfy));

        // PRINTING OUT THE LENGTH
        System.out.println("Length Of the Line is: " + LengthOfLine);
    }
}
