package figGeoPlanas;

	
public class Quadrado{
		
	public double lado;
	public double area;
		
		
	public Quadrado() {
		lado = 0.0;
		area = 0.0;
	}
		
	public void calcArea() {
		area = Math.pow(lado, 2);
		System.out.println("A area do quadrado é : " + area);
	}
}
