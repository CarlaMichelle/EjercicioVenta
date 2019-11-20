package venta;

import java.util.Scanner;

public class Venta {

	public static void main(String[] args) {
		
		String []tipoComb = {"Nafta Super", "Nafta Premium", "Gas Oil"};
		// esto es para crea un array de tipo string que me diga el nombre de las posiciones
		String []tipoEstacion = {"Estacion 1", "Estacion 2", "Estacion 3"};

		float matriz[][] = new float[3][3];
		//Declarar la matriz

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//Un FOR para inicializar la matriz

				matriz[i][j] = 0;
			}
		}


		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("SISTEMA DE VENTA");
		System.out.println("===============");
		System.out.println("INGRESE CANTIDAD DE LITROS");
		float litros;
		litros = sc.nextFloat();
		
		float totalCombustible[] = new float[3];
		float totalEstacion[] = new float[3];
		//Generar nuevos array para los totales, aparte de la matriz

		while (litros != 0) {

			
			System.out.println("INGRESE TIPO DE COMBUSTIBLE");
			System.out.println("0 = NAFTA SUPER");
			System.out.println("1 = NAFTA PREMIUM");
			System.out.println("2 = GAS OIL");

			float costo = 0;
			int combustible = sc.nextInt();
			//Combustible para la matriz y el array
			switch (combustible) {

			case 0:
				costo = litros * 20;
				break;
			case 1:
				costo = litros * 40;
				break;
			case 2:
				costo = litros * 10;
				break;

			}
			
			System.out.println("INGRESE ESTACION");
			System.out.println("0 = A");
			System.out.println("1 = B");
			System.out.println("2 = C");

			int estacion = sc.nextInt();
			//Estacion para la matriz y el array


			//+= sirve para ir acumulando, en cada posicion
			totalCombustible[combustible] += costo;
			//Para array total por combustible
			totalEstacion[estacion] += costo;
			//Para array total por estacion
			matriz[combustible][estacion] += costo;
			
			
			
			// matriz para decirle que la *i* y la *j* son el combustible y la
			// estacion
			
			System.out.println("INGRESE CANTIDAD DE LITROS");
			litros = sc.nextFloat();
			
		}
		
		
		
				System.out.println("TOTAL POR COMBUSTIBLE:  ");
				System.out.println ("=====================");
				
				for (int i = 0; i < totalCombustible.length; i++) {

					System.out.println(tipoComb[i] + "  " + totalCombustible[i]);
					
				}
				
						
				System.out.println("TOTAL POR ESTACION:  "  );
				
				for (int i = 0; i < totalEstacion.length; i++) {

					System.out.println(tipoEstacion [i] + "  "+ totalEstacion[i]);
					
				}
				
		
		
		
				System.out.println("COMBUSTIBLE MAS VENDIDO");
				System.out.println("=========================");
				int masVendido ;

				if (totalCombustible[0] > totalCombustible[1]) {
					
					System.out.println();
					if (totalCombustible[0]>totalCombustible [2]){
						masVendido = 0;
					
					System.out.println("=================");
					System.out.println("El combustible màs vendido es Nafta Super");
					
				}else{
					masVendido = 2;
					System.out.println("=================");
					System.out.println("El combustible màs vendido es Gas Oil ");
				}	
				
				}else {
		if (totalCombustible [1] > totalCombustible[2] ){
		masVendido=1;
		System.out.println("=================");
		System.out.println("El combustible màs vendido es Nafta Premium ");
	} else {
		
		masVendido = 2;
		System.out.println("=================");
		System.out.println("El combustible màs vendido es Gas Oil ");
		
		
	}
		
	}
				
				
}
}
		
	


