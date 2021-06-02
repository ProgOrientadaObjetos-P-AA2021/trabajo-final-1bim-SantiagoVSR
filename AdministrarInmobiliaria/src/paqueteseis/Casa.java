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
public class Casa implements Serializable {
    private Propietario propietario;
    private double preccioMetrosCuadrado;
    private int numMetrosCuadrado;
    private double costoFinal;
    private Ubicacion ubicacion;
    private Ciudad ciudad;
    private int numCuartos;
    private Constructora constructora;

    public Casa(Propietario pro, double precM, int numM,
            Ubicacion ubi, Ciudad ciu, int numC, Constructora cons) {
        propietario = pro;
        preccioMetrosCuadrado = precM;
        numMetrosCuadrado = numM;
        ubicacion = ubi;
        ciudad = ciu;
        numCuartos = numC;
        constructora = cons;
    }

    public void establecerPropietario(Propietario n) {
        propietario = n;
    }

    public void establecerPrecMetCuadrado(double n) {
        preccioMetrosCuadrado = n;
    }

    public void establecerNumMetCuadrado(int n) {
        numMetrosCuadrado = n;
    }

    public void establecerCostFinal() {
        costoFinal = numMetrosCuadrado * preccioMetrosCuadrado;
    }

    public void establecerUbicacion(Ubicacion n) {
        ubicacion = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void establecerNumCuartos(int n) {
        numCuartos = n;
    }

    public void establecerConstructora(Constructora n) {
        constructora = n;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerPrecMetCuadrado() {
        return preccioMetrosCuadrado;
    }

    public int obtenerNumMetroCuadrado() {
        return numMetrosCuadrado;
    }

    public double obtenerCostFinal() {
        return costoFinal;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumCuartos() {
        return numCuartos;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

}
