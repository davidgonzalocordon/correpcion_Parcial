/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.correpcion_parcial_2;

import java.util.ArrayList;

/**
 *
 * @author cordo
 */
class JefeDeZona extends Empleado {

    private String despacho;
    private Secretario secretario;
    private ArrayList<Vendedor> listaVendedores;
    private Coche coche;

    public JefeDeZona() {
    }

    public JefeDeZona(String despacho, Secretario secretario, ArrayList<Vendedor> listaVendedores, Coche coche, String name, String apellidos, String DNI, String Direccion, String telefono, double salario) {
        super(name, apellidos, DNI, Direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.listaVendedores = listaVendedores;
        this.coche = coche;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void CAmbiarCoche(String id_matricula, String marca, String modelo) {
        Coche newCoche = new Coche(id_matricula, marca, modelo);
        this.setCoche(newCoche);
        System.out.println("coche cambiado");
    }

    public void agregarVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
        System.out.println("Nuevo vendedor agregado con éxito.");
    }

    public void eliminarVendedor(String dniVendedor) {
        for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getDNI().equals(dniVendedor)) {
                listaVendedores.remove(vendedor);
                System.out.println("Cliente eliminado con éxito.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public double aumentarSalario() {
        double aumento = this.getSalario() * 0.2;
        double nuevoSalario = this.getSalario() + aumento;
        this.setSalario(nuevoSalario);
        return nuevoSalario;
    }

}
