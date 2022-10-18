package figGeoPlanas;

public class Trapezio {
	
	public double basem; 
	public double baseM;
	public double altura;
	public double area;
	
	public Trapezio() {
		basem = 0.0;
		baseM = 0.0;
		altura = 0.0;
		area = 0.0;
	}
	
	public void calcArea() {
		area = ((basem + baseM)* altura)/2;
		System.out.println("A area do trapezio é : "+ area);
	}

}
