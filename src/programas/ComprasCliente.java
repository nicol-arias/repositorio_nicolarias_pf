
package programas;

import java.util.Scanner;

public class ComprasCliente {
    public static void main(String[] args) {
        // Declaramos las variables
        String nombre;
        double compra1, compra2, compra3, total, promedio;

        Scanner lectura = new Scanner(System.in);

        // Ingresamos los datos
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = lectura.nextLine();

        System.out.print("Ingrese el monto de la compra 1: ");
        compra1 = lectura.nextDouble();

        System.out.print("Ingrese el monto de la compra 2: ");
        compra2 = lectura.nextDouble();

        System.out.print("Ingrese el monto de la compra 3: ");
        compra3 = lectura.nextDouble();

        // Calculamos
        total = compra1 + compra2 + compra3;
        promedio = total / 3;

        System.out.println("\n--- Resultados ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Total de compras: " + total);
        System.out.println("Promedio de compras: " + promedio);
    }
    
}
