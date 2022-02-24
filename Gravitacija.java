import java.util.Scanner;


public class Gravitacija {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		double a = izracunajGravitacijo((double)v);
		System.out.println(a);
		
	}
	
	
	public static double izracunajGravitacijo(double v) {
		final double KONSTANTA_C = 6.674 * Math.pow(10, -11);
		final double KONSTANTA_M = 5.972 * Math.pow(10, 24);
		final double KONSTANTA_r = 6.371 * Math.pow(10, 6);
		
		return  KONSTANTA_C * (KONSTANTA_M * Math.pow(KONSTANTA_r + v, 2));


	}
}
