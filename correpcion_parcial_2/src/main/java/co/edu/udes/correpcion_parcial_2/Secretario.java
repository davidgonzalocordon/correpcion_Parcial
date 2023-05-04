/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.correpcion_parcial_2;

/**
 *
 * @author cordo
 */
class Secretario extends Empleado {

    private String despacho;
    private String Num_fax;

    public Secretario() {
    }

    public Secretario(String despacho, String Num_fax, String name, String apellidos, String DNI, String Direccion, String telefono, double salario) {
        super(name, apellidos, DNI, Direccion, telefono, salario);
        this.despacho = despacho;
        this.Num_fax = Num_fax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getNum_fax() {
        return Num_fax;
    }

    public void setNum_fax(String Num_fax) {
        this.Num_fax = Num_fax;
    }

    public double aumentarSalario() {
        double aumento = this.getSalario() * 0.05;
        double nuevoSalario = this.getSalario() + aumento;
        this.setSalario(nuevoSalario);
        return nuevoSalario;
    }

    @Override
    public String toString() {
        return "Secretario{" + "despacho=" + despacho + ", Num_fax=" + Num_fax + '}';
    }

}
