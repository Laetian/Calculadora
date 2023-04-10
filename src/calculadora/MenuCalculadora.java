package calculadora;

import java.util.Scanner;

public class MenuCalculadora {

	public void menuCalculadora() {

		OperacionesCalculadora operacionesCalculadora = new OperacionesCalculadora();
		OperacionSumaResta operacionSumaResta = new OperacionSumaResta();
		OperacionMultiplicacionDivision operacionMultiplicacionDivision = new OperacionMultiplicacionDivision();
		int opcion = 0;
		Double inputA = 0.0;
		Double inputB = 0.0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		System.out.println("¡Bienvenido a la calculadora!");
		do {
			System.out.println("\n Elija la opcion que quiera ejecutar pulsando"
					+ "\n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir \n 0 para salir ");
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuCalculadora();
			}

			if (opcion >= 0 && opcion <= 4) {
				switch (opcion) {
				case 0:
					salir = true;
 
					break;
				case 1:
					inputA = operacionesCalculadora.input(1);
					inputB = operacionesCalculadora.input(2);
					operacionSumaResta.suma(inputA, inputB);
					salir = operacionesCalculadora.continuar();
					break;
				case 2:
					inputA = operacionesCalculadora.input(1);
					inputB = operacionesCalculadora.input(2);
					operacionSumaResta.resta(inputA, inputB);
					salir = operacionesCalculadora.continuar();
					break;
				case 3:
					inputA = operacionesCalculadora.input(1);
					inputB = operacionesCalculadora.input(2);
					operacionMultiplicacionDivision.multiplicacion(inputA, inputB);
					salir = operacionesCalculadora.continuar();
					break;
				case 4:
					inputA = operacionesCalculadora.input(1);
					inputB = operacionesCalculadora.input(2);
					operacionMultiplicacionDivision.division(inputA, inputB);
					salir = operacionesCalculadora.continuar();
					break;
				}
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuCalculadora();
			}
		} while (salir == false);

	}

}
