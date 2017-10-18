
public class Quadratic {

	public static double round2(double a) {
		double b = a*1000;
		double c = b%10;
		
		if (c < 0.5) {
			return (a - (c / 100));
		}else {
			int d = (int) (a*100);
			return (d/100.0+0.01);
		}
	}
	
	public static double sqrt(double num) {
		double a;
		if (num < 0) {
			throw new IllegalArgumentException ("Do not accept negative number");
		}
		double square = num / 2;
		do {
			a = square;
			square = (a + (num / a)) / 2;
		} 
		while ((a - square) !=0);
		return round2(square);
	}
	
	public static String quadForm(double a, double b, double c) {
		if ((b * b) - 4 * a * c < 0) {
			return "no real roots";
		} else if ((b * b) - 4 * a * c == 0) {
			double root = round2(-b / (2 * a));
			String answer = "( " + root + " , " + "0)";
			return answer;
		} else {
			double pos = round2((-b + (sqrt((b *b)- 4 * a * c)))) / (2 * a);
			double neg = round2((-b - (sqrt((b * b) - 4 * a * c)))) / (2 * a);
			String result = "(" + neg + " , " + pos + ")";
			return result;
		}
	}
	
	public static String quadrDescriber(double a, double b, double c) {
		String output;
		
		output = "Description of the graph of;";
		output += "y =" + a + "x^2" + "+" + b + "x" + c;
		if (a < 0) {
			output += "Opens: Down";
		} else if (a > 0) {
			output += "Opens: up";
		} else {
			output += "This is not a Quadratic function";
		}
		
		
		double x = -b / 2 * a;
		double y = a * (x * x) + (b * x) + c;
		String z = quadForm(a, b, c);
		output += "Axis of Symmetry:" + x;
		output += "Vertex: (" + x + "," + y + ")";
		output += "x-intercept: " + z;
		output += "y-intercept: " + c;
		return output;
	}

}
