/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;
import java.io.Serializable;
/**
 *
 * @author reroes
 */
public class Constructora implements Serializable {
    private String nombreConstructora;
    private String idEmpresa;
    
    public Constructora(){
    }
    
    public Constructora(String c, String id){
        nombreConstructora = c;
        idEmpresa = id;
    }
    
    
    public void establecerNombreConstructora(String c){
        nombreConstructora = c;
    }
    
    public void establecerIdEmpresa(String c){
        idEmpresa = c;
    }
    
    public String obtenerNombreConstructora(){
        return nombreConstructora;
    }
    
    public String obtenerIdEmpresa(){
        return idEmpresa;
    }
}
