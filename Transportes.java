/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author maria
 */
public class Transportes {

    public static void main(String[] args) {
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha","Motor prr prr");
        VehiculoAereo vehiculoAereo=new VehiculoAereo("Aero Mexico","Viva AeroBus",2);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("Mattel","Terreneitor","Grua");
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Mattel","Terreneitor",4);
        
        System.out.println("Informacion de Vehiculo Acuatico");
        vehiculoAcuatico.mostrarInfo(); 
        
        System.out.println("Informacion de Vehiculo Aereo");
        vehiculoAereo.mostrarInfo(); 
        
        System.out.println("Informacion de Vehiculo Espacial");
        vehiculoEspacial.mostrarInfo(); 
        
        System.out.println("Informacion de Vehiculo Terrestre");
        vehiculoTerrestre.mostrarInfo(); 
        
    }
}
