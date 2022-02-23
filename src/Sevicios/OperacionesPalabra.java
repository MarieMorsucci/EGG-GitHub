/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Mariela Morsucci
 */
public class OperacionesPalabra {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int i;

    public Cadena CrearCadena() {

        Cadena Cx = new Cadena();
        System.out.println("Ingrese una frase u palabra");
        Cx.setFrase(leer.next());
        Cx.setLongitud(Cx.getFrase().length());

        return Cx;
 
    }

    public void MostrarVocales(Cadena Cx) {
        int c = 0;

        for (i = 0; i < Cx.getLongitud(); i++) {
            String l = Cx.getFrase().substring(i, i + 1);
            if (l.equalsIgnoreCase("a") || l.equalsIgnoreCase("e") || l.equalsIgnoreCase("i") || l.equalsIgnoreCase("o") || l.equalsIgnoreCase("u")) {
                c = c + 1;
            }

        }
        System.out.println("La cantidad de vocales de la frase es " + c);
    }

    public void InvertirCadena(Cadena Cx) {

        String l = "";
        String m = "";

        //forma 1->
        for (i = Cx.getLongitud() - 1; i >= 0; i--) {
            l = l + Cx.getFrase().charAt(i);

        }

        //forma 2-->
        for (i = Cx.getLongitud() - 1; i >= 0; i--) {
            m = m + Cx.getFrase().substring(i, i + 1);
        }

        System.out.println("La frase invertida es : ");
        System.out.print(l);
        System.out.println("");
        System.out.print(m);

    }

    public void CaracterRepetido(Cadena Cx) {
        System.out.println("Ingrese un caracter a buscar el la frase");
        String c = leer.next();
        int r = 0;
        for (i = 0; i < Cx.getLongitud(); i++) {
            if (c.equalsIgnoreCase(Cx.getFrase().substring(i, i+1))) {
                r = r + 1;
            }
        }

        System.out.println("La cantidad de veces que se repite el caracter es "+r);

    }
    
    public void ComparacionFrase(Cadena Cx){
        System.out.println("\n Ingrese frase nueva");
        String f= leer.next();
        int c= f.length();
        
        if (c<Cx.getLongitud()){
            System.out.println("La frase ingresada tiene menos caracteres que la primera");
        }else{
            System.out.println("La frase ingresada tiene mas caracteres que la primers");
        }
        }
    
    public void UnirFrase(Cadena Cx){
        System.out.println("\n Ingrese una nueva frase");
        String f= leer.next();
        
        String n= Cx.getFrase().concat("."+f);
        
        System.out.println(n);
        }
    
    public void Reemplazar(Cadena Cx){
        System.out.println("\n Ingrese caracter para reemplazar la letra a");
        String c= leer.next();
       
        String NuevaFrase= Cx.getFrase().replace(("a"), c);
         System.out.print(NuevaFrase);             
            
        }
    public void Buscar(Cadena Cx)    {
         System.out.println("\n Ingresar caracter para buscar");
        String m = leer.next();
       
        int j = 0;
        for (i = 0; i < Cx.getLongitud(); i++) {
        String l = Cx.getFrase().substring(i, i + 1);
            if (l.equalsIgnoreCase(m)) {
                j = j + 1;
            }
        }
        
        if (j > 0) {
            System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }

    }
    }
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    








