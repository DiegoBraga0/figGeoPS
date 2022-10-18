package figGeoSpaciais;

public class Esfera {
	
	public double Pi;
	public double Raio;
	public double Volume;
	public double Superficie; // AreaTotal
	
	public Esfera() {
		Pi = 3.1415;
		Raio = 0;
		Volume = 0;
		Superficie = 0;
	}
	
	public void calcVol() {
		Volume = (4 * Pi * Math.pow(Raio,3))/3;
		System.out.println("O volume da esfera é :"+Volume );
	}
	
	public void calcSuperfic() {
		Superficie = 4 * Pi * Math.pow(Raio,2);
		System.out.println("A superficie da esfera é : "+Superficie );
	}

}
