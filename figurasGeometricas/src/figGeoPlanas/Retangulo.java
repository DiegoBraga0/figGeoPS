package figGeoPlanas;

public class Retangulo {
	
	public double base;
	public double altura;
	public double area;
	
	public Retangulo() {
		base = 0.0;
		altura = 0.0;
		area = 0.0;
	}
	
	public void calcArea() {
		area = base * altura;
		System.out.println("A area do reatangulo é : "+ area);
	}

}
