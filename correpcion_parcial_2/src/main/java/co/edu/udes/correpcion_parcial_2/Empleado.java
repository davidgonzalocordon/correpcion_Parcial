/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.correpcion_parcial_2;

/**
 *
 * @author cordo
 */
public class Empleado {

    private String name;
    private String apellidos;
    private String DNI;
    private String Direccion;
    private int antiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado() {
    }

    public Empleado(String name, String apellidos, String DNI, String Direccion, String telefono, double salario) {
        this.name = name;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public double aumentarSalario(double porcentaje) {
        double aumento = this.salario * (porcentaje / 100);
        double newSalario = this.salario + aumento;
        return newSalario;
    }

    public Empleado asignarSupervisor(Empleado supervisor) {
        return this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Empleado{" + "name=" + name + ", apellidos=" + apellidos + ", DNI=" + DNI + ", Direccion=" + Direccion + ", antiguedad=" + antiguedad + ", telefono=" + telefono + ", salario=" + salario + ", supervisor=" + supervisor + '}';
    }

}
