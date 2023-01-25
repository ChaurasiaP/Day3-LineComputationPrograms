package lineComparison;

import java.util.Scanner;

public class LineComparison {
    //DAY 8 UC4 LINE COMPARISON

    // VARIABLES TO CALCULATE LINE 1
    public static int x1, y1,x2,y2;

    // VARIABLES TO CALCULATE LINE 2
    public static int x3, y3,x4,y4;
    
    public static double line1, line2;  // length of line 1  and line 2
    
     // METHOD FOR CALCULATIONS FOR LINES
    public void getLength() {
        line1 = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
        System.out.println("Length of Line 1: "+line1);

        line2 = Math.sqrt((Math.pow((x4 - x3), 2)) + Math.pow((y4 - y3), 2));
        System.out.println("Length of Line 2: "+line2);

    }


=======
    // METHOD TO COMPARE LINES

    public void checkLine(double line1, double line2) {

        Double L1 = line1;
        Double L2 = line2;

        if ((L1.compareTo(L2) < 0)) {
            System.out.println("Line 1 is shorter than Line 2");
        } else if ((L1.compareTo(L2) > 0)) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Both Lines are Equal");
        }
    }

    // MAIN METHOD STARTS
    public static void main(String[] args) {

        System.out.println("Line Computation: Using Method");

        LineComparison getLen = new LineComparison();
        LineComparison checkLen = new LineComparison();

        //TAKING INPUTS FOR COMPUTING LINE 1
        System.out.println("Co-ordinates for line 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Co-ordinates x1 and y1: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.print("Enter co-ordinates x2 and y2: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        // TAKING INPUTS FOR LINE 2
        System.out.println("Co-ordinates for line 2");
        System.out.print("Enter co-ordinates x3 and y3: ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        System.out.print("Enter co-ordinates x4 and y4: ");
        x4 = sc.nextInt();
        y4 = sc.nextInt();

        getLen.getLength();
        System.out.println("Comparing Lines: ");

        checkLen.checkLine(line1, line2);
    }
}

// Program ends here
