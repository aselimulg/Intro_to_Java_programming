package chapter01;

public class Exercise01_13 {
	public static void main(String[] args) {
		double x, y;
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		System.out.println("x is: " + x  + "\ny is: " + y);

	}

}
