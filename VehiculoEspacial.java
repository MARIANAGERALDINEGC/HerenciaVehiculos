/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author maria
 */
public class VehiculoEspacial extends Vehiculo{
    private String TipoRemolcador;
     
    public VehiculoEspacial(String marca, String modelo, String TipoRemolcador){
        super(marca, modelo);
        this.TipoRemolcador=TipoRemolcador;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de Remolcador: "+TipoRemolcador);
    }       
}
