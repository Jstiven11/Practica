/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Cuenta {
    private String titular;
    private double total;
    private double cantidad;

   
    public Cuenta(String titular) {
        this.titular = titular;
        this.total = 5000;
        this.cantidad = 0;
    }

   
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.total = 5000;
        this.cantidad = cantidad;
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTotal() {
        return total;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

   
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.total += cantidad;
        }
    }

    
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.total - cantidad < 0) {
                this.total = 0;
            } else {
                this.total -= cantidad;
            }
        }
    }

    
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo total: " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = scanner.nextLine();
        Cuenta cuenta1 = new Cuenta(nombre);
        
        boolean salir = false;
        while (!salir) {
            System.out.println("\n1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar información");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta1.ingresar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta1.retirar(retiro);
                    break;
                case 3:
                    cuenta1.mostrarInformacion();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
