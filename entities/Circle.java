package entities;

public class Circle {

	public static final double PI = 3.14;
	
	public static double areaCircle(double raio) {
		return 2.00 * PI * Math.pow(raio, 2);
	}
	
	public static double volumeCircle(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}
}
