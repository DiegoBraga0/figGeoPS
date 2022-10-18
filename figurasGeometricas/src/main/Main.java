package main;

import java.util.Scanner;
import figGeoPlanas.*;
import figGeoSpaciais.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
						
		System.out.println("Qual opção você deseja ?");
		System.out.println("\t[1] Figura Planas");
		System.out.println("\t[2] Figuras Espaciais");
		System.out.println("\t[3] Sair");
		int opcao1 = sc.nextInt();
		
		if(opcao1 == 1) {
			System.out.println("Qual figura plana : ");
			System.out.println("\t[1] Triangulo");
			System.out.println("\t[2] Quadrado");
			System.out.println("\t[3] Circulo");
			System.out.println("\t[4] Trapezio");
			System.out.println("\t[5] Paralelogramo");
			System.out.println("\t[6] Retangulo");
			
			int opcao2 = sc.nextInt();
			switch(opcao2) {
			case 1:
				Triangulo Tri1 = new Triangulo();
				System.out.println("Qual a base do Triangulo? ");
				System.out.println("Qual a altura do Triangulo? ");
				Tri1.base = sc.nextDouble();
				Tri1.altura = sc.nextDouble();
				Tri1.calcArea();
				break;
			case 2:
				Quadrado Qua1 = new Quadrado();
				System.out.println("Qual o lado do Quadrado? ");
				Qua1.lado = sc.nextDouble();
				Qua1.calcArea();
				break;
			case 3:
				Circulo Cir1 = new Circulo();
				System.out.println("Qual o raio do Circulo? ");
				Cir1.raio = sc.nextDouble();
				Cir1.calcArea();
				break;
			case 4:
				Trapezio Tra1 = new Trapezio();
				System.out.println("Qual o base maior do Trapezio? ");
				System.out.println("Qual o base menor do Trapezio? ");
				System.out.println("Qual a altura do Trapezio? ");
				Tra1.baseM = sc.nextDouble();
				Tra1.basem = sc.nextDouble();
				Tra1.altura = sc.nextDouble();
				Tra1.calcArea();
				break;
			case 5:
				Paralelogramo Par1 = new Paralelogramo();
				System.out.println("Qual  a base do Paralelogramo? ");
				System.out.println("Qual  a altura do Paralelogramo? ");
				Par1.base = sc.nextDouble();
				Par1.altura = sc.nextDouble();
				Par1.calcArea();
				break;
			case 6:
				Retangulo Ret1 = new Retangulo();
				System.out.println("Qual a base do Retangulo? ");
				System.out.println("Qual a altura do Retangulo? ");
				Ret1.base = sc.nextDouble();
				Ret1.altura = sc.nextDouble();
				Ret1.calcArea();
				break;
			default:
				System.out.println("Digite uma opção valida");
				break;
			}
		}
		else if (opcao1== 2){
			
			System.out.println("Qual figura espacial : ");
			System.out.println("\t[1] Cilindro");
			System.out.println("\t[2] Cone");
			System.out.println("\t[3] Cubo");
			System.out.println("\t[4] Esfera");
			System.out.println("\t[5] Pirâmide");
			System.out.println("\t[6] Prisma");
			
			int opcao3 = sc.nextInt();
			switch(opcao3) {
			case 1:
				Cilindro Cil1 = new Cilindro();
				break;
			case 2:
				Cone Con1 = new Cone();
				break;
			case 3:
				Cubo Cub1 = new Cubo();
				System.out.println("Qual a aresta do Cubo? ");
				Cub1.aresta = sc.nextDouble();
				Cub1.calcAreaL();
				Cub1.calcAreaT();
				Cub1.Vol();					
				break;
			case 4:
				Esfera Esf1 = new Esfera();
				break;
			case 5:
				Pirâmide Pir1 = new Pirâmide();
				break;
			case 6:
				Prisma Pri1 = new Prisma();
				break;
			default:
				break;	
			}
		}
		else if(opcao1 ==3) {
			System.out.println("Fim!");				
		}
		else {
			System.out.println("Error!");
		}
		
		
		
			

	}

}
