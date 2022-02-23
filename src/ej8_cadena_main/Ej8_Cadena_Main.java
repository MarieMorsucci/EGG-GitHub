/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8_cadena_main;

import Entidades.Cadena;
import Sevicios.OperacionesPalabra;

/**
 *
 * @author Mariela Morsucci
 */
public class Ej8_Cadena_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    OperacionesPalabra CC = new OperacionesPalabra ()    ;
    
    Cadena C1= CC.CrearCadena();
    CC.MostrarVocales(C1);
    CC.InvertirCadena(C1);
    CC.CaracterRepetido(C1);
   CC.ComparacionFrase(C1);
   CC.UnirFrase(C1);
   CC.Reemplazar(C1);
   CC.Buscar(C1);
   
   
    
    
    
         
        
        
        
    }
    
}
