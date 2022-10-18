package figGeoPlanas;

public class Paralelogramo {
	
	public double base;
	public double altura;
	public double area;
	
	public Paralelogramo() {
		base = 0.0;
		altura = 0.0;
		area = 0.0;
	}
	
	public void calcArea() {
		area = base * altura;
		System.out.println("A area do paralelogramo é : "+ area); 
	}

}
