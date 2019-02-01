package programa11b;

import java.util.Scanner;

public class programa11b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nEmpleados=0, total=0,ISR=0, nomina=0, suma=0;
		int i=1;
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el numero de empleados: ");
		nEmpleados = leer.nextDouble();
		do {
			System.out.print("Ingrese la sueldo: "+i+" " );
			nomina=leer.nextDouble();
			suma+=nomina;
			i++;
	}while (i<=nEmpleados);
		total=suma;
		ISR=suma*.33;
		System.out.println("El total es: "+(total-ISR));
		System.out.println("El ISR es: "+ISR);
	}
}
