/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author SUITE
 */
@Named(value = "personaManagedBean")
@RequestScoped
public class PersonaManagedBean {
    
    private String apellidos;
    private String nombres;
    private double numero1;
    private double numero2;
    String celular;
    
    public PersonaManagedBean() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
        
    //Metodos complementarios
    public String mostrarDatos(){
        return "recibe";
    }
    
    public double suma(){
        return numero1 + numero2;
    }
    
    public double resta(){
        return numero1 - numero2;
    }
    
    public double multiplicar(){
        return numero1 * numero2;
    }
    
    public double division(){
        return numero1 / numero2;
    }
    
    public double potencia(){
        return Math.pow(numero1, numero2);
    }
    
    public double raizNro1(){
        return Math.sqrt(numero1);
    }
    
    public double raizNro2(){
        return Math.sqrt(numero2);
    }
}
    
