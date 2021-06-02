/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;
import java.io.Serializable;
import paquetecinco.Constructora;
import paquetecuatro.Ciudad;
import paquetedos.Propietario;
import paquetetres.Ubicacion;
/**
 *
 * @author reroes
 */
public class Departamento {
    private Propietario propietario; 
    private double precioMetroCuadrado; 
    private int numMettroCuadrado; 
    private double valMensual;
    private double costoFinal; 
    private double precio; 
    private Ubicacion ubicacion; 
    private Ciudad ciudad; 
    private String nomEdificio; 
    private String ubiDepartamento; 
    private Constructora constructora; 

    public Departamento(Propietario pro, double pm, int numM, double valm, double p, 
            Ubicacion ubi, Ciudad ciu, String numE, String ubiD, Constructora cons) {
        propietario = pro;
        precioMetroCuadrado =pm;
        numMettroCuadrado = numM;
        valMensual = valm;
        precio = p;
        ubicacion =ubi;
        ciudad = ciu;
        nomEdificio = numE;
        ubiDepartamento = ubiD;
        constructora = cons;
    }

    public void establecerPropietario(Propietario n) {
        propietario = n;
    }

    public void establecerPrecMetCuadrado(double n) {
        precioMetroCuadrado = n;
    }

    public void establecerNumMetCuadrado(int n) {
        numMettroCuadrado = n;
    }

    public void establecerValAliMensual(double n) {
        valMensual = n;
    }

    public void establecerCostoFinal() {
        costoFinal = (numMettroCuadrado * precioMetroCuadrado) + (valMensual * 12);
    }

    public void establecerPrecio(double n) {
        precio = n;
    }

    public void establecerUbicacion(Ubicacion n) {
        ubicacion = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void establecerNomEdificio(String n) {
        nomEdificio = n;
    }

    public void establecerUbiDepartamento(String n) {
        ubiDepartamento = n;
    }

    public void establecerConstructora(Constructora n) {
        constructora = n;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerPrecMetCuadrado() {
        return precioMetroCuadrado;
    }

    public int obtenerNumMetCuadrado() {
        return numMettroCuadrado;
    }

    public double obtenerValAliMensual() {
        return valMensual;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public String obtenerNomEdificio() {
        return nomEdificio;
    }

    public String obtenerUbiDepartamento() {
        return ubiDepartamento;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }
}
