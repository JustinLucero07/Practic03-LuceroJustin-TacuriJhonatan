/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.controlador;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao.CancionDao;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao.CompositorDao;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista.VistaCancion;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista.VistaCompositor;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Compositor;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao.CantanteDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author venot
 */
public class ControladorCompositor {
    private VistaCompositor vistaCompositor;
    private CompositorDao compositorDao;
    private VistaCancion vistaCancion;
    private CancionDao cancioDao;
    private Compositor compositor;
    private Cantante cantante;

    public ControladorCompositor(VistaCompositor vistaCompositor, CompositorDao compositorDao, VistaCancion vistaCancion, CancionDao cancioDao) {
        this.vistaCompositor = vistaCompositor;
        this.compositorDao = compositorDao;
        this.vistaCancion = vistaCancion;
        this.cancioDao = cancioDao;
    }
    
    
    public void ingresarComposi(){
        Compositor com = vistaCompositor.ingresarCompositor();
        compositorDao.create(com);
    }
    public void verCompositor(){
        String nombre = vistaCompositor.buscarCompositor();
        compositor = compositorDao.read(nombre);
        vistaCompositor.verComposit(compositor);
        
    }
    public void verCompositores(){
        List<Compositor> compositores;
        compositores = compositorDao.findAll();
        vistaCompositor.verCompositores(compositores);
    }
    
    public void actualizarCompositor(){
        List<String> a= new ArrayList<>();
        a = vistaCompositor.actualizarCompositor();
        String nombre = (String) a.get(0);
        String nombreCamb = (String)a.get(1);
        String apellidoCamb = (String)a.get(2);
        compositorDao.update(nombre, nombreCamb, apellidoCamb);
    }
    public void elimininarCompo(){
        String nombre = vistaCompositor.eliminarCompositor();
        compositorDao.delete(compositorDao.read(nombre));
        
    }
    
    public void buscarPorCancion(){
        String nombre = vistaCompositor.buscarporcancion();
        compositorDao.buscarPorTituloDeCancion(nombre);
    }
    
    public void agregarClienteCan(){
        CantanteDao cant = new CantanteDao();
        String nombre = vistaCompositor.agregarCliente1();
        compositor = compositorDao.read(nombre);
        if(compositor == null){
            System.out.println("El compositor no existe: ");
        }else if(compositor != null){
            String ncan = vistaCompositor.agregarCliente2();
            cantante = cant.read(ncan);
            if(cantante == null){
                System.out.println("El cantante no existe");
            }else if(cantante != null){
                System.out.println("El cantante se agrego exitosamente");
                compositor.agregarClientE(cantante);
            }
        }
    }
}
