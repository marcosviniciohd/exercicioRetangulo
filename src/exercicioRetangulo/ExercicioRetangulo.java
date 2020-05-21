package exercicioRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do retangulo: ");
		double largura = sc.nextDouble();
		
			while (largura <= 0.0) {
				System.out.print("O valor deve ser positivo. Tente novamente: " );
				largura = sc.nextDouble();
			}
		
		System.out.print("Digite a altura do retangulo ");
		double altura = sc.nextDouble();
		
			while (altura <= 0.0) {
				System.out.print("O valor deve ser positivo. Tente novamente: ");
				altura = sc.nextDouble();
			}
		
		System.out.println("*******************************************************************");
		System.out.println("*******************************************************************");
		System.out.println("MENU");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.print("Digite uma opcao: ");
		
		int opcaoMenu = sc.nextInt();
		
		while (opcaoMenu <= 0 || opcaoMenu >=4) {
			
			System.out.println("OPÇÃO INVALIDA");
			System.out.println("*******************************************************************");
			System.out.println("*******************************************************************");
			System.out.println("MENU");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opcao: ");
			opcaoMenu = sc.nextInt();
					
		}
		
		if (opcaoMenu == 1 ) {
			double area = largura * altura;
			System.out.printf("AREA = %.1f%n ", area);
			
		}
		if (opcaoMenu == 2 ) {
			double perimetro = ( largura + altura ) * 2 ;
			System.out.println("");
			System.out.printf("PERIMETRO = %.1f%n ", perimetro);
			
		}
		if (opcaoMenu == 3) {
			System.out.println("FIM DO PROGRAMA!");
		}
		

		sc.close();
		
		
	}

}