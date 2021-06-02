/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;
import java.io.Serializable;
/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable {
    private String nombreCiudad;
    private String nombreProvincia;
    
    
    public Ciudad(String c, String pro){
        nombreCiudad = c;
        nombreProvincia = pro;
    }
    public Ciudad(){
    }
    public void establecerNombreCiudad(String c){
        nombreCiudad = c;
    }
    
    public void establecerNombreProvincia(String p){
        nombreProvincia = p;
    }
    
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
}
