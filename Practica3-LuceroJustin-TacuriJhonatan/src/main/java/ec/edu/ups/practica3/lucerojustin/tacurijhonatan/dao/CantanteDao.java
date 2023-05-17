/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cancion;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Disco;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao.ICantanteDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CantanteDao implements ICantanteDao {
    
    private List<Cantante> listaCantantes;

    public CantanteDao() {
        listaCantantes = new ArrayList<>();
    }
    

    @Override
    public void create(Cantante cantante) {
        listaCantantes.add(cantante);
    }

    @Override
    public Cantante read(String nombre) {
        for (Cantante cantante : listaCantantes) {
            if (cantante.getNombreArtistico().equals(nombre)) {
                return cantante;
            }
        }
        return null;
    }

    @Override
    public void update(String nombreArt,String nombreCAmb , String apellidoCam) {
        for (Cantante listaCantante : listaCantantes) {
            if (listaCantante.getNombreArtistico().equals(nombreArt)){
                listaCantante.setNombre(nombreCAmb);
                listaCantante.setApellido(apellidoCam);
            }
            
        }
    }

    @Override
    public void delete(Cantante cantante) {
        Iterator<Cantante> it = listaCantantes.iterator();
        while (it.hasNext()) {
            Cantante d = it.next();
            if (d.getNombre()== cantante.getNombre()) {
                it.remove();
                break;
            }
        }
    }
    
    @Override
    public Cantante buscarPorNombreDeDisco(String valor) {
        for(Cantante cantante : listaCantantes){
            if(cantante instanceof Cantante){
                for(Disco disco : cantante.getDiscos()){
                    if(disco.getNombre().equals(valor)){
                        System.out.println("Cantante: " + cantante.getNombreArtistico());
                        return cantante;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public List<Cantante> findAll() {
        return listaCantantes;
    }
    
}
