package calculadora;

import java.util.Scanner;

public class OperacionesCalculadora {

	public Double input(int opcion) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double input = 0;
		if (opcion == 1) {
			System.out.println("Introduce el primer número: ");
		}
		if (opcion == 2) {
			System.out.println("Introduce el segundo número: ");
		}

		if (sc.hasNextDouble()) {
			input = sc.nextDouble();
		} else {
			System.out.println("Input no valido, debes introducir un número");
			input = input(1);
		}
		return input;
	}

	public boolean continuar() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String si = "s";
		String no = "n";
		System.out.println("¿Quiere continuar operando? s/n");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase(si)) {
			return false;
		}
		if (response.equalsIgnoreCase(no)) {
			System.out.println("¡Adios!");
			return true;
		} else {
			System.out.println("Input no válido, debe introdcur una opción válida");
			continuar();
			return false;
		}
	}

}
