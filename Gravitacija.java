import java.util.Scanner;

// test za 8. tocko
//senkrat kodo po delih

public class Gravitacija {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double visina = sc.nextDouble();
	
	//izpis gravitacijskega pospeška za nadmorsko višino iz ukazne vrstice, metoda gravitacija mora vrnit double!
	System.out.printf("Gravitacijski pospešek: %f%n", gravitacija(visina));
	}
	
    // dodau Erazem. Upam da bo prou...
	public static double gravitacija(double visina) {
	    final double GRAVITACIJSKA_KONSTANTA = 6.674 * Math.pow(10, -11);
	    final double MASA_ZEMLJE = 5.972 * Math.pow(10, 24);
	    final double POLMER_ZEMLJE = 6.371 * Math.pow(10, 6);

	    return ((GRAVITACIJSKA_KONSTANTA * MASA_ZEMLJE) / Math.pow((POLMER_ZEMLJE + visina), 2));
	}
	
	//dodau Maj
	public static void izpis (double visina) {
		System.out.printf("Gravitacijski pospešek: %f%n", gravitacija(visina));
		System.out.printf("Visina: %f%n", visina);
	}
	
}

