/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Mariela Morsucci
 */
public class Cadena {

      
private String frase ;
private int Longitud;

    public Cadena() {
    }

    public Cadena(String frase, int Longitud) {
        this.frase = frase;
        this.Longitud = Longitud;
    }


    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", Longitud=" + Longitud + '}';
    }
    
    

    

   
}
