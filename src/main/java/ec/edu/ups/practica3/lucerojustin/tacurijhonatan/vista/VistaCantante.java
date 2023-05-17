/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Disco;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaCantante {
    
    private Scanner teclado;

    public VistaCantante() {
        teclado = new Scanner(System.in);
    }
    
    public Cantante ingresarCantante() {
        teclado = new Scanner(System.in);
        System.out.print("Codigo: ");
        int codigo = teclado.nextInt();
        System.out.print("Nombre: ");
        String nombre = teclado.next();
        System.out.print("Apellido: ");
        String apellido = teclado.next();
        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        System.out.print("Nacionalidad: ");
        String nacionalidad = teclado.next();
        System.out.print("Salario: ");
        double salario = teclado.nextDouble();
        System.out.print("Nombre Artistico: ");
        String nArtistico = teclado.next();
        System.out.print("Genero Musical: ");
        String generoMusical = teclado.next();
        System.out.print("Número de sencillos: ");
        int numeroSencillos = teclado.nextInt();
        System.out.print("Numero de Conciertos: ");
        int numeroConciertos = teclado.nextInt();
        System.out.print("Número de giras: ");
        int numeroGiras = teclado.nextInt();  
       
            VistaDisco d = new VistaDisco();
            List<Disco> dis = d.ingresarDisco();
        return new Cantante(nArtistico, generoMusical, numeroSencillos, numeroConciertos, numeroGiras,dis , codigo, nombre, apellido, edad, nacionalidad, salario);
    }
    
    public List<String> actualizarCantante() {
        List<String> listita = new ArrayList<>();
        System.out.println("Ingresa el nobre Artistico del cantante a actualizar");
        
        String nomArtis = teclado.next();
        listita.add(nomArtis);
        System.out.println("Ingrese los nuevos Datos (nombre, apellido)");
        String nombre = teclado.next();
        System.out.println("Nombre nuevo:");
        listita.add(nombre);
        System.out.println("Apellido nuevo:");
        String apellido = teclado.next();
        listita.add(apellido);
        return listita ;
    }

    public String eliminarCantante() {
        System.out.println("Ingresa el nombre del cantante a eliminar");
        String nom = teclado.next();
        return nom;
    }

    
    public String buscarCantante() {
        System.out.println("Ingresa el nombre del cantante a buscar");
        String nombre = teclado.next();
        return nombre;
    }

    
    public void verCantante(Cantante cantante) {
        System.out.println("Datos del Cantante: " + cantante);
    }

    public void verCantantes(List<Cantante> cantantes) {
        for (Cantante cant : cantantes) {
            System.out.println("Datos de los cantantes: " + cant);
        }
    }
    
    public String buscarPorDisco(){
        System.out.println("Ingrese el nombre del disco: ");
        String nomdis = teclado.next();
        return nomdis;
    }
}
