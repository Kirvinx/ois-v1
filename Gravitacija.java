import java.util.Scanner;

// nism sure ce dela :D
// test za 8. tocko
//senkrat kodo po delih

public class Gravitacija {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	double visina = sc.hasNextDouble();
	
	
	
	//izpis gravitacijskega pospeška za nadmorsko višino iz ukazne vrstice, metoda gravitacija mora vrnit double!
	System.out.printf("Gravitacijski pospešek: %f%n", gravitacija(visina));


	}
	
	
}




























/*
public class Gravitacija {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double v = sc.nextDouble();
		double a = izracunajGravitacijo(v);
		System.out.println(a);
		
	}
	
	
	public static double izracunajGravitacijo(double v) {
		final double KONSTANTA_C = 6.674 * Math.pow(10, -11);
		final double KONSTANTA_M = 5.972 * Math.pow(10, 24);
		final double KONSTANTA_r = 6.371 * Math.pow(10, 6);
		
		return  KONSTANTA_C * (KONSTANTA_M * Math.pow(KONSTANTA_r + v, 2));


	}
	
*/


}
