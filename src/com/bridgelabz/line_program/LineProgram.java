package com.bridgelabz.line_program;

public class LineProgram {
//Hiding variables by making them private
	// Co-ordinates of point-1 of line 1
	private Double x1;
	private Double y1;
	// Co-ordinate of point-2 of line 2
	private Double x2;
	private Double y2;

	//// Co-ordinates of point-1 of line 2
	private Double a1;
	private Double b1;
	// Co-ordinates of point-2 of line 2
	private Double a2;
	private Double b2;

//Initializing the variables using constructor
	public LineProgram(Double x1, Double y1, Double x2, Double y2, Double a1, Double b1, Double a2, Double b2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.a1 = a1;
		this.b1 = b1;
		this.a2 = a2;
		this.b2 = b2;
	}

	public Double getX1() {
		return x1;
	}

	public void setX1(Double x1) {
		this.x1 = x1;
	}

	public Double getY1() {
		return y1;
	}

	public void setY1(Double y1) {
		this.y1 = y1;
	}

	public Double getX2() {
		return x2;
	}

	public void setX2(Double x2) {
		this.x2 = x2;
	}

	public Double getY2() {
		return y2;
	}

	public void setY2(Double y2) {
		this.y2 = y2;
	}

	public Double getA1() {
		return a1;
	}

	public void setA1(Double a1) {
		this.a1 = a1;
	}

	public Double getB1() {
		return b1;
	}

	public void setB1(Double b1) {
		this.b1 = b1;
	}

	public Double getA2() {
		return a2;
	}

	public void setA2(Double a2) {
		this.a2 = a2;
	}

	public Double getB2() {
		return b2;
	}

	public void setB2(Double b2) {
		this.b2 = b2;
	}

	// Calculating value of x2-x1 for line 1
	Double ValueOfX(double x1, double x2) {
		Double Valueofx = x2 - x1;
		this.x1 = x1;
		this.x2 = x2;
		return Valueofx;
	}

	// Calculating value of y2-y1 for line 1
	Double ValueOfY(double y1, double y2) {
		Double Valueofy = y2 - y1;
		this.y1 = y1;
		this.y2 = y2;
		return Valueofy;
	}

	// Calculating value of a2-a1 for line 2
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

}