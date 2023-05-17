/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cancion;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Compositor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaCompositor {
    
    private Scanner teclado;

    public VistaCompositor() {
        teclado = new Scanner(System.in);
    }
    
    public Compositor ingresarCompositor(){
                   
                        System.out.print("Codigo: ");
                        int codigo2 = teclado.nextInt();
            
                        System.out.print("Nombre: ");
                        String nombre2 = teclado.next();
                    
                        System.out.print("Apellido: ");
                        String apellido2 = teclado.next();
                    
                        System.out.print("Edad: ");
                        int edad2 = teclado.nextInt();
                    
                        System.out.print("Nacionalidad: ");
                        String nacionalidad2 = teclado.next();
            
                        System.out.print("Salario: ");
                        double salario2 = teclado.nextDouble();
                    
                        System.out.print("Numero de Composiciones: ");
                        int numeroComposiciones = teclado.nextInt();
                        VistaCancion can = new VistaCancion();
                        List<Cancion> canc = can.ingresarCancion();
                        List<Cantante> cliente = new ArrayList<>();
                        
       return new Compositor(numeroComposiciones, canc, cliente, codigo2, nombre2, apellido2, edad2, nacionalidad2, salario2);
    }
    
    public String buscarCompositor(){
        System.out.println("Ingrese el nombre del compositor a buscar");
        String nombre = teclado.next();
        return nombre ;
    }
    
    public void verComposit(Compositor composi){
        System.out.println(composi);
    }
    public void verCompositores(List<Compositor> compositores){
        System.out.println("Datos de los Cantantes ; \n");
        for (Compositor comp : compositores) {
            System.out.println(comp);
            
        }
    }
    public List<String> actualizarCompositor(){
        List<String> listita = new ArrayList<>();
        System.out.println("Ingresa el nobre Artistico del cantante a actualizar");
        String nomArtis = teclado.next();
        listita.add(nomArtis);
        System.out.println("Ingrese los nuevos Datos (nombre, apellido)");
        System.out.println("Nombre nuevo: ");
        String nombre = teclado.next();
        listita.add(nombre);
        System.out.println("Apellido nuevo:");
        String apellido = teclado.next();
        listita.add(apellido);
        return listita;
    }
    public String eliminarCompositor(){
        System.out.println("Ingresa el nombre del compositor a elimintar : ");
        String nom = teclado.next();
        return nom;
    }
    
    public String buscarporcancion(){
        System.out.println("Ingrese el nombre de la cancion que tiene el compositor: ");
        String nomcan = teclado.next();
        return nomcan;
    }
    
    public String agregarCliente1(){
        System.out.println("Ingrese el compositor al que le quiere agregar un cliente: ");
        String nomcli = teclado.next();
        return nomcli;
    }
    
    public String agregarCliente2(){
        System.out.println("Ingrese el nombre artistico del cantante: ");
        String ncan = teclado.next();
        return ncan;
    }
}

