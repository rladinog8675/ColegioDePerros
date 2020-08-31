package colegiodeperros;

import java.io.Serializable;

public class Perro implements Serializable{
    private int codigo;
    private String nombre;
    private String raza;
    private String localidad;
    private int celdulaDueno;
    private String nombreDueno;

    public Perro(int codigo, String nombre, String raza, String localidad, int celdulaDueno, String nombreDueno) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.localidad = localidad;
        this.celdulaDueno = celdulaDueno;
        this.nombreDueno = nombreDueno;
    }
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCeldulaDueno() {
        return celdulaDueno;
    }

    public void setCeldulaDueno(int celdulaDueno) {
        this.celdulaDueno = celdulaDueno;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
}
