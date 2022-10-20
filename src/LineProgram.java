public class LineProgram {

	// Co-ordinates of point-1
	double x1 = 0;
	double y1 = 0;

	// Co-ordinate of point-2
	double x2 = 2;
	double y2 = 2;

	// Calculating value of x2-x1
	double ValueOfX(double x1, double x2) {
		double Valueofx = x2 - x1;
		return Valueofx;
	}

	// Calculating value of y2-y1
	double ValueOfY(double y1, double y2) {
		double Valueofy = y2 - y1;
		return Valueofy;
	}

	public static void main(String[] args) {

		LineProgram Var = new LineProgram();
		double Squareofx1andx2 = Math.pow(Var.ValueOfX(0, 2), 2);
		double Squareofy1andy2 = Math.pow(Var.ValueOfY(0, 2), 2);
		double lengthofline1 = Math.sqrt(Squareofx1andx2 + Squareofy1andy2);
		System.out.println("Length of line is: " + lengthofline1);
	}

}