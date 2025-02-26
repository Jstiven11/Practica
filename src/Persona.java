/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class Persona {
    private String nombre;
    private int edad;

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void correr() {
        System.out.println(nombre + " está corriendo...");
    }

    public static void main(String[] args) {
        
        Persona paulo = new Persona("Paulo", 21);
        
       
        paulo.mostrar();
        paulo.correr();
    }
}
