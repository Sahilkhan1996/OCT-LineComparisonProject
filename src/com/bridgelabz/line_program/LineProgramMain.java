package com.bridgelabz.line_program;

public class LineProgramMain {
	public static void main(String[] args) {
		LineProgram lineProgram = new LineProgram(0.0, 0.0, 4.0, 4.0, 0.0, 0.0, 4.0, 4.0);
		Double Squareofx1andx2 = Math.pow(lineProgram.ValueOfX(lineProgram.getX1(), lineProgram.getX2()), 2);// x1=0,x2=4
		Double Squareofy1andy2 = Math.pow(lineProgram.ValueOfY(lineProgram.getY1(), lineProgram.getX2()), 2);// y1=0,y2=4
		Double lengthofline1 = Math.sqrt(Squareofx1andx2 + Squareofy1andy2);
		System.out.println("Length of line is: " + lengthofline1);

		Double Squareofa1anda2 = Math.pow(lineProgram.ValueOfA(lineProgram.getA1(), lineProgram.getA2()), 2);// a1=0,a2=4
		Double Squareofb1andb1 = Math.pow(lineProgram.ValueOfB(lineProgram.getB1(), lineProgram.getB2()), 2);// b1=0,b2=4
		Double lengthofline2 = Math.sqrt(Squareofa1anda2 + Squareofb1andb1);
		System.out.println("Length of line is: " + lengthofline2);

		// Comparing the end point to check if the lines are equal
		if ((lineProgram.getX2()).equals(lineProgram.getA2()) && (lineProgram.getY2()).equals(lineProgram.getB2())) {
			System.out.println("Both the lines are equal");
		} else {
			System.out.println("Both the lines are unequal");
		}

		// Comparing the line1 is equal/greater/lesser then line 2 with compare to
		// method
		int res = lengthofline1.compareTo(lengthofline2);
		if (res == 0) {
			System.out.println("line 1 and line 2 are equal in length");
		} else if (res > 0) {
			System.out.println("Line 1 is greater in length than line 2");
		} else {
			System.out.println("Line 1 is lesser  in length than line 2");
		}
	}

}
