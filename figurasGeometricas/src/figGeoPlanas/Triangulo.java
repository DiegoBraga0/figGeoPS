package figGeoPlanas;

public class Triangulo {
	
	public double base;
	public double altura;
	public double area;
	
	public Triangulo() {
		base = 0.0;
		altura = 0.0;
		area = 0.0;
	}
	
	public void calcArea() {
		area = (base * altura )/2;
		System.out.println("A area do triangulo é : "+ area);
	}

}
