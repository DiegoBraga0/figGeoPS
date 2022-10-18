package figGeoSpaciais;

import java.util.Scanner;
import figGeoPlanas.*;

public class Cubo {
	
	Scanner sc = new Scanner(System.in);
	Quadrado Q1 = new Quadrado();

	public double aresta;
	public double areaL;		
	public double areaT;
	public double volume;
	
	public Cubo() {
		aresta = 0;
		areaL = 0;
		areaT = 0;
		volume = 0;
	}
	
	public void calcAreaL() {
		areaL = 4 * Math.pow(aresta,2);
		System.out.println("A area lateral do Cubo é : "+areaL);
	}
	
	public void calcAreaT() {
		areaT = 6 * Math.pow(aresta,2);
		System.out.println("A area total do Cubo é : "+areaT);
	}
	
	public void Vol() {
		volume = Math.pow(aresta,3);
		System.out.println("O volume do Cubo é : "+volume);
	}
	
}
