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
class Vendedor extends Empleado {

    private Coche coche;
    private String area_venta;
    private ArrayList<Clintes> listaClientes;
    private float porcentaje_comision;

    public Vendedor() {
        super();
    }

    public Vendedor(Coche coche, String area_venta, ArrayList<Clintes> listaClientes, float porcentaje_comision, String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.coche = coche;
        this.area_venta = area_venta;
        this.listaClientes = listaClientes;
        this.porcentaje_comision = porcentaje_comision;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getArea_venta() {
        return area_venta;
    }

    public void setArea_venta(String area_venta) {
        this.area_venta = area_venta;
    }

    public ArrayList<Clintes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Clintes> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public float getPorcentaje_comision() {
        return porcentaje_comision;
    }

    public void setPorcentaje_comision(int porcentaje_comision) {
        this.porcentaje_comision = porcentaje_comision;
    }

    public double aumentarSalario() {
        double aumento = this.getSalario() * 0.1;
        double nuevoSalario = this.getSalario() + aumento;
        this.setSalario(nuevoSalario);
        return nuevoSalario;
    }

    public void agregarCliente(Clintes cliente) {
        listaClientes.add(cliente);
        System.out.println("Nuevo cliente agregado con éxito.");
    }
    
    public void CAmbiarCoche(String id_matricula, String marca,String modelo) {
        Coche newCoche= new Coche(id_matricula, marca, modelo);
        this.setCoche(newCoche);
        System.out.println("coche cambiado");
    }

    public void eliminarCliente(String dniCliente) {
        for (Clintes cliente : listaClientes) {
            if (cliente.getDni().equals(dniCliente)) {
                listaClientes.remove(cliente);
                System.out.println("Cliente eliminado con éxito.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Coche: " + coche + ", Área de venta: " + area_venta + ", Lista de clientes: " + listaClientes + ", Porcentaje de comisión: " + porcentaje_comision + "%";
    }
}
