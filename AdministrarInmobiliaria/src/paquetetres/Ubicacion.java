/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;
import java.io.Serializable;
/**
 *
 * @author reroes
 */
public class Ubicacion implements Serializable {
    private String numeroCasa;
    private String nomBarrio;
    private String referencia;
    public Ubicacion(){
        
    }
    
    public Ubicacion(String numC, String n, String f){
        numeroCasa = numC;
        nomBarrio = n;
        referencia = f;
    }
    
    public void establecerNumeroCasa(String n) {
        numeroCasa = n;
    }

    public void establecerNombreBarrio(String n) {
        nomBarrio = n;
    }

    public void establecerReferencia(String n) {
        referencia = n;
    }

    public String obtenerNumeroCasa() {
        return numeroCasa;
    }

    public String obtenerNombreBarrio() {
        return nomBarrio;
    }

    public String obtenerReferencia() {
        return referencia;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Datos referentes a la Ubicacion\n"
                + "Número de casa: %s\n"
                + "Nombre del barrio: %s\n"
                + "Referencia: %s\n",
                obtenerNumeroCasa(),
                obtenerNombreBarrio(),
                obtenerReferencia());
        return cadena;
    }
}
