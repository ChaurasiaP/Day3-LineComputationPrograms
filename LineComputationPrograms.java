import java.util.Scanner;

public class LineComputationPrograms {
    static double LengthOfLine1;
    static double LengthOfLine2;

    public static void main(String[] args) {


        System.out.println("Line Computation: Using Method");

        // VARIABLES TO CALCULATE LINE 1
        int x1, y1;     //  co-ordinates of first point
        int x2, y2;     //  co-ordinates of second point

        // VARIABLES TO CALCULATE LINE 2
        int x3, y3;     // co-ordinates of third point
        int x4, y4;     // co-ordinates of fourth point


        //TAKING INPUTS FOR COMPUTING LINE 1
        System.out.println("Co-ordinates for line 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Co-ordinates x1 and y1: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.print("Enter co-ordinates x2 and y2: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        // CALCULATIONS FOR LINE1

        double ValOfx = Math.pow((x2 - x1), 2);
        double ValOfy = Math.pow((y2 - y1), 2);
        LengthOfLine1 = Math.sqrt((ValOfx + ValOfy));
        // END OF CALCULATIONS FOR LINE 1.

        // TAKING INPUTS FOR LINE 2
        System.out.println("Co-ordinates for line 2");
        System.out.print("Enter co-ordinates x3 and y3: ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        System.out.print("Enter co-ordinates x4 and y4: ");
        x4 = sc.nextInt();
        y4 = sc.nextInt();

        // CALCULATIONS FOR LINE 2
        double ValOfX = Math.pow((x4 - x3), 2);
        double ValOfY = Math.pow((y4 - y3), 2);
        LengthOfLine2 = Math.sqrt((ValOfX + ValOfY));
        // END OF CALCULATIONS FOR LINE 2

        checkLine(LengthOfLine1, LengthOfLine2);
    }

    public static void checkLine(double length1, double length2) {

        Double L1 = LengthOfLine1;
        Double L2 = LengthOfLine2;

        if ((L1.compareTo(L2) < 0)) {
            System.out.println("Line 1 is shorter than Line 2");
        } else if ((L1.compareTo(L2) > 0)) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Both Lines are Equal");
        }
    }
}
// Program ends here
