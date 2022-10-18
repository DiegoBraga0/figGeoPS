package figGeoPlanas;

public class Circulo {
	
	public double raio;
	public double Pi;
	public double area;
	
	public Circulo() {
		raio = 0.0;
		Pi = 3.1415;
		area = 0.0;
	}
	
	public void calcArea() {
		area = Pi * Math.pow(raio, 2);
		System.out.println("A area do circulo é : " + area);
	}

}
