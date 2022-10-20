
public class LineProgram {

	// Co-ordinates of point-1 of line 1
	Double x1;
	Double y1;
	// Co-ordinate of point-2 of line 2
	Double x2;
	Double y2;

	//// Co-ordinates of point-1 of line 2
	Double a1;
	Double b1;
	// Co-ordinates of point-2 of line 2
	Double a2;
	Double b2;
	public LineProgram() {

	}
	public LineProgram(double x1, double x2, double y1, double y2) {

		this.x1 = x1;
		this.x2 = x2;

		this.y1 = y1;
		this.y2 = y2;
	}

	//Calculating value of x2-x1 for line 1
	Double ValueOfX(double x1, double x2) {
		Double Valueofx = x2 - x1;
		return Valueofx;
	}

	//Calculating value of y2-y1 for line 1
	Double ValueOfY(double y1, double y2) {
		Double Valueofy = y2 - y1;

		return Valueofy;
	}

	// Calculating value of a1-a1 for line 2
	Double ValueOfA(double a1, double a2) {
		double Valueofx = a2 - a1;
		this.a1 = a1;
		this.a2 = a2;
		return Valueofx;
	}

	// Calculating value of b2-b1 for line 2
	Double ValueOfB(double b1, double b2) {
		Double Valueofy = b2 - b1;
		this.b1 = b1;
		this.b2 = b2;
		return Valueofy;
	}

	public static void main(String[] args) {
		LineProgram Var = new LineProgram();
		Double Squareofx1andx2 = Math.pow(Var.ValueOfX(0, 4), 2);
		Double Squareofy1andy2 = Math.pow(Var.ValueOfY(0, 4), 2);
		Double lengthofline1 = Math.sqrt(Squareofx1andx2 + Squareofy1andy2);
		System.out.println("Length of line is: " + lengthofline1);

		Double Squareofa1anda2 = Math.pow(Var.ValueOfA(0, 4), 2);
		Double Squareofb1andb1 = Math.pow(Var.ValueOfB(0, 4), 2);
		Double lengthofline2 = Math.sqrt(Squareofa1anda2 + Squareofb1andb1);
		System.out.println("Length of line is: " + lengthofline2);

		// Comparing the end point to check if the lines are equal
		if (Var.x2.equals(Var.a2) && Var.y2.equals(Var.b2)) {
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