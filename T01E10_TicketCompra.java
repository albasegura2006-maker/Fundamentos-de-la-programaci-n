package edu.thepower.tema01variablesyoperadores;

import java.util.Scanner;

    /* Pedir al usuario: Nombre del producto, Precio unitario, y cantidad o unidades.
     Tenemos que calcular el subtotal, el iva 21% y por último total.
     Justificar el ticket
    */

public class T01E10_TicketCompra {
    public static void main(String[] args) {
        //Declaración de variables.
        Scanner sc = new Scanner(System.in);
        String producto;
        double precio;
        int unidades;

        //Pedimos datos al usuario
        System.out.print("Nombre de producto: ");
        producto = sc.nextLine();
        System.out.print("Precio unitario: ");
        precio = sc.nextDouble();
        System.out.print("Cantidad de unidades: ");
        unidades = sc.nextInt();


        //Cálculos
        double subtotal = precio * unidades;
        double iva = subtotal * 21 / 100;


        //Ticket compra
        System.out.printf("%s%n", "=============TICKET DE COMPRA=============");
        System.out.printf("%-20s%15s%n", "Producto: ", producto);
        System.out.printf("%-19s%15.2f€%n", "Precio unitario: ", precio);
        System.out.printf("%-20s%,15d%n", "Cantidad: ", unidades);

        System.out.printf("---------------------------------------%n");
        System.out.printf("%-20s%15.2f%n", "Subtotal: ", subtotal);
        System.out.printf("%-20s%15.2f%n", "Iva (21%):", iva);
        System.out.printf("%-20s%15.2f%n", "Total: ", subtotal + iva);
    }
    }
