/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.correpcion_parcial_2;

/**
 *
 * @author cordo
 */
public class Coche {
    private String id_matricula;
    private String marca;
    private String modelo; 

    public Coche(String id_matricula, String marca, String modelo) {
        this.id_matricula = id_matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche() {
    }

    public String getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(String id_matricula) {
        this.id_matricula = id_matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
