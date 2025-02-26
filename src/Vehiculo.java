/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class Vehiculo {
    String empresaPropietaria;
    int numPasajeros;
    int capacidadGasolina;
    int consumoGasolina; 

    
    public Vehiculo(String empresaPropietaria, int numPasajeros, int capacidadCombustible, int consumoCombustible) {
        this.empresaPropietaria = empresaPropietaria;
        this.numPasajeros = numPasajeros;
        this.capacidadGasolina = capacidadCombustible;
        this.consumoGasolina = consumoCombustible;
    }

    
    public int calcularRango() {
        return capacidadGasolina * consumoGasolina;
    }

    
    public void mostrarInfo() {
        System.out.println("Empresa: " + empresaPropietaria);
        System.out.println("Número de pasajeros: " + numPasajeros);
        System.out.println("Capacidad de combustible: " + capacidadGasolina + " galones");
        System.out.println("Consumo de combustible: " + consumoGasolina + " millas por galón");
        System.out.println("Rango estimado: " + calcularRango() + " millas");
        System.out.println("----------------------------------");
    }
}

 class main {
    public static void main(String[] args) {
     
        Vehiculo minivan = new Vehiculo("Cootranar", 11, 29, 22);
        Vehiculo duobus = new Vehiculo("Trans Arauca", 40, 28, 35);

       
        minivan.mostrarInfo();
        duobus.mostrarInfo();
    }
}

